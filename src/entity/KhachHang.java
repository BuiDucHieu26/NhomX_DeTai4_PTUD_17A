/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
import java.sql.Date;
import java.util.Objects;
/**
 *
 * @author HP-PC
 */
public class KhachHang {
        private String cccd;
        private String maKH;
        private String hoTen;
        private String diaChi;
        private boolean  gioiTinh;
        private String soDienThoai;
        private boolean trangThai;

       

        
    public KhachHang(){
        
    }
    public KhachHang(String cccd, String maKH, String hoTen, Date ngaySinh, String diaChi, boolean gioiTinh, String soDienThoai, boolean trangThai) {
        this.cccd = cccd;
        this.maKH = maKH;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;
        this.trangThai = trangThai;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
        this.soDienThoai = soDienThoai;

    }

    public String getCccd() {
        return cccd;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getHoTen() {
        return hoTen;
    }
    public String getDiaChi() {
        return diaChi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }


    public boolean isTrangThai() {
        return trangThai;
    }



    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }


    public void setTrangThai(boolean trangThaiThai) {
        this.trangThai = trangThaiThai;
    }

      
  
    
    
   
   

        
        
        
}
