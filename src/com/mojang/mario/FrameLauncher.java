package com.mojang.mario;

import javax.swing.JFrame;

public class FrameLauncher {

	public static void main(String[] args) {
		MarioComponent mario = new MarioComponent(640, 480);
		JFrame frame = new JFrame("Mario Test");
		frame.setContentPane(mario);
		frame.pack();
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.addKeyListener(mario);
		frame.addFocusListener(mario);
		frame.setVisible(true);
		mario.start();
	}
}