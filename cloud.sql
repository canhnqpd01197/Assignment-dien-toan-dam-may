CREATE DATABASE QLBH;

USE QLBH;

CREATE DATABASE QLBH
;
USE QLBH;

CREATE TABLE ChiTietHoaDon (
    maChiTietHoaDon varchar(10)  NOT NULL,
    maHoaDon varchar(10)  NOT NULL,
    maSP varchar(10)  NOT NULL,
    soLuong int  NULL,
    giaTien float  NULL,
    CONSTRAINT ChiTietHoaDon_pk PRIMARY KEY  (maChiTietHoaDon)
);

-- Table: HoaDon
CREATE TABLE HoaDon (
    maHoaDon varchar(10)  NOT NULL,
    username varchar(50)  NOT NULL,
    ngayMua date  NULL,
    trangThai varchar(20)  NULL,
    CONSTRAINT HoaDon_pk PRIMARY KEY  (maHoaDon)
);

-- Table: KhachHang
CREATE TABLE KhachHang (
    username varchar(50)  NOT NULL,
    pass varchar(20)  NULL,
    vaiTro varchar(10)  NULL,
    hoTen varchar(50)  NULL,
    gioiTinh varchar(5)  NULL,
    ngaySinh date  NULL,
    soCMND varchar(20)  NULL,
    soDT varchar(11)  NULL,
    email varchar(50)  NULL,
    CONSTRAINT KhachHang_pk PRIMARY KEY  (username)
);

-- Table: LoaiSP
CREATE TABLE LoaiSP (
    maLoai varchar(10)  NOT NULL,
    tenLoai varchar(50)  NULL,
    CONSTRAINT LoaiSP_pk PRIMARY KEY  (maLoai)
);

-- Table: SP
CREATE TABLE SP (
    maSP varchar(10)  NOT NULL,
    tenSP varchar(50)  NULL,
    moTa varchar(100)  NULL,
    soLuong int  NULL,
    donGia float  NULL,
    nhaSanXuat varchar(50)  NULL,
    maLoai varchar(10)  NOT NULL,
    hinhAnh varchar(200)  NOT NULL,
    CONSTRAINT SP_pk PRIMARY KEY  (maSP)
);

-- foreign keys
-- Reference: HoaDon_ChiTietHoaDon (table: ChiTietHoaDon)
ALTER TABLE ChiTietHoaDon ADD CONSTRAINT HoaDon_ChiTietHoaDon
    FOREIGN KEY (maHoaDon)
    REFERENCES HoaDon (maHoaDon)
    ON DELETE  CASCADE 
    ON UPDATE  CASCADE;

-- Reference: KhachHang_HoaDon (table: HoaDon)
ALTER TABLE HoaDon ADD CONSTRAINT KhachHang_HoaDon
    FOREIGN KEY (username)
    REFERENCES KhachHang (username)
    ON DELETE  CASCADE 
    ON UPDATE  CASCADE;

-- Reference: SP_ChiTietHoaDon (table: ChiTietHoaDon)
ALTER TABLE ChiTietHoaDon ADD CONSTRAINT SP_ChiTietHoaDon
    FOREIGN KEY (maSP)
    REFERENCES SP (maSP)
    ON DELETE  CASCADE 
    ON UPDATE  CASCADE;

-- Reference: SP_LoaiSP (table: SP)
ALTER TABLE SP ADD CONSTRAINT SP_LoaiSP
    FOREIGN KEY (maLoai)
    REFERENCES LoaiSP (maLoai)
    ON DELETE  CASCADE 
    ON UPDATE  CASCADE;

-- End of file.
INSERT into KhachHang values('canh','canh123','AD','Nguyen Quoc Canh','Nam','1995/09/18','233213653','0911776579','canhnqpd01197@fpt.edu.vn'),
('lien','lien123','KH','Tran Thi Thuy Lien','Nu','1997/06/05','24585384','01658441001','lien@fpt.edu.vn'),
('gia','gia123','KH','Che Bong Gia','Nam','1997/12/12','234853541','01658552475','gia@fpt.edu.vn'),
('hoang','hoang123','KH','Nguyen Thi Hoang','Nam','1996/05/02','568975321','01665225775','hoang@fpt.edu.vn'),
('phuc','phuc123','KH','Le Van Phuc','Nam','1994/02/02','786945369','01663221521','phuc@fpt.edu.vn')
;
INSERT into LoaiSP values('l1','Sua Tam'),
('l2','Kem tri mun'),
('l3','Kem trang da'),
('l4','Kem tri nam'),
('l5','Kem tri tham')
;
INSERT into SP values('sp1','Sua tam Dove','Trang ngay lap tuc',50,120000,'Dove','l1','suatamdove.jpg'),
('sp2','Kem tri mun acnes','Het mun ngay lap tuc',50,200000,'Acnes','l2','acne.jpg'),
('sp3','Kem White doctors','Trang ngay lap tuc',50,500000,'White doctors','l3','white doctor.png'),
('sp4','Kem Kami skin','Het nam ngay lap tuc',50,300000,'Kami','l4','Kami skin.png'),
('sp5','Kem tri tham Nivea','Cho lan da min mang, mo vet tham',50,90000,'Nivea','l5','Nivea.jpg')
;
INSERT into HoaDon values('HD1','lien','2016/12/12','OK'),
('HD2','phuc','2016/11/12','OK'),
('HD3','hoang','2016/12/10','OK'),
('HD4','gia','2016/12/1','OK'),
('HD5','lien','2016/12/3','OK')
;
INSERT INTO ChiTietHoaDon values('CTHD1','HD1','SP1',2,240000),
('CTHD2','HD2','SP2',1,200000),
('CTHD3','HD3','SP3',1,50000),
('CTHD4','HD4','SP4',1,300000),
('CTHD5','HD5','SP5',3,270000)
;

