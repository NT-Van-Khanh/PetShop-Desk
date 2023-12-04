
package hdt.petshopproject.DAO;


import hdt.petshopproject.model.hoaDon;
import hdt.petshopproject.util.helper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class hoaDon_List {
     public List<hoaDon> getAll() throws Exception{
        String sql = "SELECT Bill.ID_HD as iD, CONCAT(khachHang.ho, ' ', khachHang.ten) AS HoTen, Bill.NgMua as ngayMua, SUM(chiTietDonHang.soLuong * hangHoa.giaTien) AS tongTien FROM Bill JOIN khachHang ON Bill.ID_KH = khachHang.ID JOIN chiTietDonHang ON chiTietDonHang.ID_HD = Bill.ID_HD JOIN hangHoa ON hangHoa.ID = chiTietDonHang.ID_HH GROUP BY Bill.ID_HD, CONCAT(khachHang.ho, ' ', khachHang.ten), Bill.NgMua order by Bill.ID_HD";
        List<hoaDon> listHD = new ArrayList<>();
        try (
            Connection con = helper.openConnection(); 
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);) {
            while (rs.next()) {
                hoaDon hd = new hoaDon();
                hd.setIdHD(Integer.parseInt(rs.getString("iD")));
                hd.setTenKH(rs.getString("hoTen"));
                hd.setNgTao(rs.getString("ngayMua"));
                hd.setThanhTien(Integer.parseInt(rs.getString("tongTien")));
                listHD.add(hd);
            }
            return listHD;
        }
    }
    
//    //them hoa don
//    public boolean insert(hoaDon hd) throws Exception{
//        String sql = "insert into hangDon(ID_HD,ID_HH, ID_NV, ID_KH, soLuong) values (?,?,?,?,?);";
//        try (
//                Connection con = helper.openConnection();  
//                PreparedStatement pstm = con.prepareStatement(sql);) 
//        {
//            pstm.setString(1, String.valueOf(hd.getIdHD()));
//            pstm.setString(2,String.valueOf(hd.getIdHH()));
//            pstm.setString(3, String.valueOf(hd.getIdNV()));
//            pstm.setString(4,String.valueOf(hd.getIdKH()));
//            pstm.setString(5,String.valueOf(hd.getSoLuong()));
//            return pstm.executeUpdate() > 0;
//        }
//    }
    
//    //cap nhat hoa don
//    public boolean update(hoaDon hd) throws Exception {
//        String sql = "Update hoaDon set ID_HD=?, ID_HH=?, ID_NV=?, ID_KH=?, soLuong=?";
//        try (
//                Connection con = helper.openConnection();  
//                PreparedStatement pstm = con.prepareStatement(sql);) 
//        {
//            pstm.setString(1, String.valueOf(hd.getIdHD()));
//            pstm.setString(2,String.valueOf(hd.getIdHH()));
//            pstm.setString(3, String.valueOf(hd.getIdNV()));
//            pstm.setString(4,String.valueOf(hd.getIdKH()));
//            pstm.setString(5,String.valueOf(hd.getSoLuong()));
//            return pstm.executeUpdate() > 0;
//        }
//    }
    
    // tim kiem theo ten
    public List<hoaDon> findByTen(String ten) throws Exception {
        String sql = "SELECT Bill.ID_HD as iD, CONCAT(khachHang.ho, ' ', khachHang.ten) AS HoTen, Bill.NgMua as ngayMua, SUM(chiTietDonHang.soLuong * hangHoa.giaTien) AS tongTien FROM Bill JOIN khachHang ON Bill.ID_KH = khachHang.ID JOIN chiTietDonHang ON chiTietDonHang.ID_HD = Bill.ID_HD JOIN hangHoa ON hangHoa.ID = chiTietDonHang.ID_HH where concat(lower(khachHang.ho),' ', lower(khachHang.ten)) like ? GROUP BY Bill.ID_HD, CONCAT(khachHang.ho, ' ', khachHang.ten), Bill.NgMua;";
        List<hoaDon> listHD = new ArrayList<>();
       try (
                Connection con = helper.openConnection();  
                PreparedStatement pstm = con.prepareStatement(sql);) 
        {
            pstm.setString(1, "%" + ten + "%");
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                hoaDon hd = new hoaDon();
                hd.setIdHD(Integer.parseInt(rs.getString("iD")));
                hd.setTenKH(rs.getString("hoTen"));
                hd.setNgTao(rs.getString("ngayMua"));
                hd.setThanhTien(Integer.parseInt(rs.getString("tongTien")));
                listHD.add(hd);
            }
            return listHD;  
        }
    }
    
    
    //xoa hoa don
    public boolean delete(int id) throws Exception {
        String sql = "delete from hoaDon where id= ?";
        try (
            Connection con = helper.openConnection();  
            PreparedStatement pstm = con.prepareStatement(sql);) 
        {
            pstm.setString(1, String.valueOf(id));
            return pstm.executeUpdate() > 0;
            
        }

    }
    
    public List<hoaDon> sapXepTen() throws Exception{
        String sql = "SELECT Bill.ID_HD as iD, CONCAT(khachHang.ho, ' ', khachHang.ten) AS HoTen, Bill.NgMua as ngayMua, SUM(chiTietDonHang.soLuong * hangHoa.giaTien) AS tongTien FROM Bill JOIN khachHang ON Bill.ID_KH = khachHang.ID JOIN chiTietDonHang ON chiTietDonHang.ID_HD = Bill.ID_HD JOIN hangHoa ON hangHoa.ID = chiTietDonHang.ID_HH GROUP BY Bill.ID_HD, CONCAT(khachHang.ho, ' ', khachHang.ten), Bill.NgMua order by Bill.ID_HD  order by HoTen";
        List<hoaDon> listHD = new ArrayList<>();
        try (
            Connection con = helper.openConnection(); 
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);) {
            while (rs.next()) {
                hoaDon hd = new hoaDon();
                hd.setIdHD(Integer.parseInt(rs.getString("iD")));
                hd.setTenKH(rs.getString("hoTen"));
                hd.setNgTao(rs.getString("ngayMua"));
                hd.setThanhTien(Integer.parseInt(rs.getString("tongTien")));
                listHD.add(hd);
            }
            return listHD;
        }
    }
}
