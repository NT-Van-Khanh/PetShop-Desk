
import hdt.petshopproject.model.Customer;
import hdt.petshopproject.util.helper;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class Main {
    public static void main(String[] args){
        String sql = "select * from khachHang";
        try (
            Connection con = helper.openConnection(); 
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);) {
        }
        catch(Exception e){
            System.out.print("Đã xảy ra lỗi: " + e.getMessage());
            e.printStackTrace(); 
        }
    }
}
