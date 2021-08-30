package com.huynh_tan_hung.chess;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class ChessPanel extends JPanel {
	int size = 75;
	Graphics2D g2;

	@Override
	protected void paintChildren(Graphics g) {
		super.paintChildren(g);
		g2 = (Graphics2D) g;

		chessBoard();
		
	}
	public void chessBoard() {
		for (int i = 0; i < 4; i++) {
			g2.setColor(Color.black);
			for (int j = 0; j < 4; j++) {
				g2.fillRect(size * 2 * i, size * j * 2, size, size);
				g2.fillRect(size + (size * 2 * i), size + (size * j * 2), size, size);
			}
			g2.setColor(Color.white);
			for (int j = 0; j < 4; j++) {
				g2.fillRect(size + (size * 2 * i), size * j * 2, size, size);
				g2.fillRect((size * 2 * i), size + (size * j * 2), size, size);
			}
		}
	}
}
