/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author HP-PC
 */
public class Utils {
    private static final Class<?> _class = Utils.class;
    private static final Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    public static final Rectangle boundsPnlBody = new Rectangle(0, 65, 1086, 508);
	public static final String dangXuatMenuItem = "Đăng xuất";
	public static final Color labelTextField = new Color(150, 150, 150);
	public static final Color lineTextField = new Color(149, 166, 248);
	public static final String nhanVienMenuItem = "Nhân viên";
	public static final Color phongCho = getRGBA(4, 191, 173, 0.85f);
	public static final Color phongDangSuDung = getRGBA(242, 68, 68, 0.85f);
	public static final Color phongTam = new Color(115, 120, 234);
	public static final Color phongTrong = new Color(125, 214, 112, 191);
	public static final Color primaryColor = new Color(140, 177, 180);
	public static final String quanLyDatPhongMenuItem = "Quản lý đặt phòng";
	public static final String quanLyDatPhongTruocMenuItem = "Quản lý đặt phòng trước";
	public static final String quanLyDichVuMenuItem = "Quản lý dịch vụ";
	public static final String quanLyKhachHangMenuItem = "Quản lý khách hàng";
	public static final String quanLyNhanVienMenuItem = "Quản lý nhân viên";
	public static final String quanLyPhongMenuItem = "Quản lý phòng";
	public static final Color secondaryColor = new Color(203, 239, 255);
	public static final String themNhanVienMenuItem = "Thêm nhân viên";
	public static final String thoatMenuItem = "Thoát";
	public static final String thongKeDoanhThuMenuItem = "Doanh thu";
	public static final String thongKeHoaDonMenuItem = "Hóa đơn";
	public static final String thongKeKhachHangMenuItem = "Khách hàng";
	public static final String thongKeMenuItem = "Thống kê";
	public static final String thongTinCaNhanMenuItem = "Thông tin cá nhân";
	public static final String trangChuMenuItem = "Trang chủ";
	public static final String troGiupItem = "Trợ giúp";
    public static ImageIcon getImageIcon(String iconName){
        return new ImageIcon(Utils.class.getResource("/resource/image/"+iconName));
    }
    public static int getScreenHeight(){
        return (int) dimension.getHeight() +7;
    }
    public static int getScreenWidth(){
        return (int) dimension.getWidth() + 14;
    }
    public static int getBodyHeight(){
        return getScreenHeight() - getHeaderHeight();
    }
    public static int getHeaderHeight(){
        return 65;
    }
    public static int getMenuWidth(){
        return 220;
    }
    public static int getBodyWidth(){
        return getScreenWidth()-getMenuWidth();
    }
    /**
	 * Get màu RGBA
	 * 
	 * @param r
	 * @param g
	 * @param b
	 * @param a
	 * @return
	 */
	public static Color getRGBA(int r, int g, int b, float a) {
		return new Color(r, g, b, Math.round(a * 255));
	}
        
	/**
	 * Get left căn giữa component với màn hình
	 * 
	 * @param width
	 * @return
	 */
	public static int getLeft(int width) {
		return (int) Math.ceil((Utils.getScreenWidth() - width - 14) / 2);
	}

	/**
	 * Get left căn giữa component với một width bất kỳ
	 * 
	 * @param widthParent
	 * @param width
	 * @return
	 */
	public static int getLeft(int widthParent, int width) {
		return (int) Math.ceil((widthParent - width) / 2);
	}

    public static class NhanVien {

        public NhanVien() {
        }
    }

}
