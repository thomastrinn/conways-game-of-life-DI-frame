package com.thomas.gameoflife;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import javax.inject.Inject;

/**
 *
 * @author thomas
 */
public class GameOfLifeController {

    @Inject
    private CellLoader cellLoader;
    @Inject
    private GameOfLife gameOfLife;
    @Inject
    private CellDrawer cellDrawer;
    @Inject
    private Timer timer;

    public void start(final Stage primaryStage, final GraphicsContext gc) throws Exception {
        final List<Cell> cells = cellLoader.loadCells("gosper_glider_gun.json");
        
        cellDrawer.init(primaryStage, gc);

        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                cellDrawer.draw(cells);

                gameOfLife.nextGeneration(cells);
            }
        }, 0, 60);
    }

    public void stop() {
        timer.cancel();
    }
}
