
package hdt.petshopproject.model;

public class hoaDon {
    private int idHD;
    private int idHH;
    private int idKH;
    private int idNV;
    private int soLuong;

    public int getIdHD() {
        return idHD;
    }

    public void setIdHD(int idHD) {
        this.idHD = idHD;
    }

    public int getIdHH() {
        return idHH;
    }

    public void setIdHH(int idHH) {
        this.idHH = idHH;
    }

    public int getIdKH() {
        return idKH;
    }

    public void setIdKH(int idKH) {
        this.idKH = idKH;
    }

    public int getIdNV() {
        return idNV;
    }

    public void setIdNV(int idNV) {
        this.idNV = idNV;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public hoaDon(int idHD, int idHH, int idKH, int idNV, int soLuong) {
        this.idHD = idHD;
        this.idHH = idHH;
        this.idKH = idKH;
        this.idNV = idNV;
        this.soLuong = soLuong;
    }

    public hoaDon() {
    }


    
}
