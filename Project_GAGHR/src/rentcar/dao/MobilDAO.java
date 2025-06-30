package rentcar.dao;

import rentcar.config.DatabaseConnect;
import rentcar.model.Mobil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MobilDAO {
    private final Connection conn;

    public MobilDAO() {
        conn = DatabaseConnect.connect();
    }

    public List<Mobil> getAllMobil() {
        List<Mobil> list = new ArrayList<>();
        String sql = "SELECT * FROM mobil";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Mobil m = new Mobil();
                m.setId(rs.getInt("id"));
                m.setMerk(rs.getString("merk"));
                m.setTipe(rs.getString("tipe"));
                m.setTahun(rs.getInt("tahun"));
                m.setHargaSewa(rs.getDouble("harga_sewa"));
                m.setStatus(rs.getString("status"));
                list.add(m);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public Mobil findById(int id) {
        String sql = "SELECT * FROM mobil WHERE id = ?";
        try (Connection conn = DatabaseConnect.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Mobil m = new Mobil();
                m.setId(rs.getInt("id"));
                m.setMerk(rs.getString("merk"));
                m.setTipe(rs.getString("tipe"));
                m.setTahun(rs.getInt("tahun"));
                m.setHargaSewa(rs.getDouble("harga_sewa"));
                m.setStatus(rs.getString("status"));
                return m;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean insertMobil(Mobil m) {
        String sql = "INSERT INTO mobil (merk, tipe, tahun, harga_sewa, status) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, m.getMerk());
            ps.setString(2, m.getTipe());
            ps.setInt(3, m.getTahun());
            ps.setDouble(4, m.getHargaSewa());
            ps.setString(5, m.getStatus());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean updateMobil(Mobil m) {
        String sql = "UPDATE mobil SET merk=?, tipe=?, tahun=?, harga_sewa=?, status=? WHERE id=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, m.getMerk());
            ps.setString(2, m.getTipe());
            ps.setInt(3, m.getTahun());
            ps.setDouble(4, m.getHargaSewa());
            ps.setString(5, m.getStatus());
            ps.setInt(6, m.getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean deleteMobil(int id) {
        String sql = "DELETE FROM mobil WHERE id=?";
        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
