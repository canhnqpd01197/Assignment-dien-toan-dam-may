/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author goodmorning
 */
public class ketNoiDB {
    static Connection conn=null;
    public static Connection ketnoi(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/QLBH","root","root");
            
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return conn;
    }
    public int dangnhap(String userName,String pass){
        int tempKN=-1;
        Statement st;
        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/QLBH","root","root");
            st = conn.createStatement();
            rs = st.executeQuery("select vaiTro from KhachHang where userName ='"+userName+"' and pass='"+pass+"'");
            // -1 chưa đăng kí , 0 khách hàng , 1 admin
            if(rs.next()){
                if(rs.getString(1)=="0"){
                    tempKN = 0;
                }else{
                    tempKN = 1;
                }
            }else{
                tempKN = -1;
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return tempKN;
    }
    
    
}
