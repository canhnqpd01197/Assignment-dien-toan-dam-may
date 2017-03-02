<!doctype html>
<html>
    <%@page contentType="text/html" pageEncoding="UTF-8"%>
<head>
<meta charset="utf-8">
<link rel="stylesheet" href="../css/css.css">
<script src="../js/js.js" type="text/javascript"></script>


<link href="../css/js-image-sliderhearder.css" rel="stylesheet" type="text/css" />
<script src="../js/jsimghearder.js" type="text/javascript"></script>
<script src="../js/jquery-3.1.1.min.js" type="text/javascript"></script>
 
<!-- TemplateBeginEditable name="doctitle" -->
<title>Đăng kí</title>
<!-- TemplateEndEditable -->
<!-- TemplateBeginEditable name="head" -->
<!-- TemplateEndEditable -->
</head>

<body >
<div class="trangtong">

<div class="phanDau">


<div id="sliderFrame">
    <div id="slider">
    		<img src="../imghearder/1.jpg"  />
            <img src="../imghearder/2.jpg" />
            <img src="../imghearder/3.jpg" />
            <img src="../imghearder/4.jpg" />
            <img src="../imghearder/5.jpg" />
        </div>
       </div>
       
     <div class="menu">
	<ul>
	<li class="menuCon1"><a href="#">Danh mục</a>
    <ul class="menuCon">
        <li><a href="kemtrimun.jsp">Kem trị mụn</a></li>
    <li><a href="kemtrangda.jsp">Kem trắng da</a></li>
    <li><a href="kemtrinam.jsp">Kem trị nám</a></li>
    <li><a href="kemtritham.jsp">Kem trị thâm</a></li>
    <li><a href="suatam.jsp">Sữa tắm</a></li>
    </ul>
    </li>
    <li><a href="../index.jsp">Trang chủ</a></li>
    <li><a href="gioithieu.jsp">Giới thiệu</a></li>
    <li><a href="sanpham.jsp">Sản phẩm</a></li>
    <li><a href="lienhe.jsp">Liên hệ</a></li>
    <li <%=servlet.dangnhap.display%> class="DN"><a href="dangnhap.jsp" class="DK">Đăng nhập</a><span class="gachngang"> - </span><a class="DK" href="dangki.jsp">Đăng kí</a></li>
    <li class="lidn" style="color: chartreuse;<%=servlet.dangnhap.displayDN%>"><%=servlet.dangnhap.userN%>
        <ul style="position: absolute;">
            <li style="float: none"><a style="color: chartreuse;" href="../giohang">Giỏ hàng</a></li>
            <li style="float: none"><a style="color: chartreuse;" href="../thongtin">Thông tin</a></li>
            <li style="float: none"><a style="color: chartreuse;" href="doimatkhau.jsp">Đổi mật khẩu</a></li>
            <li style="float: none"><a style="color: chartreuse;" href="../dangxuat">Đăng xuất</a></li>
        </ul>
    </li>
</ul>
</div>

</div>
    <div class="phanGiua">
        <div >
<br>
<form action="../dangki" method="post" class="fdangki">
<p align="center" style="font-size:36px">Đăng kí thành viên</p>
<table align="center" >
<tr>
<td width="107" height="45" style="text-align:right;">Tên đăng nhập:</td>
<td width="288"><input type="text" name="user"/></td>
</tr>
<tr>
<td height="45" style="text-align:right;">Mật khẩu:</td>
<td><input type="password" name="pass"/></td>
</tr>
<tr>
<td height="45" style="text-align:right;">Họ và tên:</td>
<td><input type="text" name="hoten"/></td>
</tr>
<tr>
<td height="45" style="text-align:right;">Giới tính:</td>
<td><input type="radio" value="Nam" name="gt"/>Nam <input type="radio" value="Nu" name="gt"/>Nữ</td>
</tr>
<tr>
<td height="45" style="text-align:right;">Ngày sinh:</td>
<td><input type="date" name="ngaysinh" /></td>
</tr>
<tr>
<td height="45" style="text-align:right;">Số điện thoại:</td>
<td><input type="number" name="sodt"/></td>
</tr>
<tr>
<td height="45" style="text-align:right;">Số CMND:</td>
<td><input type="number" name="socmnd"/></td>
</tr>

<tr>
<td height="45" style="text-align:right;">Email:</td>
<td><input type="text" name="email"/></td>
</tr>
<tr>
<td height="45"></td>
<td><input type="submit" value="Đăng kí"> <input type="reset" value="Hủy"></td>
</tr>
</table>

</form>
</div>
    </div>

<div class="phanDuoi">
<br>

<p align="center">Nguyễn quốc cảnh</p>
<p align="center">Số ĐT: 0911776579</p>
<p align="center">Email: canhnqpd01197@fpt.edu.vn</p>
</div>

</div>
</body>
</html>
