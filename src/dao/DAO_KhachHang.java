/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.KhachHang;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author HP-PC
 */
public class DAO_KhachHang {
    public DAO_KhachHang(){
        
    }
    
    public ArrayList<KhachHang> getAllKhachHang(){
        ArrayList<KhachHang> ds = new ArrayList<KhachHang>();
        Connection con = connectDB.ConnectDB.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("select * from KhachHang");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                KhachHang kh = new KhachHang(rs.getString("cccd"),rs.getString("makhachhang"),rs.getString("hoten")
                        , rs.getDate("ngaysinh"),rs.getString("diachi"),rs.getBoolean("gioitinh"),rs.getString("sodienthoai"),rs.getBoolean("trangthaixoa"));
                ds.add(kh);
            }     
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            close(stmt);
        }
        return ds;
    }
    public KhachHang getKhachHangById(String maKH){
        KhachHang kh = new KhachHang();
        Connection con = connectDB.ConnectDB.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement("select * from where makhachhang=?");
            stmt.setString(1, maKH);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                kh.setMaKH(rs.getString("makhachang"));
                kh.setHoTen(rs.getString("hoten"));
                kh.setCccd(rs.getString("cccd"));
                kh.setDiaChi(rs.getString("diachi"));
                kh.setGioiTinh(rs.getBoolean("gioitinh"));
                kh.setSoDienThoai(rs.getString("sodienthoai"));
                kh.setTrangThai(rs.getBoolean("trangthaixoa"));
                kh.setGioiTinh(rs.getBoolean("gioitinh"));
                kh.setSoDienThoai(rs.getString("sodienthoai"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(stmt);
        }
        return kh;
    }
    private void close(PreparedStatement st) {
		if(st!=null) {
			try {
				st.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
