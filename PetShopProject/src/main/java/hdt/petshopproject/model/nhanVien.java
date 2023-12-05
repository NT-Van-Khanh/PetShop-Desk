
package hdt.petshopproject.model;

public class nhanVien {
   private int ID_NV;
   private String hoVaTen;
   private String diaChi;
   private boolean gioiTinh;
   private String taiKhoan;
   private String matKhau;
   private String ngSinh;
   private String sdt;
   private int Luong;

    public int getID_NV() {
        return ID_NV;
    }

    public int getLuong() {
        return Luong;
    }

    public void setLuong(int Luong) {
        this.Luong = Luong;
    }

    public void setID_NV(int ID_NV) {
        this.ID_NV = ID_NV;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTaiKhoan() {
        return taiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        this.taiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getNgSinh() {
        return ngSinh;
    }

    public void setNgSinh(String ngSinh) {
        this.ngSinh = ngSinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public nhanVien(int ID_NV, String hoVaTen, String diaChi, boolean gioiTinh, String taiKhoan, String matKhau, String ngSinh, String sdt) {
        this.ID_NV = ID_NV;
        this.hoVaTen = hoVaTen;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.taiKhoan = taiKhoan;
        this.matKhau = matKhau;
        this.ngSinh = ngSinh;
        this.sdt = sdt;
    }

    public nhanVien() {
    }
    
   
}
