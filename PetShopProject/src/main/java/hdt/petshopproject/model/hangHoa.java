
package hdt.petshopproject.model;


public class hangHoa {
    private int ID;
    private String ten;
    private String loai;
    private int soluong;
    private int giaTien;
    private boolean gioiTinh;
    private String ngNhap;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgNhap() {
        return ngNhap;
    }

    public void setNgNhap(String ngNhap) {
        this.ngNhap = ngNhap;
    }

    public hangHoa() {
    }

    public hangHoa(int ID, String ten, String loai, int soluong, int giaTien, boolean gioiTinh, String ngNhap) {
        this.ID = ID;
        this.ten = ten;
        this.loai = loai;
        this.soluong = soluong;
        this.giaTien = giaTien;
        this.gioiTinh = gioiTinh;
        this.ngNhap = ngNhap;
    }

    
    
}
