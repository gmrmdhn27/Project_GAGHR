package rentcar.model;

import java.util.Date;

public class Penyewaan {
    
    private int id;
    private int userId;
    private int mobilId;
    private Date tanggalSewa;
    private Date tanggalKembali;
    private double totalBayar;
    private String status;

    // Getter dan Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getUserId() { return userId; }
    public void setUserId(int userId) { this.userId = userId; }

    public int getMobilId() { return mobilId; }
    public void setMobilId(int mobilId) { this.mobilId = mobilId; }

    public Date getTanggalSewa() { return tanggalSewa; }
    public void setTanggalSewa(Date tanggalSewa) { this.tanggalSewa = tanggalSewa; }

    public Date getTanggalKembali() { return tanggalKembali; }
    public void setTanggalKembali(Date tanggalKembali) { this.tanggalKembali = tanggalKembali; }

    public double getTotalBayar() { return totalBayar; }
    public void setTotalBayar(double totalBayar) { this.totalBayar = totalBayar; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    
}
