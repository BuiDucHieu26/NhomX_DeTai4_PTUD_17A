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
public class NhanVien {
	public static enum ChucVu {
		NhanVien, QuanLy
	}

	public static enum TrangThai {
		DangLam, NghiLam
	}

	public static String convertChucVuToString(ChucVu chucVu) {
		if (chucVu.equals(ChucVu.NhanVien))
			return "Nhân viên";
		return "Quản lý";
	}

	public static ChucVu convertStringToChucVu(String chucVu) {
		if (chucVu.equals("Nhân viên"))
			return ChucVu.NhanVien;
		return ChucVu.QuanLy;
	}

	public static TrangThai convertStringToTrangThai(String trangThai) {
		if (trangThai.equals("Đang làm"))
			return TrangThai.DangLam;
		return TrangThai.NghiLam;
	}

	public static String convertTrangThaiToString(TrangThai trangThai) {
		if (trangThai.equals(TrangThai.DangLam))
			return "Đang làm";
		return "Nghỉ làm";
	}

	private String cccd;
	private ChucVu chucVu;
	private String diaChiCuThe;
	private boolean gioiTinh;
	private String hoTen;
	private double luong;
	private String maNhanVien;
	private String soDienThoai;
	private String diaChi;
	private TrangThai trangThai;
	private int soCaLam;
	private int soCaDaLam;
	private String nhiemVu;

	public NhanVien() {
		super();
	}

	public NhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public NhanVien(String maNhanVien, String hoTen, String cccd, String soDienThoai, boolean gioiTinh,
			String diaChi, ChucVu chucVu, double luong, TrangThai trangThai) {
		super();
		this.maNhanVien = maNhanVien;
		this.hoTen = hoTen;
		this.cccd = cccd;
		this.soDienThoai = soDienThoai;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		this.chucVu = chucVu;
		this.luong = luong;
		this.trangThai = trangThai;
	}

	public NhanVien(String cccd, ChucVu chucVu, String diaChiCuThe, boolean gioiTinh, String hoTen, double luong,
			String maNhanVien, String soDienThoai, String diaChi, TrangThai trangThai, int soCaLam,
			int soCaDaLam, String nhiemVu) {
		this.cccd = cccd;
		this.chucVu = chucVu;
		this.diaChiCuThe = diaChiCuThe;
		this.gioiTinh = gioiTinh;
		this.hoTen = hoTen;
		this.luong = luong;
		this.maNhanVien = maNhanVien;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
		this.trangThai = trangThai;
		this.soCaLam = soCaLam;
		this.soCaDaLam = soCaDaLam;
		this.nhiemVu = nhiemVu;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhanVien other = (NhanVien) obj;
		return Objects.equals(maNhanVien, other.maNhanVien);
	}

	public String getCccd() {
		return cccd;
	}

	public ChucVu getChucVu() {
		return chucVu;
	}

	public String getDiaChiCuThe() {
		return diaChiCuThe;
	}

	public String getHoTen() {
		return hoTen;
	}

	public double getLuong() {
		return luong;
	}

	public String getMaNhanVien() {
		return maNhanVien;
	}

	public TrangThai getTrangThai() {
		return trangThai;
	}





	public String getSoDienThoai() {
		return soDienThoai;
	}

	public String getDiaChi() {
		return diaChi;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maNhanVien);
	}

	public boolean isGioiTinh() {
		return gioiTinh;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	public void setChucVu(ChucVu chucVu) {
		this.chucVu = chucVu;
	}

	public void setDiaChiCuThe(String diaChiCuThe) {
		this.diaChiCuThe = diaChiCuThe;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}

	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public void setTrangThai(TrangThai trangThai) {
		this.trangThai = trangThai;
	}

	public int getSoCaLam() {
		return soCaLam;
	}

	public void setSoCaLam(int soCaLam) {
		this.soCaLam = soCaLam;
	}

	public int getSoCaDaLam() {
		return soCaDaLam;
	}

	public void setSoCaDaLam(int soCaDaLam) {
		this.soCaDaLam = soCaDaLam;
	}

	public String getNhiemVu() {
		return nhiemVu;
	}

	public void setNhiemVu(String nhiemVu) {
		this.nhiemVu = nhiemVu;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
        
        

}
