/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Win7
 */
public class updateTT extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String user=servlet.thongtin.user;
        String hoten=request.getParameter("hoten");
        String gioitinh=request.getParameter("gt");
       String ngaysinh=request.getParameter("ngaysinh");
       String sodt=request.getParameter("sodt");
       String socmnd=request.getParameter("socmnd");
       
       String email=request.getParameter("email");
       try {
            
            
            PreparedStatement pr=controller.ketNoiDB.ketnoi().prepareStatement("update KhachHang set hoTen=?,gioiTinh=?,ngaySinh=?,soDT=?,soCMND=?,email=? where username=?");
            pr.setString(1, hoten);
            pr.setString(2, gioitinh);
            pr.setNString(3, ngaysinh);
            pr.setNString(4, sodt);
            pr.setString(5, socmnd);
            
            pr.setString(6, email);
            pr.setString(7, user);
            pr.executeUpdate();
            response.sendRedirect("thongtin");
        } catch (Exception ex) {
            
            
        }
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
