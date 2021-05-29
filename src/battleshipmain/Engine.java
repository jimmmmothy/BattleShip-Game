package battleshipmain;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Engine {
	public void placeShips() {

	}

	public void playerTurn() {

	}

	public void enemyTurn() {

	}

	private void findMouseCoords() {

	}

	public static void main(String[] args) {
		Board board = new Board();
		board.playerOcean.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println("1    " + (e.getX()-30));
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				System.out.println("2    " + (e.getX()-30));
			}
		});
	}
}
