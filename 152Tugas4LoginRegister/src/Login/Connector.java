/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
import java.sql.*;
/**
 *
 * @author asus
 */
public class Connector {
    String DBurl = "jdbc:mysql://localhost/tugasjdbc"; //alamat db
    String DBusername = "root";
    String DBpassword = "";
    Connection koneksi;
    Statement statement; //perintah utk jalanin statement
    
    public Connector() {
        try{
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()); //panggil fungsi library
            koneksi = (Connection) DriverManager.getConnection(DBurl,DBusername,DBpassword);//masukin user,pass
            System.out.println("Koneksi Berhasil");//jika ada koneksi berhasil
        }catch(Exception ex){
            System.out.println("Koneksi gagal");//jika tidak maka ggal
        }
    }
    
    
}
