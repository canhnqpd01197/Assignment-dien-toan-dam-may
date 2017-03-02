<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<!doctype html>
<html>
<head>
    <%@page contentType="text/html" pageEncoding="UTF-8"%>
<meta charset="utf-8">
<title>Trang quản trị</title>
</head>
<body style="background-image: url('../images/bquantri.jpg')">
<h1 style="color:#FF0004" align="center">Trang quản trị</h1>

<table align="center" border="1">
<tr>
<td>
    <script>
        function trangthai0(){
            var a0 = 0;
            document.getElementById("trangthai").value=a0;
           
        }
        function trangthai1(){
            var a1 = 1;
            document.getElementById("trangthai").value=a1;
         }
         function trangthai2(){
            var a2 = 2;
            document.getElementById("trangthai").value=a2;
         }
         function trangthai3(){
            var a3 = 3;
            document.getElementById("trangthai").value=a3;
         }
        function trangthai4(){
            var a4 = 4;
            document.getElementById("trangthaii").value=a4;
         }
         function trangthai5(){
            var a5 = 5;
            document.getElementById("trangthaii").value=a5;
         }
         function trangthai6(){
            var a6 = 6;
            document.getElementById("trangthaii").value=a6;
         }
         function trangthai7(){
            var a7 = 7;
            document.getElementById("trangthaii").value=a7;
         }
    </script>
    
    
    
    <form action="../xuatTT" method="POST">
        
<table align="left" >
<tr>
<td></td>
<td width="280"><h3>Quản lý khách hàng</h3></td>
</tr>
<tr>
<td width="107" height="45" style="text-align:right;">Tên đăng nhập:</td>
<td width="288"><input type="text" id="userr" name="userr" value="<%=servlet.xuatTT.userr%>" /> <input type="submit" value="Xuất thông tin" onclick="trangthai0()"  ></td>
</tr>
<tr>
<td height="40" style="text-align:right;">Mật khẩu:</td>
<td><input type="text" id="passs" name="passs" value="<%=servlet.xuatTT.passs%>" /></td>
</tr>
<tr>
<td height="40" style="text-align:right;">Họ và tên:</td>
<td><input type="text" name="hotenn" value="<%=servlet.xuatTT.hotenn%>" /></td>
</tr>
<tr>
<td height="40" style="text-align:right;">Giới tính:</td>
<td><input type="radio" value="Nam" name="gtt" <%=servlet.xuatTT.gttNam%>/>Nam <input type="radio" value="Nữ" name="gtt" <%=servlet.xuatTT.gttNu%> />Nữ</td>
</tr>
<tr>
<td height="40" style="text-align:right;">Ngày sinh:</td>
<td><input type="date" name="ngaysinhh" value="<%=servlet.xuatTT.ngaysinhh%>"/></td>
</tr>
<tr>
<td height="40" style="text-align:right;">Số điện thoại:</td>
<td><input type="number" name="sodtt" value="<%=servlet.xuatTT.sodtt%>"/></td>
</tr>
<tr>
<td height="40" style="text-align:right;">Số CMND:</td>
<td><input type="number" name="socm" value="<%=servlet.xuatTT.socm%>"/></td>
</tr>

<tr>
<td height="40" style="text-align:right;">Email:</td>
<td><input type="text" name="maill" value="<%=servlet.xuatTT.maill%>"/></td>
</tr>
<tr>
<td></td>
<td height="40"><input type="submit" value="Thêm" onclick="trangthai1()" >  <input type="submit" value=" Sửa " onclick="trangthai2()">  <input type="submit" value=" Xóa " onclick="trangthai3()"></td>
</tr>
</table>
<input type="text" value="" style="display: none" id="trangthai" name="trangthai"> 
    </form>
</td>
<td>
    <form action="../xuatSP" method="POST">
<table align="left">
<tr>
<td></td>
<td width="280"><h3>Quản lý sản phẩm</h3></td>
</tr>
<tr>
<td width="107" height="45" style="text-align:right;">Mã sản phẩm</td>
<td width="288"><input type="text" name="masp" value="<%=servlet.xuatSP.masp%>"/> <input type="submit" value="Xuất thông tin" onclick="trangthai4()"></td>
</tr>

<tr>
<td height="40" style="text-align:right;">Mã loại:</td>
<td><input type="text" name="maloai" value="<%=servlet.xuatSP.maloai%>"/></td>
</tr>
<tr>
<td height="40" style="text-align:right;">Tên sản phẩm:</td>
<td><input type="text" name="tensp" value="<%=servlet.xuatSP.tensp%>"/></td>
</tr>
<tr>
<td height="40" style="text-align:right;">Nhà sản xuất:</td>
<td><input type="text" name="nhasx" value="<%=servlet.xuatSP.nhasx%>"/></td>
</tr>
<tr>
<td height="40" style="text-align:right;">Mô tả:</td>
<td><input type="text" name="mota" value="<%=servlet.xuatSP.mota%>"/></td>
</tr>
<tr>
<td height="40" style="text-align:right;">Đơn giá:</td>
<td><input type="number" name="dongia" value="<%=servlet.xuatSP.dongia%>"/></td>
</tr>
<tr>
<td height="40" style="text-align:right;">Số lượng</td>
<td><input type="number" name="soluong" value="<%=servlet.xuatSP.soluong%>"/></td>
</tr>
<tr>
<td height="40" style="text-align:right;">File ảnh:</td>
<td><input type="file" name="fileanh" /></td>
</tr>


<tr>
<td></td>
<td height="40"><input type="submit" value="Thêm" onclick="trangthai5()">  <input type="submit" value=" Sửa " onclick="trangthai6()">  <input type="submit" value=" Xóa " onclick="trangthai7()"></td>
</tr>

</table>
        <input type="text" value="" style="display: none" id="trangthaii" name="trangthaii">
    </form>
</td>
</tr>
</table>
<p style="text-align: center;font-size: 17px;"><a style="color: red" href="../index.jsp">Đăng xuất</a></p>
</body>
</html>
