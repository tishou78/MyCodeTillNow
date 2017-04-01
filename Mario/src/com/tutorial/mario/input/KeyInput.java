package com.tutorial.mario.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.tutorial.mario.Game;
import com.tutorial.mario.entity.Entity;

public class KeyInput implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		for (Entity en : Game.handler.entity) {
			switch (key) {
			case KeyEvent.VK_W:
			case KeyEvent.VK_UP:
				en.setVelY(-5);
				break;
			case KeyEvent.VK_S:
			case KeyEvent.VK_DOWN:
				en.setVelY(5);
				break;
			case KeyEvent.VK_A:
			case KeyEvent.VK_LEFT:
				en.setVelX(-5);
				break;
			case KeyEvent.VK_D:
			case KeyEvent.VK_RIGHT:
				en.setVelX(5);
				break;
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		for (Entity en : Game.handler.entity) {
			switch (key) {
			case KeyEvent.VK_W:
			case KeyEvent.VK_UP:
				en.setVelY(0);
				break;
			case KeyEvent.VK_S:
			case KeyEvent.VK_DOWN:
				en.setVelY(0);
				break;
			case KeyEvent.VK_A:
			case KeyEvent.VK_LEFT:
				en.setVelX(0);
				break;
			case KeyEvent.VK_D:
			case KeyEvent.VK_RIGHT:
				en.setVelX(0);
				break;
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// not using
	}

}
