
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
        String sql = "select * from hoaDon;";
        List<hoaDon> listHD = new ArrayList<>();
        try (
            Connection con = helper.openConnection(); 
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);) {
            while (rs.next()) {
                hoaDon hd = new hoaDon();
                hd.setIdHD(Integer.parseInt(rs.getString("ID_HD")));
                hd.setIdHH(Integer.parseInt(rs.getString("ID_HH")));
                hd.setIdKH(Integer.parseInt(rs.getString("ID_KH")));
                hd.setIdNV(Integer.parseInt(rs.getString("ID_NV")));
                hd.setSoLuong(Integer.parseInt(rs.getString("soLuong")));
                listHD.add(hd);
            }
            return listHD;
        }
    }
    
    //them hoa don
    public boolean insert(hoaDon hd) throws Exception{
        String sql = "insert into hangDon(ID_HD,ID_HH, ID_NV, ID_KH, soLuong) values (?,?,?,?,?);";
        try (
                Connection con = helper.openConnection();  
                PreparedStatement pstm = con.prepareStatement(sql);) 
        {
            pstm.setString(1, String.valueOf(hd.getIdHD()));
            pstm.setString(2,String.valueOf(hd.getIdHH()));
            pstm.setString(3, String.valueOf(hd.getIdNV()));
            pstm.setString(4,String.valueOf(hd.getIdKH()));
            pstm.setString(5,String.valueOf(hd.getSoLuong()));
            return pstm.executeUpdate() > 0;
        }
    }
    
    //cap nhat hoa don
    public boolean update(hoaDon hd) throws Exception {
        String sql = "Update hoaDon set ID_HD=?, ID_HH=?, ID_NV=?, ID_KH=?, soLuong=?";
        try (
                Connection con = helper.openConnection();  
                PreparedStatement pstm = con.prepareStatement(sql);) 
        {
            pstm.setString(1, String.valueOf(hd.getIdHD()));
            pstm.setString(2,String.valueOf(hd.getIdHH()));
            pstm.setString(3, String.valueOf(hd.getIdNV()));
            pstm.setString(4,String.valueOf(hd.getIdKH()));
            pstm.setString(5,String.valueOf(hd.getSoLuong()));
            return pstm.executeUpdate() > 0;
        }
    }
    
    // tim kiem theo ten
    public hoaDon findByTen(int id) throws Exception {
        String sql = "select * from hoaDon where ID_HD=?";
        try (
                Connection con = helper.openConnection();  
                PreparedStatement pstm = con.prepareStatement(sql);) 
        {
            pstm.setString(1, String.valueOf(id));
            ResultSet rs = pstm.executeQuery();
            hoaDon hd = new hoaDon();
            if (rs.next()) {
                hd.setIdHD(Integer.parseInt(rs.getString("ID_HD")));
                hd.setIdHH(Integer.parseInt(rs.getString("ID_HH")));
                hd.setIdKH(Integer.parseInt(rs.getString("ID_KH")));
                hd.setIdNV(Integer.parseInt(rs.getString("ID_NV")));
                hd.setSoLuong(Integer.parseInt(rs.getString("soLuong")));
                return hd;
            }        
            return null;   
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
}
