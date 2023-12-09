package hdt.petshopproject.DAO;

import hdt.petshopproject.model.hangHoa;
import hdt.petshopproject.model.nhanVien;
import hdt.petshopproject.util.helper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hangHoa_List {

    public List<hangHoa> getAll() throws Exception {
        String sql = "select * from hangHoa order by ID";
        List<hangHoa> listHH = new ArrayList<>();
        try (
                Connection con = helper.openConnection(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql);) {
            while (rs.next()) {
                hangHoa hh = new hangHoa();
                hh.setID(Integer.parseInt(rs.getString("ID")));
                hh.setTen(rs.getString("Ten"));
                hh.setLoai(rs.getString("Loai"));
                hh.setGiaTien(Integer.parseInt(rs.getString("giaTien")));
                if (rs.getString("gioiTinh").equals("1")) {
                    hh.setGioiTinh(true);
                } else {
                    hh.setGioiTinh(false);
                }
                hh.setNgNhap(rs.getString("ngNhap"));
                hh.setChiTiet(rs.getString("chiTiet"));
                listHH.add(hh);
            }
            return listHH;
        }
    }

    //them hang hoa
    public boolean insert(hangHoa hh) throws Exception {
        String sql = "insert into hangHoa(Ten,Loai, giaTien, gioiTinh, ngNhap, chiTiet) values (?,?,?, ?, ?,?);";
        try (
                Connection con = helper.openConnection(); PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, hh.getTen());
            pstm.setString(2, hh.getLoai());
            pstm.setString(3, String.valueOf(hh.getGiaTien()));
            if (hh.isGioiTinh()) {
                pstm.setString(4, "True");
            } else {
                pstm.setString(4, "False");
            }
            pstm.setString(5, hh.getNgNhap());
            pstm.setString(6, String.valueOf(hh.getChiTiet()));
            return pstm.executeUpdate() > 0;
        }
    }

    //cap nhat hang hoa
    public boolean update(hangHoa hh) throws Exception {
        String sql = "Update hangHoa set Ten=?, Loai=?, giaTien=?, gioiTinh = ?, ngNhap = ?, chiTiet=? where ID = ?";
        try (
                Connection con = helper.openConnection(); PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, hh.getTen());
            pstm.setString(2, hh.getLoai());
            pstm.setString(3, String.valueOf(hh.getGiaTien()));
            if (hh.isGioiTinh()) {
                pstm.setString(4, "1");
            } else {
                pstm.setString(4, "0");
            }
            pstm.setString(5, hh.getNgNhap());
                        pstm.setString(6, String.valueOf(hh.getChiTiet()));
            pstm.setString(7, String.valueOf(hh.getID()));
            return pstm.executeUpdate() > 0;
        }
    }

    // tim kiem theo ten
    public List<hangHoa> findByTen(String ten) throws Exception {
        String sql = "select * from hangHoa where Lower(Ten) like ?";
        try (
                Connection con = helper.openConnection(); PreparedStatement pstm = con.prepareStatement(sql);) {
            // Chuyển sang chữ thường
            ten = ten.toLowerCase();
            pstm.setString(1, "%" + ten +"%");
            ResultSet rs = pstm.executeQuery();
            List<hangHoa> listHH = new ArrayList<>();
            while (rs.next()) {
                hangHoa hh = new hangHoa();
                hh.setID(Integer.parseInt(rs.getString("ID")));
                hh.setTen(rs.getString("Ten"));
                hh.setLoai(rs.getString("Loai"));
                hh.setChiTiet(rs.getString("chiTiet"));
                hh.setGiaTien(Integer.parseInt(rs.getString("giaTien")));
                if (rs.getString("gioiTinh").equals("1")) {
                    hh.setGioiTinh(true);
                } else {
                    hh.setGioiTinh(false);
                }
                hh.setNgNhap(rs.getString("ngNhap"));
                listHH.add(hh);
            }
            return listHH;
        }
    }

    
    
    // tim kiem theo loai
    public List<hangHoa> findByLoai(String ten) throws Exception {
        String sql = "select * from hangHoa where Loai=?";
        try (
                Connection con = helper.openConnection(); PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, ten);
            ResultSet rs = pstm.executeQuery();
            List<hangHoa> listHH = new ArrayList<>();
            while (rs.next()) {
                hangHoa hh = new hangHoa();
                hh.setTen(rs.getString("Ten"));
                hh.setLoai(rs.getString("Loai"));
                hh.setChiTiet(rs.getString("chiTiet"));
                hh.setGiaTien(Integer.parseInt(rs.getString("giaTien")));
                if (hh.isGioiTinh()) {
                    pstm.setString(5, "1");
                } else {
                    pstm.setString(5, "0");
                }
                pstm.setString(6, hh.getNgNhap());
                listHH.add(hh);
            }
            return listHH;
        }
    }

    //xoa hang hoa
    public boolean delete(int id) throws Exception {
        String sql = "delete from hangHoa where id= ?";
        try (
                Connection con = helper.openConnection(); PreparedStatement pstm = con.prepareStatement(sql);) {
            pstm.setString(1, String.valueOf(id));
            return pstm.executeUpdate() > 0;

        }
    }
    
    //sap xep theo ID
    public List<hangHoa> sapXepID() throws Exception{
        List<hangHoa> listHH = new ArrayList<>();
        String sql = "select * from hangHoa order by ID";
         try (
            Connection con = helper.openConnection(); 
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);) {
            while (rs.next()) {
                hangHoa hh = new hangHoa();
                hh.setID(Integer.parseInt(rs.getString("ID")));
                hh.setTen(rs.getString("Ten"));
                hh.setLoai(rs.getString("Loai"));
                hh.setChiTiet(rs.getString("chiTiet"));
                hh.setGiaTien(Integer.parseInt(rs.getString("giaTien")));
                if (rs.getString("gioiTinh").equals("1")) {
                    hh.setGioiTinh(true);
                } else {
                    hh.setGioiTinh(false);
                }
                hh.setNgNhap(rs.getString("ngNhap"));
                listHH.add(hh);
            }
            return listHH;
        }
    }
    
    // sap xep theo Ten
    public List<hangHoa> sapXepTen() throws Exception{
        List<hangHoa> listHH = new ArrayList<>();
        String sql = "select * from hangHoa order by Ten";
        try (
            Connection con = helper.openConnection(); 
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);) {
            while (rs.next()) {
                hangHoa hh = new hangHoa();
                hh.setID(Integer.parseInt(rs.getString("ID")));
                hh.setTen(rs.getString("Ten"));
                hh.setLoai(rs.getString("Loai"));
                hh.setChiTiet(rs.getString("chiTiet"));
                hh.setGiaTien(Integer.parseInt(rs.getString("giaTien")));
                if (rs.getString("gioiTinh").equals("1")) {
                    hh.setGioiTinh(true);
                } else {
                    hh.setGioiTinh(false);
                }
                hh.setNgNhap(rs.getString("ngNhap"));
                listHH.add(hh);
            }
            return listHH;
        }
    }
    // tim hang hoa theo ID
    public hangHoa fillHH( int  id ) throws Exception{
        String sql = "select * from hangHoa where ID = ?";
        try (
                Connection con = helper.openConnection();  
                PreparedStatement pstm = con.prepareStatement(sql);) 
        {
            pstm.setString(1, String.valueOf(id));
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                hangHoa hh = new hangHoa();
                hh.setID(Integer.parseInt(rs.getString("ID")));
                hh.setTen(rs.getString("Ten"));
                hh.setLoai(rs.getString("Loai"));
                hh.setChiTiet(rs.getString("chiTiet"));
                hh.setGiaTien(Integer.parseInt(rs.getString("giaTien")));
                if( rs.getString("gioiTinh").equals("1")){
                    hh.setGioiTinh( true );
                } else hh.setGioiTinh( false );
                hh.setNgNhap(rs.getString("ngNhap"));
                return hh;
            }
            return null;
        }
    }
}
