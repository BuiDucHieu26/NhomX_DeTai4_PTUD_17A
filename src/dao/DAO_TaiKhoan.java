/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connectDB.ConnectDB;
import entity.NhanVien;
import entity.TaiKhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author HP-PC
 */
public class DAO_TaiKhoan {
    public boolean capNhatMatKhau(TaiKhoan taiKhoan) {
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection()
					.prepareStatement("UPDATE TaiKhoan SET matKhau = ? WHERE nhanVien = ?");
			preparedStatement.setString(1, taiKhoan.getMatKhau());
			preparedStatement.setString(2, taiKhoan.getNhanVien().getMaNhanVien());

			return preparedStatement.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	private TaiKhoan getTaiKhoan(ResultSet resultSet) throws SQLException {
		String maNhanVien = resultSet.getString(1);
		String matKhau = resultSet.getString(2);
                NhanVien nv = new NhanVien(maNhanVien);
		return new TaiKhoan(matKhau,nv);
	}

	public TaiKhoan getTaiKhoan(String maNhanVien) {
		try {
			PreparedStatement preparedStatement = ConnectDB.getConnection()
					.prepareStatement("SELECT * FROM TaiKhoan WHERE nhanVien = ?");
			preparedStatement.setString(1, maNhanVien);

			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next())
				return getTaiKhoan(resultSet);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public boolean isTaiKhoan(TaiKhoan taiKhoan) {
		PreparedStatement statement;
		try {
			statement = ConnectDB.getConnection()
					.prepareStatement("SELECT * FROM TaiKhoan WHERE nhanVien = ? AND matKhau = ?");
			statement.setString(1, taiKhoan.getNhanVien().getMaNhanVien());
			statement.setString(2, taiKhoan.getMatKhau());
			ResultSet resultSet = statement.executeQuery();

			return resultSet.next();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}
}
