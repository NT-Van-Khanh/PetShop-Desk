
package hdt.petshopproject.DAO;

import hdt.petshopproject.model.Customer;
import hdt.petshopproject.util.helper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class khachHang_List {
    
    // lay toan danh sach
    public List<Customer> getAll() throws Exception {
        List<Customer> list_KH = new ArrayList<>();
        String sql = "select * from khachHang order by ID";
        try (
            Connection con = helper.openConnection(); 
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);) {
            while (rs.next()) {
                Customer ct = new Customer();
                ct.setID( Integer.parseInt(rs.getString("ID")));
                ct.setHoVaTen(rs.getString("ho") + " "+ rs.getString("ten"));
                ct.setDiaChi(rs.getString("diaChi"));
                ct.setSdt(rs.getString("sdt"));
                list_KH.add(ct);
            }
            return list_KH;
        }
    }
    
    //them khach hang
    public boolean insert(Customer ct) throws Exception{
        String sql = "insert into khachHang(ho, ten, diaChi, sdt) values (?,?,?,?);";
        try (
                Connection con = helper.openConnection();  
                PreparedStatement pstm = con.prepareStatement(sql);) 
        {
            String[] hoTen = ct.getHoVaTen().split(" ");
            pstm.setString(1, String.join(" ",Arrays.copyOfRange(hoTen,0,hoTen.length-1)));
            pstm.setString(2,hoTen[hoTen.length -1]);
            pstm.setString(3, ct.getDiaChi());
            pstm.setString(4,ct.getSdt());
            return pstm.executeUpdate() > 0;
        }
    }
    
    // update KhachHang
    public boolean update(Customer ct) throws Exception {
        String sql = "Update khachHang set ho = ?, ten = ?, diaChi = ?, sdt = ? where ID = ?";
        try (
                Connection con = helper.openConnection();  
                PreparedStatement pstm = con.prepareStatement(sql);) 
        {
             String[] hoTen = ct.getHoVaTen().split(" ");
            pstm.setString(1,String.join(" ",Arrays.copyOfRange(hoTen,0,hoTen.length-1)));
            pstm.setString(2, hoTen[hoTen.length-1]);
            pstm.setString(3, ct.getDiaChi());
            pstm.setString(4, ct.getSdt());
            pstm.setString(5, String.valueOf(ct.getID()));
            return pstm.executeUpdate() > 0;
        }
    }
    
    // tim kiem theo ten
    public List<Customer> findByTen(String ten) throws Exception {
        String sql = "select * from khachHang where concat(lower(ho),' ', lower(ten)) like ?";
        try (
                Connection con = helper.openConnection();  
                PreparedStatement pstm = con.prepareStatement(sql);) 
        {
            pstm.setString(1, "%" + ten + "%");
            ResultSet rs = pstm.executeQuery();
            List<Customer> list = new ArrayList<>();
            while (rs.next()) {
                Customer ct = new Customer();
                ct.setID( Integer.parseInt(rs.getString("ID")));
                ct.setHoVaTen(rs.getString("ho")+ " " + rs.getString("ten"));
                ct.setDiaChi(rs.getString("diaChi"));
                ct.setSdt(rs.getString("sdt"));
                list.add(ct);
            }        
            return list;   
        }
    }
    
    // tim kiem theo ID
    public Customer findByID( int ID) throws Exception {
        String sql = "select * from khachHang where ID = ?";
        try (
                Connection con = helper.openConnection();  
                PreparedStatement pstm = con.prepareStatement(sql);) 
        {
            pstm.setString(1, String.valueOf(ID));
            ResultSet rs = pstm.executeQuery();
            Customer ct = new Customer();
            if (rs.next()) {
                ct.setID( Integer.parseInt(rs.getString("ID")));
                ct.setHoVaTen(rs.getString("ho")+ " " + rs.getString("ten"));
                ct.setDiaChi(rs.getString("diaChi"));
                ct.setSdt(rs.getString("sdt"));
            }        
            return ct;   
        }
    }
    //xoa khach hang
    public boolean delete(int id) throws Exception {
        String sql = "delete from khachHang where id= ?";
        try (
            Connection con = helper.openConnection();  
            PreparedStatement pstm = con.prepareStatement(sql);) 
        {
            pstm.setString(1, String.valueOf(id));
            return pstm.executeUpdate() > 0;
            
        }

    }
    
    //sap xep theo ID
    public List<Customer> sapXepID() throws Exception{
        List<Customer> list_KH = new ArrayList<>();
        String sql = "select * from khachHang order by ID";
        try (
            Connection con = helper.openConnection(); 
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);) {
            while (rs.next()) {
                Customer ct = new Customer();
                ct.setID( Integer.parseInt(rs.getString("ID")));
                ct.setHoVaTen(rs.getString("ho") + " " + rs.getString("ten"));
                ct.setDiaChi(rs.getString("diaChi"));
                ct.setSdt(rs.getString("sdt"));
                list_KH.add(ct);
            }
            return list_KH;
        }
    }
    
    // sap xep theo Ten
    public List<Customer> sapXepTen() throws Exception{
        List<Customer> list_KH = new ArrayList<>();
        String sql = "select * from khachHang order by Ten";
        try (
            Connection con = helper.openConnection(); 
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);) {
            while (rs.next()) {
                Customer ct = new Customer();
                ct.setID( Integer.parseInt(rs.getString("ID")));
                ct.setHoVaTen(rs.getString("ho") + " " + rs.getString("ten"));
                ct.setDiaChi(rs.getString("diaChi"));
                ct.setSdt(rs.getString("sdt"));
                list_KH.add(ct);
            }
            return list_KH;
        }
    }
}
