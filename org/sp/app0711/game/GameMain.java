package org.sp.app0711.game;

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class GameMain extends JFrame {
	GamePanel gamepanel;
	
	public GameMain() {
		gamepanel = new GamePanel();
		
		add(gamepanel);
		
		
		
		pack();
		setVisible(true);
		setLocationRelativeTo(null);//html margin auto
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	
		//윈도우가 취급한 포커스를 패널에 전달하기
		gamepanel.requestFocus();
	}
	

	
	public static void main(String[] args) {
		new GameMain();
	}
}
