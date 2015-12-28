package com.thomas.gameoflife;

import com.google.inject.Guice;
import com.google.inject.Injector;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author thomas
 */
public class GameOfLifeApplication extends Application {

    private static final int SCENE_HEIGHT = 400;
    private static final int SCENE_WIDTH = 500;
    
    private final GameOfLifeController controller;

    public GameOfLifeApplication() {
        Injector injector = Guice.createInjector(new ApplicationInjector());
        controller = injector.getInstance(GameOfLifeController.class);
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(final Stage primaryStage) throws Exception {
        primaryStage.setTitle("Conway's Game of Life");

        Group root = new Group();
        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT, Color.WHITE);

        Canvas canvas = new Canvas();

        canvas.widthProperty().bind(primaryStage.widthProperty());
        canvas.heightProperty().bind(primaryStage.heightProperty());

        root.getChildren().add(canvas);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        controller.start(primaryStage, canvas.getGraphicsContext2D());
    }

    @Override
    public void stop() {
        controller.stop();
    }
}
