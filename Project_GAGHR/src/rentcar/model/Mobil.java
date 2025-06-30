package rentcar.model;


public class Mobil {
    
    private int id;
    private String merk;
    private String tipe;
    private int tahun;
    private double hargaSewa;
    private String status;

    // Getter dan Setter
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getMerk() { return merk; }
    public void setMerk(String merk) { this.merk = merk; }

    public String getTipe() { return tipe; }
    public void setTipe(String tipe) { this.tipe = tipe; }

    public int getTahun() { return tahun; }
    public void setTahun(int tahun) { this.tahun = tahun; }

    public double getHargaSewa() { return hargaSewa; }
    public void setHargaSewa(double hargaSewa) { this.hargaSewa = hargaSewa; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    
}
