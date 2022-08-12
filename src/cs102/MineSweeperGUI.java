package cs102;

import javax.swing.*;
import java.awt.*;

public class MineSweeperGUI extends JPanel {
    private MineGrid mineGrid;

    public MineSweeperGUI(int numberOfRows, int numberOfColumns, int numberOfMines) {
        this.mineGrid = new MineGrid(numberOfRows, numberOfColumns, numberOfMines);
        this.setLayout(new GridLayout(numberOfRows, numberOfColumns));

        for (int i = 0; i < numberOfRows; ++i) {
            for (int j = 0; j < numberOfColumns; ++j) {
                JButton button = new JButton();
                button.addActionListener(new ButtonHandler(i, j, this.mineGrid));
                this.add(button);
            }
        }
    }
}
