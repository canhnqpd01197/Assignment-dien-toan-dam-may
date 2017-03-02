package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;

public final class trangquantri_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("    \n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>Trang quản trị</title>\n");
      out.write("</head>\n");
      out.write("<body style=\"background-image: url('../images/bquantri.jpg')\">\n");
      out.write("<h1 style=\"color:#FF0004\" align=\"center\">Trang quản trị</h1>\n");
      out.write("\n");
      out.write("<table align=\"center\" border=\"1\">\n");
      out.write("<tr>\n");
      out.write("<td>\n");
      out.write("    <script>\n");
      out.write("        function trangthai0(){\n");
      out.write("            var a0 = 0;\n");
      out.write("            document.getElementById(\"trangthai\").value=a0;\n");
      out.write("           \n");
      out.write("        }\n");
      out.write("        function trangthai1(){\n");
      out.write("            var a1 = 1;\n");
      out.write("            document.getElementById(\"trangthai\").value=a1;\n");
      out.write("         }\n");
      out.write("         function trangthai2(){\n");
      out.write("            var a2 = 2;\n");
      out.write("            document.getElementById(\"trangthai\").value=a2;\n");
      out.write("         }\n");
      out.write("         function trangthai3(){\n");
      out.write("            var a3 = 3;\n");
      out.write("            document.getElementById(\"trangthai\").value=a3;\n");
      out.write("         }\n");
      out.write("        function trangthai4(){\n");
      out.write("            var a4 = 4;\n");
      out.write("            document.getElementById(\"trangthaii\").value=a4;\n");
      out.write("         }\n");
      out.write("         function trangthai5(){\n");
      out.write("            var a5 = 5;\n");
      out.write("            document.getElementById(\"trangthaii\").value=a5;\n");
      out.write("         }\n");
      out.write("         function trangthai6(){\n");
      out.write("            var a6 = 6;\n");
      out.write("            document.getElementById(\"trangthaii\").value=a6;\n");
      out.write("         }\n");
      out.write("         function trangthai7(){\n");
      out.write("            var a7 = 7;\n");
      out.write("            document.getElementById(\"trangthaii\").value=a7;\n");
      out.write("         }\n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <form action=\"../xuatTT\" method=\"POST\">\n");
      out.write("        \n");
      out.write("<table align=\"left\" >\n");
      out.write("<tr>\n");
      out.write("<td></td>\n");
      out.write("<td width=\"280\"><h3>Quản lý khách hàng</h3></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td width=\"107\" height=\"45\" style=\"text-align:right;\">Tên đăng nhập:</td>\n");
      out.write("<td width=\"288\"><input type=\"text\" id=\"userr\" name=\"userr\" value=\"");
      out.print(servlet.xuatTT.userr);
      out.write("\" /> <input type=\"submit\" value=\"Xuất thông tin\" onclick=\"trangthai0()\"  ></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td height=\"40\" style=\"text-align:right;\">Mật khẩu:</td>\n");
      out.write("<td><input type=\"text\" id=\"passs\" name=\"passs\" value=\"");
      out.print(servlet.xuatTT.passs);
      out.write("\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td height=\"40\" style=\"text-align:right;\">Họ và tên:</td>\n");
      out.write("<td><input type=\"text\" name=\"hotenn\" value=\"");
      out.print(servlet.xuatTT.hotenn);
      out.write("\" /></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td height=\"40\" style=\"text-align:right;\">Giới tính:</td>\n");
      out.write("<td><input type=\"radio\" value=\"Nam\" name=\"gtt\" ");
      out.print(servlet.xuatTT.gttNam);
      out.write("/>Nam <input type=\"radio\" value=\"Nữ\" name=\"gtt\" ");
      out.print(servlet.xuatTT.gttNu);
      out.write(" />Nữ</td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td height=\"40\" style=\"text-align:right;\">Ngày sinh:</td>\n");
      out.write("<td><input type=\"date\" name=\"ngaysinhh\" value=\"");
      out.print(servlet.xuatTT.ngaysinhh);
      out.write("\"/></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td height=\"40\" style=\"text-align:right;\">Số điện thoại:</td>\n");
      out.write("<td><input type=\"number\" name=\"sodtt\" value=\"");
      out.print(servlet.xuatTT.sodtt);
      out.write("\"/></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td height=\"40\" style=\"text-align:right;\">Số CMND:</td>\n");
      out.write("<td><input type=\"number\" name=\"socm\" value=\"");
      out.print(servlet.xuatTT.socm);
      out.write("\"/></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td height=\"40\" style=\"text-align:right;\">Email:</td>\n");
      out.write("<td><input type=\"text\" name=\"maill\" value=\"");
      out.print(servlet.xuatTT.maill);
      out.write("\"/></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td></td>\n");
      out.write("<td height=\"40\"><input type=\"submit\" value=\"Thêm\" onclick=\"trangthai1()\" >  <input type=\"submit\" value=\" Sửa \" onclick=\"trangthai2()\">  <input type=\"submit\" value=\" Xóa \" onclick=\"trangthai3()\"></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("<input type=\"text\" value=\"\" style=\"display: none\" id=\"trangthai\" name=\"trangthai\"> \n");
      out.write("    </form>\n");
      out.write("</td>\n");
      out.write("<td>\n");
      out.write("    <form action=\"../xuatSP\" method=\"POST\">\n");
      out.write("<table align=\"left\">\n");
      out.write("<tr>\n");
      out.write("<td></td>\n");
      out.write("<td width=\"280\"><h3>Quản lý sản phẩm</h3></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td width=\"107\" height=\"45\" style=\"text-align:right;\">Mã sản phẩm</td>\n");
      out.write("<td width=\"288\"><input type=\"text\" name=\"masp\" value=\"");
      out.print(servlet.xuatSP.masp);
      out.write("\"/> <input type=\"submit\" value=\"Xuất thông tin\" onclick=\"trangthai4()\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td height=\"40\" style=\"text-align:right;\">Mã loại:</td>\n");
      out.write("<td><input type=\"text\" name=\"maloai\" value=\"");
      out.print(servlet.xuatSP.maloai);
      out.write("\"/></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td height=\"40\" style=\"text-align:right;\">Tên sản phẩm:</td>\n");
      out.write("<td><input type=\"text\" name=\"tensp\" value=\"");
      out.print(servlet.xuatSP.tensp);
      out.write("\"/></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td height=\"40\" style=\"text-align:right;\">Nhà sản xuất:</td>\n");
      out.write("<td><input type=\"date\" name=\"nhasx\" value=\"");
      out.print(servlet.xuatSP.nhasx);
      out.write("\"/></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td height=\"40\" style=\"text-align:right;\">Mô tả:</td>\n");
      out.write("<td><input type=\"text\" name=\"mota\" value=\"");
      out.print(servlet.xuatSP.mota);
      out.write("\"/></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td height=\"40\" style=\"text-align:right;\">Đơn giá:</td>\n");
      out.write("<td><input type=\"number\" name=\"dongia\" value=\"");
      out.print(servlet.xuatSP.dongia);
      out.write("\"/></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td height=\"40\" style=\"text-align:right;\">Số lượng</td>\n");
      out.write("<td><input type=\"number\" name=\"soluong\" value=\"");
      out.print(servlet.xuatSP.soluong);
      out.write("\"/></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td height=\"40\" style=\"text-align:right;\">File ảnh:</td>\n");
      out.write("<td><input type=\"file\" name=\"fileanh\" /></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td></td>\n");
      out.write("<td height=\"40\"><input type=\"submit\" value=\"Thêm\" onclick=\"trangthai5()\">  <input type=\"submit\" value=\" Sửa \" onclick=\"trangthai6()\">  <input type=\"submit\" value=\" Xóa \" onclick=\"trangthai7()\"></td>\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("        <input type=\"text\" value=\"\" style=\"display: none\" id=\"trangthaii\" name=\"trangthaii\">\n");
      out.write("    </form>\n");
      out.write("</td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("<p style=\"text-align: center;font-size: 17px;\"><a style=\"color: red\" href=\"../index.jsp\">Đăng xuất</a></p>\n");
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
