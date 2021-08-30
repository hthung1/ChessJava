package com.huynh_tan_hung.chess;

import javax.swing.JFrame;

public class Chess {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Chess");
		frame.setSize(616,638);
		frame.setLocation(450, 100);
		ChessPanel panel = new ChessPanel();
		frame.add(panel);
		frame.add(panel);
		frame.setVisible(true);
	}

}
