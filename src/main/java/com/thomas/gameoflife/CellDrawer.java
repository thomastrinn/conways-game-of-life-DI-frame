package com.thomas.gameoflife;

import java.util.List;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author thomas
 */
public class CellDrawer {

    private static final int CELL_SIZE = 10;

    private static final Color COLOR_GREEN_GOSSIP = Color.rgb(135, 211, 124);

    private Stage primaryStage;
    private GraphicsContext gc;

    public void init(final Stage primaryStage, final GraphicsContext gc) {
        this.primaryStage = primaryStage;
        this.gc = gc;
    }

    public void draw(List<Cell> cells) {
        gc.clearRect(0, 0, primaryStage.getWidth(), primaryStage.getHeight());

        gc.setFill(COLOR_GREEN_GOSSIP);
        for (Cell cell : cells) {
            gc.fillOval(
                    CELL_SIZE * cell.getX(),
                    CELL_SIZE * cell.getY(),
                    CELL_SIZE,
                    CELL_SIZE);
        }

        gc.restore();
    }
}
