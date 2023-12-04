
package hdt.petshopproject.DAO;

import hdt.petshopproject.model.Customer;
import hdt.petshopproject.model.nhanVien;
import hdt.petshopproject.util.helper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class nhanVien_List {
    public List<nhanVien> getAll() throws Exception{
        String sql = "select * from nhanVien order by ID";
        List<nhanVien> listNV = new ArrayList<>();
        try (
            Connection con = helper.openConnection(); 
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);) {
            while (rs.next()) {
                nhanVien nv = new nhanVien();
                nv.setHoVaTen(rs.getString("ho") + rs.getString("ten"));
                if( rs.getString("gioiTinh").equals("1")){
                    nv.setGioiTinh(true);
                }else nv.setGioiTinh(false);
                nv.setDiaChi(rs.getString("diaChi"));
                nv.setMatKhau(rs.getString("matKhau"));
                nv.setNgSinh(rs.getString("ngSinh"));
                nv.setSdt(rs.getString("sdt"));
                nv.setTaiKhoan(rs.getString("taiKhoan"));
                listNV.add(nv);
            }
            return listNV;
        }
    }
    
    //them nhanVien
    public boolean insert(nhanVien nv) throws Exception{
        String sql = "insert into nhanVien(ho, ten, diaChi, sdt, taiKhoan, matKhau, ngSinh) values (?,?,?,?,?,?,?);";
        try (
                Connection con = helper.openConnection();  
                PreparedStatement pstm = con.prepareStatement(sql);) 
        {
            String[] hoTen = nv.getHoVaTen().split(" ");
            pstm.setString(1, String.join(" ", Arrays.copyOfRange(hoTen, 0, hoTen.length-2)));
            pstm.setString(2,hoTen[hoTen.length -1]);
            pstm.setString(3, nv.getDiaChi());
            pstm.setString(4,nv.getSdt());
            pstm.setString(5,nv.getTaiKhoan());
            pstm.setString(6, nv.getMatKhau());
            pstm.setString(7,nv.getNgSinh());
            return pstm.executeUpdate() > 0;
        }
    }
    
    //update nhan vien
    public boolean update(nhanVien nv) throws Exception {
        String sql = "Update nhanVien set ho = ?, ten = ?, diaChi = ?, sdt = ?, taiKhoan = ?, matKhau = ?, ngSinh = ?;";
        try (
                Connection con = helper.openConnection();  
                PreparedStatement pstm = con.prepareStatement(sql);) 
        {
             String[] hoTen = nv.getHoVaTen().split(" ");
            pstm.setString(1,String.join(" ",Arrays.copyOfRange(hoTen,0,hoTen.length-2)));
            pstm.setString(2, hoTen[hoTen.length-1]);
            pstm.setString(3, nv.getDiaChi());
            pstm.setString(4, nv.getSdt());
            pstm.setString(5, nv.getTaiKhoan());
            pstm.setString(6, nv.getMatKhau());
            pstm.setString(7, nv.getNgSinh());
            return pstm.executeUpdate() > 0;
        }
    }
    
    // tim kiem theo ten
    public List<nhanVien> findByTen(String ten) throws Exception {
        String sql = "select * from nhanVien where ho + ten like '%?%'";
        try (
                Connection con = helper.openConnection();  
                PreparedStatement pstm = con.prepareStatement(sql);) 
        {
            pstm.setString(1, ten);
            ResultSet rs = pstm.executeQuery();
            List<nhanVien> listNV = new ArrayList<>();
            while (rs.next()) {
                nhanVien nv = new nhanVien();
                nv.setHoVaTen(rs.getString("ho") + rs.getString("ten"));
                if( rs.getString("gioiTinh").equals("1")){
                    nv.setGioiTinh(true);
                }else nv.setGioiTinh(false);
                nv.setDiaChi(rs.getString("diaChi"));
                nv.setMatKhau(rs.getString("matKhau"));
                nv.setNgSinh(rs.getString("ngSinh"));
                nv.setSdt(rs.getString("sdt"));
                nv.setTaiKhoan(rs.getString("taiKhoan"));
                listNV.add(nv);
            }        
            return listNV;   
        }
    }
    //xoa nhan vien
    public boolean delete(int id) throws Exception {
        String sql = "delete from nhanVien where id= ?";
        try (
            Connection con = helper.openConnection();  
            PreparedStatement pstm = con.prepareStatement(sql);) 
        {
            pstm.setString(1, String.valueOf(id));
            return pstm.executeUpdate() > 0;
            
        }

    }
}
