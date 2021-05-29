package battleshipmain;

import java.awt.*;
import javax.swing.*;

public abstract class Ocean extends JPanel {

    protected final int cellCount = 10;
    protected final int dimensions = 450;
    protected final int size = 40;
    protected final int padding = 30;

    protected int x;
    protected int y;
    protected Cell[][] cells;

    public Ocean() {
        x = padding;
        y = padding;

        cells = new Cell[cellCount][cellCount];
        initializeGrid();
    }

    private void initializeGrid() {
        for (int i = 0; i < cellCount; i++) {
            for (int j = 0; j < cellCount; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g.create();

        g2d.setColor(Color.CYAN);
        //int size = Math.min(getWidth() - 30, getHeight() - 30) / 10;
        //int width = getWidth() - (size * 2);
        //int height = getHeight() - (size * 2);

        //int y = (getHeight() - (size * 10)) / 2;
        int y = this.y;

        for (int horz = 0; horz < cellCount; horz++) {
            //int x = (getWidth() - (size * 10)) / 2;
            int x = this.x;

            for (int vert = 0; vert < cellCount; vert++) {
                g2d.drawRect(x, y, size, size);
                
                x += size;
            }

            y += size;
        }
        
        y = this.y;
        
        for (int horz = 0; horz < cellCount; horz++) {
            //int x = (getWidth() - (size * 10)) / 2;
            int x = this.x;

            for (int vert = 0; vert < cellCount; vert++) {
                if (cells[vert][horz].isHighlighted) {
                    g2d.setColor(Color.MAGENTA);
                    g2d.drawRect(x, y, size, size);
                } 
                
                x += size;
            }

            y += size;
        }

        g2d.dispose();
    }
}
