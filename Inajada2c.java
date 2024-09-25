
package inajada2c;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class Inajada2c {

  public static Connection connectDB() {
        Connection con = null;
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:test.db");
            System.out.println("Connection Successful");
        } catch (Exception e) {
            System.out.println("Connection Failed: " + e);
        }
        return con;
    }
    
    public static void main(String[] args) throws SQLException {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student ID: ");
        int id = sc.nextInt();
        System.out.println("First Name: ");
        String fn = sc.nextLine();
        System.out.println("Last Name: ");
        String ln = sc.nextLine();
        System.out.println("Email: ");
        String ems = sc.next();
        System.out.println("Status: ");
        String sts = sc.next();
        
        String sql = "INSERT INTO Students (s_id, s_fname, s_lname, s_email, s_status) VALUES (?, ?, ?, ?, ?)";
        
        Connection con = connectDB();
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, id);
        pst.setString(2, fn);
        pst.setString(3, ln);
        pst.setString(4, ems);
        pst.setString(5, sts);
        pst.executeUpdate();
        System.out.println("Inserted Successfully");
           
    }
    
}
