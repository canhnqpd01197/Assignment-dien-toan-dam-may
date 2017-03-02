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
<title>Liên hệ</title>
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
        <div><img style="display:block"  width="1024" src="../images/lh.JPG"></div>
        
<iframe src="https://www.google.com/maps/embed?pb=!1m17!1m8!1m3!1d7667.970239898593!2d108.18674828646414!3d16.066261939646605!3m2!1i1024!2i768!4f13.1!4m6!3e6!4m0!4m3!3m2!1d16.0657155!2d108.18644789999999!5e0!3m2!1svi!2s!4v1487015456242" width="1024" height="600" frameborder="0" style="border:0" allowfullscreen></iframe>
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
