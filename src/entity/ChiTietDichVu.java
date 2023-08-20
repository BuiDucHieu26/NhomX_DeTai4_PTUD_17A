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
public class ChiTietDichVu {
    private ChiTietDatPhong chiTietDatPhong;
    private DichVu dichVu;
    private int soLuong;
    public ChiTietDichVu(){}

    public ChiTietDichVu(ChiTietDatPhong chiTietDatPhong, DichVu dichVu, int soLuong) {
        this.chiTietDatPhong = chiTietDatPhong;
        this.dichVu = dichVu;
        this.soLuong = soLuong;
    }

    public ChiTietDatPhong getChiTietDatPhong() {
        return chiTietDatPhong;
    }

    public void setChiTietDatPhong(ChiTietDatPhong chiTietDatPhong) {
        this.chiTietDatPhong = chiTietDatPhong;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.chiTietDatPhong);
        hash = 83 * hash + Objects.hashCode(this.dichVu);
        hash = 83 * hash + this.soLuong;
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
        final ChiTietDichVu other = (ChiTietDichVu) obj;
        if (this.soLuong != other.soLuong) {
            return false;
        }
        if (!Objects.equals(this.chiTietDatPhong, other.chiTietDatPhong)) {
            return false;
        }
        return Objects.equals(this.dichVu, other.dichVu);
    }
    
    
}
