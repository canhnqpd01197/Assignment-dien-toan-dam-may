/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Win7
 */
public class xuatTT extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    static public String userr="";
    static public String passs="";
    static public String hotenn="";
    static public String gtt="";
    static public String gttNam="";
    static public String gttNu="";
    static public String ngaysinhh="";
    static public String sodtt="";
    static public String socm="";
    
    static public String maill="";
    static public String trangthai="";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            userr=request.getParameter("userr");
            trangthai=request.getParameter("trangthai");
            if(trangthai.equals("0")){
            try {
                /* TODO output your page here. You may use following sample code. */
                Statement st=controller.ketNoiDB.ketnoi().createStatement();
                ResultSet rs=st.executeQuery("select * from KhachHang where userName='"+userr+"'");
                
                    
               
                if(rs.next()){
                    passs=rs.getString(2);
                    hotenn=rs.getString(4);
                    gtt=rs.getString(5);
                    ngaysinhh=rs.getString(6);
                    sodtt=rs.getString(8);
                    socm=rs.getString(7);
                    
                    maill=rs.getString(9);
                    if(gtt.equals("Nam")){
                        gttNam = "checked='1'";
                        gttNu = "";
                    }else{
                        gttNu = "checked='1'";
                        gttNam = "";
                    }
                    
                }else{
                    userr="";
                    passs="";
                    hotenn="";
                    gtt="";
                    gttNam="";
                    gttNu="";
                    ngaysinhh="";
                    sodtt="";
                    socm="";
                    
                    maill="";
                }
                response.sendRedirect("pages/trangquantri.jsp");
                
            } catch (Exception ex) {
                Logger.getLogger(xuatTT.class.getName()).log(Level.SEVERE, null, ex);
            }
            ///neu trang thai khac 0
            }else if(trangthai.equals("1")){
                
                
                String user=request.getParameter("userr");
        String pass=request.getParameter("passs");
        String hoten=request.getParameter("hotenn");
        String gioitinh=request.getParameter("gtt");
        String ngaysinh=request.getParameter("ngaysinhh");
        String sodt=request.getParameter("sodtt");
        String socmnd=request.getParameter("socm");
        
        String email=request.getParameter("maill");
        DateFormat dtfm=new SimpleDateFormat("MM/dd/yyyy");
        Date date=new Date();
        String today=dtfm.format(date);
        
        try {
            
            
            PreparedStatement pr=controller.ketNoiDB.ketnoi().prepareStatement("insert into KhachHang values(?,?,?,?,?,?,?,?,?)");
            pr.setString(1, user);
            pr.setString(2, pass);
            pr.setNString(4, hoten);
            pr.setNString(5, gioitinh);
            pr.setString(6, ngaysinh);
            pr.setString(8, sodt);
            pr.setString(7, socmnd);
            
            pr.setString(9, email);
            
            pr.setString(3, "KH");
            pr.executeUpdate();
            response.sendRedirect("pages/trangquantri.jsp");
        } catch (Exception ex) {
            
            
        }
         }else if(trangthai.equals("2")){
                String user=request.getParameter("userr");
        String pass=request.getParameter("passs");
        String hoten=request.getParameter("hotenn");
        String gioitinh=request.getParameter("gtt");
        String ngaysinh=request.getParameter("ngaysinhh");
        String sodt=request.getParameter("sodtt");
        String socmnd=request.getParameter("socm");
        
        String email=request.getParameter("maill");
        DateFormat dtfm=new SimpleDateFormat("MM/dd/yyyy");
        Date date=new Date();
        String today=dtfm.format(date);
        
        try {
            
            
            PreparedStatement pr=controller.ketNoiDB.ketnoi().prepareStatement("update KhachHang set pass = ?, hoTen= ? , gioiTinh = ? , ngaySinh = ? , soDT = ?, soCMND = ?, email=? where username=? ");
            pr.setString(1, pass);
            pr.setString(2, hoten);
            pr.setNString(3, gioitinh);
            pr.setNString(4, ngaysinh);
            pr.setString(5, sodt);
            pr.setString(6, socmnd);
            
            pr.setNString(7, email);
            pr.setString(8, userr);
            
            pr.executeUpdate();
            
            Statement st=controller.ketNoiDB.ketnoi().createStatement();
                ResultSet rs=st.executeQuery("select * from KhachHang where userName='"+userr+"'");
            if(rs.next()){
                    passs=rs.getString(2);
                    hotenn=rs.getString(4);
                    gtt=rs.getString(5);
                    ngaysinhh=rs.getString(6);
                    sodtt=rs.getString(8);
                    socm=rs.getString(7);
                    
                    maill=rs.getString(9);
                    if(gtt.equals("Nam")){
                        gttNam = "checked='1'";
                        gttNu = "";
                    }else{
                        gttNu = "checked='1'";
                        gttNam = "";
                    }
                    
                }else{
                    userr="";
                    passs="";
                    hotenn="";
                    gtt="";
                    gttNam="";
                    gttNu="";
                    ngaysinhh="";
                    sodtt="";
                    socm="";
                    
                    maill="";
                }
            
            response.sendRedirect("pages/trangquantri.jsp");
        } catch (Exception ex) {
            
            
        }
                
            }else if(trangthai.equals("3")){
                
                userr=request.getParameter("userr");
        
        try {
            
            
            PreparedStatement pr=controller.ketNoiDB.ketnoi().prepareStatement("delete from KhachHang where userName = ?");
           pr.setString(1, userr);
            pr.executeUpdate();
            userr="";
                    passs="";
                    hotenn="";
                    gtt="";
                    gttNam="";
                    gttNu="";
                    ngaysinhh="";
                    sodtt="";
                    socm="";
                    
                    maill="";
                response.sendRedirect("pages/trangquantri.jsp");
        } catch (Exception ex) {
            
            
        }
            }
            response.sendRedirect("pages/trangquantri.jsp");
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
