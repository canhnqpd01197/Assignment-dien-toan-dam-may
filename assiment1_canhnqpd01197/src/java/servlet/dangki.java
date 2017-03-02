/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Policy;
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
public class dangki extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String user=request.getParameter("user");
        String pass=request.getParameter("pass");
        String hoten=request.getParameter("hoten");
        String gioitinh=request.getParameter("gt");
        String ngaysinh=request.getParameter("ngaysinh");
        String sodt=request.getParameter("sodt");
        String socmnd=request.getParameter("socmnd");
       
        String email=request.getParameter("email");
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
            PrintWriter out = response.getWriter();
            out.println("<h1>Đăng kí thành công.</h1>");
            out.println("<a href='index.jsp'>Trở lại trang chủ</a>");
            out.println("<p>"+hoten+"</p>");
        } catch (Exception ex) {
            PrintWriter out = response.getWriter();
            out.println("<h1>Đăng kí thất bại.</h1>");
            out.println("<h3 style='color:#FF0004'>Sai thông tin hoặc tên đăng nhập đã tồn tại.</h3>");
            out.println("<a href='index.jsp'>Trở lại trang chủ</a>");
            
            
            
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
