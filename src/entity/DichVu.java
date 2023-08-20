/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Objects;

/**
 *
 * @author HP-PC
 */
public class DichVu {
    private LoaiDichVu loaiDichVu;
    private String maDichVu;
    private double giaMua;
    private int soLuong;
    private String donViTinh;
    private String tenDichVu;
    private boolean daNgungKinhDoanh;
    public DichVu(){
        
    }
    public DichVu(String maDichVu, String tenDichVu, int soLuong, String donViTinh, LoaiDichVu loaiDichVu,
			double giaMua, boolean daNgungKinhDoanh) {
		super();
		this.maDichVu = maDichVu;
		this.tenDichVu = tenDichVu;
		this.soLuong = soLuong;
		this.donViTinh = donViTinh;
		this.loaiDichVu = loaiDichVu;
		this.giaMua = giaMua;
		this.daNgungKinhDoanh = daNgungKinhDoanh;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DichVu other = (DichVu) obj;
		return Objects.equals(maDichVu, other.maDichVu);
	}

	public boolean getDaNgungKinhDoanh() {
		return daNgungKinhDoanh;
	}

	public String getDonViTinh() {
		return donViTinh;
	}

	public double getGiaBan() {
		return getGiaMua() * 1.5;
	}

	public double getGiaMua() {
		return giaMua;
	}

	public LoaiDichVu getLoaiDichVu() {
		return loaiDichVu;
	}

	public String getMaDichVu() {
		return maDichVu;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public String getTenDichVu() {
		return tenDichVu;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maDichVu);
	}

	public void setDaNgungKinhDoanh(boolean daNgungKinhDoanh) {
		this.daNgungKinhDoanh = daNgungKinhDoanh;
	}

	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}

	public void setGiaMua(double giaMua) {
		this.giaMua = giaMua;
	}

	public void setLoaiDichVu(LoaiDichVu loaiDichVu) {
		this.loaiDichVu = loaiDichVu;
	}

	public void setMaDichVu(String maDichVu) {
		this.maDichVu = maDichVu;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public void setTenDichVu(String tenDichVu) {
		this.tenDichVu = tenDichVu;
	}

	@Override
	public String toString() {
		return "DichVu [maDichVu=" + maDichVu + ", tenDichVu=" + tenDichVu + ", soLuong=" + soLuong + ", donViTinh="
				+ donViTinh + ", loaiDichVu=" + loaiDichVu + ", giaMua=" + giaMua + ", daNgungKinhDoanh="
				+ daNgungKinhDoanh + "]";
	}
}
