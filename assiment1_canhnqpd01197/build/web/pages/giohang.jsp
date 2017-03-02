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
<title>Giỏi hàng</title>
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
        <br>
<p align="center" style="font-size:25px">Giỏ hàng của bạn</p>
<form action="../giohang" method="post">
    <table align="center" border='1' style="text-align: center">
    <tr><td width="300" height="50">Tên sản phẩm</td><td width="170" height="50">Đơn giá</td><td width="70" height="50">Số lượng</td><td width="170" height="50">Thành tiền</td></tr>
    <%
        for (int i = 0; i < servlet.giohang.giohangtong.size(); i++) {
            %><tr><td width="300" height="50"><%servlet.giohang.giohangtong.get(i,0);%></td><td width="170" height="50"><%servlet.giohang.giohangtong.get(i,1);%></td><td width="70" height="50">Số lượng</td><td width="170" height="50">Thành tiền</td></tr>    
            
            
            <%}%>
    
    
</table>
</form>
<br>
    <br>
    <br>
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
