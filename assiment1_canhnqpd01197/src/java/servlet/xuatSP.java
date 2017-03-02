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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Win7
 */
public class xuatSP extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    static public String masp="";
    static public String maloai="";
    static public String tensp="";
    static public String nhasx="";
    static public Float dongia;
    static public String fileanh="";
    static public String trangthai="";
    static public String soluong="";
    static public String mota="";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        trangthai=request.getParameter("trangthaii");
        PrintWriter out=response.getWriter();
        if(trangthai.equals("4")){
            masp=request.getParameter("masp");
            try {
                Statement st=controller.ketNoiDB.ketnoi().createStatement();
                ResultSet rs=st.executeQuery("select * from SP where maSP='"+masp+"'");
                if(rs.next()){
                    maloai=rs.getString(7);
                    tensp=rs.getString(2);
                    nhasx=rs.getString(6);
                    mota=rs.getString(3);
                    dongia= Float.parseFloat(rs.getString(5));
                    soluong=rs.getString(4);
                }else{
                    maloai="";
                    tensp="";
                    nhasx="";
                    dongia=null;
                    mota="";
                    soluong="";
                }
                response.sendRedirect("pages/trangquantri.jsp");
            } catch (SQLException ex) {
                
            }
        }else if(trangthai.equals("5")){
            masp=request.getParameter("masp");
            maloai=request.getParameter("maloai");
            tensp=request.getParameter("tensp");
            nhasx=request.getParameter("nhasx");
            dongia= Float.parseFloat(request.getParameter("dongia"));
            fileanh=request.getParameter("fileanh");
            soluong=request.getParameter("soluong");
            mota=request.getParameter("mota");
            try {
                PreparedStatement pr=controller.ketNoiDB.ketnoi().prepareStatement("insert into SP values(?,?,?,?,?,?,?,?)");
                pr.setString(1, masp);
                pr.setString(7, maloai);
                pr.setString(2, tensp);
                pr.setString(6, nhasx);
                pr.setFloat(5, dongia);
                pr.setString(3, mota);
                pr.setString(4, soluong);
                pr.setString(8, fileanh);
                pr.executeUpdate();
                
                response.sendRedirect("pages/trangquantri.jsp");
                
            } catch (Exception ex) {
                
            }
        }else if(trangthai.equals("6")){
            masp=request.getParameter("masp");
            maloai=request.getParameter("maloai");
            tensp=request.getParameter("tensp");
            nhasx=request.getParameter("nhasx");
            dongia= Float.parseFloat(request.getParameter("dongia"));
            fileanh=request.getParameter("fileanh");
            soluong=request.getParameter("soluong");
            mota=request.getParameter("mota");
            try {
                PreparedStatement pr=controller.ketNoiDB.ketnoi().prepareStatement("update SP set maLoai=?,tenSP=?,nhaSanXuat=?,donGia=?,hinhAnh=?,moTa=?,soLuong=? where maSP=?");
                pr.setString(8, masp);
                pr.setString(1, maloai);
                pr.setString(2, tensp);
                pr.setString(3, nhasx);
                pr.setFloat(4, dongia);
                pr.setString(5, fileanh);
                pr.setString(6, mota);
                pr.setString(7, soluong);
                pr.executeUpdate();
                
                response.sendRedirect("pages/trangquantri.jsp");
                
            } catch (Exception ex) {
                out.print(ex);
            }
        }else if(trangthai.equals("7")){
            masp=request.getParameter("masp");
            try {
                PreparedStatement pr=controller.ketNoiDB.ketnoi().prepareStatement("delete from SP where maSP=?");
                pr.setString(1, masp);
                
                pr.executeUpdate();
                masp="";
    maloai="";
    tensp="";
    nhasx="";
    dongia=null;
    fileanh="";
    trangthai="";
    mota="";
    soluong=null;
                response.sendRedirect("pages/trangquantri.jsp");
                
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
