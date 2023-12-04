
package hdt.petshopproject.model;

public class hoaDon {
    private int idHD;
    private String TenKH;
    private String ngTao;
    private long thanhTien;

    public int getIdHD() {
        return idHD;
    }

    public void setIdHD(int idHD) {
        this.idHD = idHD;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public String getNgTao() {
        return ngTao;
    }

    public void setNgTao(String ngTao) {
        this.ngTao = ngTao;
    }

    public long getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(long thanhTien) {
        this.thanhTien = thanhTien;
    }

    public hoaDon() {
    }

    public hoaDon(int idHD, String TenKH, String ngTao, long thanhTien) {
        this.idHD = idHD;
        this.TenKH = TenKH;
        this.ngTao = ngTao;
        this.thanhTien = thanhTien;
    }
    
    
}
