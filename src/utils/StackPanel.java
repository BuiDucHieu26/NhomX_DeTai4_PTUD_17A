/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import entity.PanelUI;
import java.util.Stack;

/**
 *
 * @author HP-PC
 */
public class StackPanel {
    private static Stack<PanelUI> stack = new Stack<>();

	/**
	 * Kiểm tra stack có rỗng hay không?
	 * 
	 * @return true nếu stack rỗng
	 */
	public static boolean empty() {
		return stack.empty();
	}

	/**
	 * Get màn hình top
	 * 
	 * @return
	 */
	public static PanelUI peek() {
		return stack.peek();
	}

	/**
	 * Xóa màn hình top khỏi stack
	 * 
	 * @return màn hình đã xóa
	 */
	public static PanelUI pop() {
		return stack.pop();
	}

	/**
	 * Thêm một màn hình vào stack
	 * 
	 * @param jFrame
	 */
	public static void push(PanelUI jPanel) {
		stack.push(jPanel);
	}
}
