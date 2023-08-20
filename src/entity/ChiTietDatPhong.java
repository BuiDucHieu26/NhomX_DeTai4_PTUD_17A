/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalTime;
import java.util.Objects;

/**
 *
 * @author HP-PC
 */
public class ChiTietDatPhong {
    private DonDatPhong đonDatPhong;
    private LocalTime gioVao;
    private LocalTime gioRa;
    private Phong Phong;
    
    public ChiTietDatPhong(){}

    public ChiTietDatPhong(DonDatPhong đonDatPhong, LocalTime gioVao, LocalTime gioRa, Phong Phong) {
        this.đonDatPhong = đonDatPhong;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
        this.Phong = Phong;
    }

    public DonDatPhong getĐonDatPhong() {
        return đonDatPhong;
    }

    public void setĐonDatPhong(DonDatPhong đonDatPhong) {
        this.đonDatPhong = đonDatPhong;
    }

    public LocalTime getGioVao() {
        return gioVao;
    }

    public void setGioVao(LocalTime gioVao) {
        this.gioVao = gioVao;
    }

    public LocalTime getGioRa() {
        return gioRa;
    }

    public void setGioRa(LocalTime gioRa) {
        this.gioRa = gioRa;
    }

    public Phong getPhong() {
        return Phong;
    }

    public void setPhong(Phong Phong) {
        this.Phong = Phong;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.đonDatPhong);
        hash = 71 * hash + Objects.hashCode(this.gioVao);
        hash = 71 * hash + Objects.hashCode(this.gioRa);
        hash = 71 * hash + Objects.hashCode(this.Phong);
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
        final ChiTietDatPhong other = (ChiTietDatPhong) obj;
        if (!Objects.equals(this.đonDatPhong, other.đonDatPhong)) {
            return false;
        }
        if (!Objects.equals(this.gioVao, other.gioVao)) {
            return false;
        }
        if (!Objects.equals(this.gioRa, other.gioRa)) {
            return false;
        }
        return Objects.equals(this.Phong, other.Phong);
    }

    @Override
    public String toString() {
        return "ChiTietDatPhong{" + "\u0111onDatPhong=" + đonDatPhong + ", gioVao=" + gioVao + ", gioRa=" + gioRa + ", Phong=" + Phong + '}';
    }
    
    
}
