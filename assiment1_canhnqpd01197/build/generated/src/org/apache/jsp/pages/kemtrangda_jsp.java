package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;

public final class kemtrangda_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("<head>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<link rel=\"stylesheet\" href=\"../css/css.css\">\n");
      out.write("<script src=\"../js/js.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("<link href=\"../css/js-image-sliderhearder.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script src=\"../js/jsimghearder.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"../js/jquery-3.1.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write(" \n");
      out.write("<!-- TemplateBeginEditable name=\"doctitle\" -->\n");
      out.write("<title>Kem trắng da</title>\n");
      out.write("<!-- TemplateEndEditable -->\n");
      out.write("<!-- TemplateBeginEditable name=\"head\" -->\n");
      out.write("<!-- TemplateEndEditable -->\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body >\n");
      out.write("<div class=\"trangtong\">\n");
      out.write("\n");
      out.write("<div class=\"phanDau\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"sliderFrame\">\n");
      out.write("    <div id=\"slider\">\n");
      out.write("    \t\t<img src=\"../imghearder/1.jpg\"  />\n");
      out.write("            <img src=\"../imghearder/2.jpg\" />\n");
      out.write("            <img src=\"../imghearder/3.jpg\" />\n");
      out.write("            <img src=\"../imghearder/4.jpg\" />\n");
      out.write("            <img src=\"../imghearder/5.jpg\" />\n");
      out.write("        </div>\n");
      out.write("       </div>\n");
      out.write("       \n");
      out.write("     <div class=\"menu\">\n");
      out.write("\t<ul>\n");
      out.write("\t<li class=\"menuCon1\"><a href=\"#\">Danh mục</a>\n");
      out.write("    <ul class=\"menuCon\">\n");
      out.write("        <li><a href=\"kemtrimun.jsp\">Kem trị mụn</a></li>\n");
      out.write("    <li><a href=\"kemtrangda.jsp\">Kem trắng da</a></li>\n");
      out.write("    <li><a href=\"kemtrinam.jsp\">Kem trị nám</a></li>\n");
      out.write("    <li><a href=\"kemtritham.jsp\">Kem trị thâm</a></li>\n");
      out.write("    <li><a href=\"suatam.jsp\">Sữa tắm</a></li>\n");
      out.write("    </ul>\n");
      out.write("    </li>\n");
      out.write("    <li><a href=\"../index.jsp\">Trang chủ</a></li>\n");
      out.write("    <li><a href=\"gioithieu.jsp\">Giới thiệu</a></li>\n");
      out.write("    <li><a href=\"sanpham.jsp\">Sản phẩm</a></li>\n");
      out.write("    <li><a href=\"lienhe.jsp\">Liên hệ</a></li>\n");
      out.write("    <li ");
      out.print(servlet.dangnhap.display);
      out.write(" class=\"DN\"><a href=\"dangnhap.jsp\" class=\"DK\">Đăng nhập</a><span class=\"gachngang\"> - </span><a class=\"DK\" href=\"dangki.jsp\">Đăng kí</a></li>\n");
      out.write("    <li class=\"lidn\" style=\"color: chartreuse;");
      out.print(servlet.dangnhap.displayDN);
      out.write('"');
      out.write('>');
      out.print(servlet.dangnhap.userN);
      out.write("\n");
      out.write("        <ul style=\"position: absolute;\">\n");
      out.write("            <li style=\"float: none\"><a style=\"color: chartreuse;\" href=\"../giohang\">Giỏ hàng</a></li>\n");
      out.write("            <li style=\"float: none\"><a style=\"color: chartreuse;\" href=\"../thongtin\">Thông tin</a></li>\n");
      out.write("            <li style=\"float: none\"><a style=\"color: chartreuse;\" href=\"doimatkhau.jsp\">Đổi mật khẩu</a></li>\n");
      out.write("            <li style=\"float: none\"><a style=\"color: chartreuse;\" href=\"../dangxuat\">Đăng xuất</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div class=\"phanGiua\">\n");
      out.write("<div style=\"padding: 10px\">\n");
      out.write("    ");
 
    controller.ketNoiDB.ketnoi();
    Statement st= controller.ketNoiDB.ketnoi().createStatement();
    ResultSet rs=st.executeQuery("select maSP,maLoai,tenSP,nhaSanXuat,donGia,hinhAnh from SP where maloai='l3'");
    
      out.write("\n");
      out.write("    <table style=\"padding:30px;width:1024px;height:auto;\">\n");
      out.write("<tr>\n");
      out.write("    ");

    while (rs.next()) {
      out.write("\n");
      out.write("    <td align=\"center\" style=\"width:180px;height:220px;float:left;margin:5px\"><img style=\"display:block\" src=\"../images/");
      out.print(rs.getString(6));
      out.write("\" width=\"180px\" height=\"150px\"><p style=\"margin:5px\">");
      out.print(rs.getString(3));
      out.write("</p><p style=\"margin:5px\">Đơn giá: ");
      out.print(rs.getString(5));
      out.write(" VND</p><input type=\"button\" value=\"Thêm vào giỏ hàng\" width=\"180px\"></td> \n");
      out.write("        ");
}
      out.write("\n");
      out.write("    \n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"phanDuoi\">\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<p align=\"center\">Nguyễn quốc cảnh</p>\n");
      out.write("<p align=\"center\">Số ĐT: 0911776579</p>\n");
      out.write("<p align=\"center\">Email: canhnqpd01197@fpt.edu.vn</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
