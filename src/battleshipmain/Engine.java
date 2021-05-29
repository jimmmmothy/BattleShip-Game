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
        board.playerOcean.addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseMoved(MouseEvent e) {
                x = e.getX() - board.playerOcean.padding;
                y = e.getY() - board.playerOcean.padding;

                System.out.println(x + " " + y);

                if (x >= 0
                        && x < board.playerOcean.size * board.playerOcean.cellCount
                        && y >= 0
                        && y < board.playerOcean.size * board.playerOcean.cellCount) {
                    highlightCellFromCoords(board.playerOcean);
                } else {
                    for (int i = 0; i < board.playerOcean.cellCount; i++) {
                        for (int j = 0; j < board.playerOcean.cellCount; j++) {
                            board.playerOcean.cells[i][j].unHighlight();
                        }
                    }
                }

                board.playerOcean.repaint();
            }

            @Override
            public void mouseDragged(MouseEvent e) {

            }
        });

        board.playerOcean.addMouseListener(new MouseListener() {
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

        board.enemyOcean.addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseMoved(MouseEvent e) {
                x = e.getX() - board.enemyOcean.padding;
                y = e.getY() - board.enemyOcean.padding;

                System.out.println(x + " " + y);

                if (x >= 0
                        && x < board.enemyOcean.size * board.enemyOcean.cellCount
                        && y >= 0
                        && y < board.enemyOcean.size * board.enemyOcean.cellCount) {
                    highlightCellFromCoords(board.enemyOcean);
                } else {
                    for (int i = 0; i < board.enemyOcean.cellCount; i++) {
                        for (int j = 0; j < board.enemyOcean.cellCount; j++) {
                            board.enemyOcean.cells[i][j].unHighlight();
                        }
                    }
                }

                board.enemyOcean.repaint();
            }

            @Override
            public void mouseDragged(MouseEvent e) {

            }
        });

        board.enemyOcean.addMouseListener(new MouseListener() {
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

    private void placeShips() {

    }

    private void playerTurn() {

    }

    private void enemyTurn() {

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
