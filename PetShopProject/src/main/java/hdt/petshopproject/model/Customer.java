
package hdt.petshopproject.model;

public class Customer {
    private int ID;
    private String hoVaTen;
    private String diaChi;
    private String sdt;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public Customer(int ID, String hoVaTen, String diaChi, String sdt) {
        this.ID = ID;
        this.hoVaTen = hoVaTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }
    public Customer(){}
}
