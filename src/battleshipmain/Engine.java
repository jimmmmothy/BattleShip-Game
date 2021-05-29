package battleshipmain;

import java.awt.event.*;

public class Engine {

	public Board board;
	private int x;
	private int y;

	public Engine(Board board) {
		this.board = board;
	}

	public void run() {
		mouseListeners(board.playerOcean);
		mouseListeners(board.enemyOcean);
	}

	private void placeShips() {

	}

	private void playerTurn() {

	}

	private void enemyTurn() {

	}

	private void mouseListeners(Ocean ocean) {
		ocean.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseMoved(MouseEvent e) {
				x = e.getX() - ocean.padding;
				y = e.getY() - ocean.padding;

				System.out.println(x + " " + y);

				if (x >= 0 && x < ocean.size * ocean.cellCount && y >= 0 && y < ocean.size * ocean.cellCount) {
					highlightCellFromCoords(ocean);
				} else {
					for (int i = 0; i < ocean.cellCount; i++) {
						for (int j = 0; j < ocean.cellCount; j++) {
							ocean.cells[i][j].unHighlight();
						}
					}
				}

				ocean.repaint();
			}

			@Override
			public void mouseDragged(MouseEvent e) {

			}
		});

		ocean.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent me) {

			}

			@Override
			public void mousePressed(MouseEvent me) {

			}

			@Override
			public void mouseReleased(MouseEvent me) {

			}

			@Override
			public void mouseEntered(MouseEvent me) {

			}

			@Override
			public void mouseExited(MouseEvent me) {

			}
		});
	}

	private void highlightCellFromCoords(Ocean ocean) {
		int currX = x / ocean.size;
		int currY = y / ocean.size;

		for (int i = 0; i < ocean.cellCount; i++) {
			for (int j = 0; j < ocean.cellCount; j++) {
				ocean.cells[i][j].unHighlight();
			}
		}

		ocean.cells[currX][currY].highlight();
	}
}
