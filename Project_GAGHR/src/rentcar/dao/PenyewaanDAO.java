package rentcar.dao;

import rentcar.config.DatabaseConnect;
import rentcar.model.Penyewaan;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PenyewaanDAO {
    private final Connection conn;

    public PenyewaanDAO() {
        conn = DatabaseConnect.connect();
    }

    public boolean insertPenyewaan(Penyewaan p) {
        String sql = "INSERT INTO penyewaan (user_id, mobil_id, tanggal_sewa, tanggal_kembali, total_bayar, status) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, p.getUserId());
            ps.setInt(2, p.getMobilId());
            ps.setDate(3, new java.sql.Date(p.getTanggalSewa().getTime()));
            ps.setDate(4, new java.sql.Date(p.getTanggalKembali().getTime()));
            ps.setDouble(5, p.getTotalBayar());
            ps.setString(6, p.getStatus());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Penyewaan> getAllPenyewaan() {
        List<Penyewaan> list = new ArrayList<>();
        String sql = "SELECT * FROM penyewaan";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Penyewaan p = new Penyewaan();
                p.setId(rs.getInt("id"));
                p.setUserId(rs.getInt("user_id"));
                p.setMobilId(rs.getInt("mobil_id"));
                p.setTanggalSewa(rs.getDate("tanggal_sewa"));
                p.setTanggalKembali(rs.getDate("tanggal_kembali"));
                p.setTotalBayar(rs.getDouble("total_bayar"));
                p.setStatus(rs.getString("status"));
                list.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
         
    public List<Penyewaan> getAllPenyewaanByUserId(int userId) {
        List<Penyewaan> list = new ArrayList<>();
        String sql = "SELECT * FROM penyewaan WHERE user_id = ? ORDER BY tanggal_sewa DESC";

        try (Connection conn = DatabaseConnect.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, userId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Penyewaan p = new Penyewaan();
                p.setId(rs.getInt("id"));
                p.setUserId(rs.getInt("user_id"));
                p.setMobilId(rs.getInt("mobil_id"));
                p.setTanggalSewa(rs.getDate("tanggal_sewa"));
                p.setTanggalKembali(rs.getDate("tanggal_kembali"));
                p.setTotalBayar(rs.getDouble("total_bayar"));
                p.setStatus(rs.getString("status"));

                list.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }


    public boolean updateStatus(int id, String status) {
        String sql = "UPDATE penyewaan SET status=? WHERE id=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, status);
            ps.setInt(2, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
