/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.jboss.weld.bootstrap.api.Environments;

/**
 *
 * @author Win7
 */
public class thongtin extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
        static public String user;
        static public String hoten;
        static public String gioitinh;
        static public String gioitinh1;
        static public String gioitinh2;
       static public String ngaysinh;
       static public String sodt;
       static public String socmnd;
       static public String diachi;
       static public String email;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            try {
                /* TODO output your page here. You may use following sample code. */
                Statement st=controller.ketNoiDB.ketnoi().createStatement();
                ResultSet rs=st.executeQuery("select * from KhachHang where username='"+user+"'");
                if(rs.next()){
                    hoten=rs.getString(4);
                    gioitinh=rs.getString(5);
                    ngaysinh=rs.getString(6);
                    sodt=rs.getString(8);
                    socmnd=rs.getString(7);
                    
                    email=rs.getString(9);
                    if(gioitinh.equals("Nam")){
                        gioitinh1 = "checked='1'";
                        gioitinh2 = "";
                    }else{
                        gioitinh2 = "checked='1'";
                        gioitinh1 = "";
                    }
                    
                    response.sendRedirect("pages/thongtin.jsp");
                }
                
            } catch (Exception ex) {
                out.print(ex);
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
