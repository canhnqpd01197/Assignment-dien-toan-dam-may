/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author goodmorning
 */
public class TKKH {
    String userNameKH,passKH,tenKH,gioiTinh,soDT,soCMND,diaChi,email,ngayDangKi;

    public TKKH(String userNameKH, String passKH, String tenKH, String gioiTinh, String soDT, String soCMND, String diaChi, String email, String ngayDangKi) {
        this.userNameKH = userNameKH;
        this.passKH = passKH;
        this.tenKH = tenKH;
        this.gioiTinh = gioiTinh;
        this.soDT = soDT;
        this.soCMND = soCMND;
        this.diaChi = diaChi;
        this.email = email;
        this.ngayDangKi = ngayDangKi;
    }

    public TKKH() {
    }

    public String getUserNameKH() {
        return userNameKH;
    }

    public void setUserNameKH(String userNameKH) {
        this.userNameKH = userNameKH;
    }

    public String getPassKH() {
        return passKH;
    }

    public void setPassKH(String passKH) {
        this.passKH = passKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNgayDangKi() {
        return ngayDangKi;
    }

    public void setNgayDangKi(String ngayDangKi) {
        this.ngayDangKi = ngayDangKi;
    }
    
}
