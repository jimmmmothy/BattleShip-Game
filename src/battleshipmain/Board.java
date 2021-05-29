package battleshipmain;

import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {
    public Ocean playerOcean;
    public Ocean enemyOcean;
    
    public Board() {
        playerOcean = new PlayerOcean();
        enemyOcean = new EnemyOcean();
//        JFrame frame = new JFrame();
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        JPanel buttonPanel = new JPanel();
//        JPanel containerPanel = new JPanel();
//        buttonPanel.setLayout(new GridLayout(2,2));
//        buttonPanel.add(new JButton("1"));
//        buttonPanel.add(new JButton("2"));
//        buttonPanel.add(new JButton("3"));
//        buttonPanel.add(new JButton("4"));
//        buttonPanel.setPreferredSize(new Dimension(300, 400));
//        containerPanel.add(buttonPanel);
//
//        frame.getContentPane().add(containerPanel);
//        frame.pack();
//        frame.setVisible(true);
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                    ex.printStackTrace();
                }

                JFrame frame = new JFrame("Testing");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                JPanel mainPanel = new JPanel();
                mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));                
                mainPanel.add(playerOcean);
                mainPanel.add(enemyOcean);
                mainPanel.setVisible(true);
                
                frame.add(mainPanel);
                frame.setSize(1100, 950);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
