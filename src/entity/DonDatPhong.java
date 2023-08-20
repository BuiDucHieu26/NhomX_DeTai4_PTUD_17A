/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalTime;
import  java.sql.Date;
import java.util.Objects;
/**
 *
 * @author HP-PC
 */
public class DonDatPhong {
        public static enum TrangThai{
            DaHuy,DangCho,DangThue,DaTra;
        }
        
        public static TrangThai convertStringToTrangThai(String trangThai){
            if(trangThai.equals("Đã hủy")){
                return TrangThai.DaHuy;
            }else if(trangThai.equals("Đang chờ")){
                return TrangThai.DangCho;
            }else if(trangThai.equals("Đang thuê")){
                return TrangThai.DangThue;
            }
            return TrangThai.DaTra;
        }
        
        public static String convertTrangThaiToString(TrangThai trangThai) {
		if (trangThai.equals(TrangThai.DaHuy))
			return "Đã hủy";
		if (trangThai.equals(TrangThai.DangCho))
			return "Đang chờ";
		if (trangThai.equals(TrangThai.DangThue))
			return "Đang thuê";
		return "Đã trả";
	}
        
        private LocalTime gioDatPhong;
        private LocalTime gioNhanPhong;
        private KhachHang khachHang;
        private String maDonDatPhong;
        private Date ngayDatPhong;
        private Date ngayNhanPhong;
        private NhanVien nhanVien;
        private TrangThai trangThai;
        
        public DonDatPhong(){ 
        }

    public DonDatPhong(LocalTime gioDatPhong, LocalTime gioNhanPhong, KhachHang khachHang, String maDonDatPhong, Date ngayDatPhong, Date ngayNhanPhong, NhanVien nhanVien, TrangThai trangThai) {
        this.gioDatPhong = gioDatPhong;
        this.gioNhanPhong = gioNhanPhong;
        this.khachHang = khachHang;
        this.maDonDatPhong = maDonDatPhong;
        this.ngayDatPhong = ngayDatPhong;
        this.ngayNhanPhong = ngayNhanPhong;
        this.nhanVien = nhanVien;
        this.trangThai = trangThai;
    }

    public LocalTime getGioDatPhong() {
        return gioDatPhong;
    }

    public LocalTime getGioNhanPhong() {
        return gioNhanPhong;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public String getMaDonDatPhong() {
        return maDonDatPhong;
    }

    public Date getNgayDatPhong() {
        return ngayDatPhong;
    }

    public Date getNgayNhanPhong() {
        return ngayNhanPhong;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public TrangThai getTrangThai() {
        return trangThai;
    }

    public void setGioDatPhong(LocalTime gioDatPhong) {
        this.gioDatPhong = gioDatPhong;
    }

    public void setGioNhanPhong(LocalTime gioNhanPhong) {
        this.gioNhanPhong = gioNhanPhong;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public void setMaDonDatPhong(String maDonDatPhong) {
        this.maDonDatPhong = maDonDatPhong;
    }

    public void setNgayDatPhong(Date ngayDatPhong) {
        this.ngayDatPhong = ngayDatPhong;
    }

    public void setNgayNhanPhong(Date ngayNhanPhong) {
        this.ngayNhanPhong = ngayNhanPhong;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public void setTrangThai(TrangThai trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.gioDatPhong);
        hash = 83 * hash + Objects.hashCode(this.gioNhanPhong);
        hash = 83 * hash + Objects.hashCode(this.khachHang);
        hash = 83 * hash + Objects.hashCode(this.maDonDatPhong);
        hash = 83 * hash + Objects.hashCode(this.ngayDatPhong);
        hash = 83 * hash + Objects.hashCode(this.ngayNhanPhong);
        hash = 83 * hash + Objects.hashCode(this.nhanVien);
        hash = 83 * hash + Objects.hashCode(this.trangThai);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DonDatPhong other = (DonDatPhong) obj;
        if (!Objects.equals(this.maDonDatPhong, other.maDonDatPhong)) {
            return false;
        }
        if (!Objects.equals(this.gioDatPhong, other.gioDatPhong)) {
            return false;
        }
        if (!Objects.equals(this.gioNhanPhong, other.gioNhanPhong)) {
            return false;
        }
        if (!Objects.equals(this.khachHang, other.khachHang)) {
            return false;
        }
        if (!Objects.equals(this.ngayDatPhong, other.ngayDatPhong)) {
            return false;
        }
        if (!Objects.equals(this.ngayNhanPhong, other.ngayNhanPhong)) {
            return false;
        }
        if (!Objects.equals(this.nhanVien, other.nhanVien)) {
            return false;
        }
        return this.trangThai == other.trangThai;
    }
        
        
}
