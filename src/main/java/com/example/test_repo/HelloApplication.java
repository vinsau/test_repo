package com.example.test_repo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Main application class for the JavaFX application.
 */
public final class HelloApplication extends Application {
  private static final int SCENE_WIDTH = 320;
  private static final int SCENE_HEIGHT = 240;

  /**
   * Starts the JavaFX application.
   *
   * @param stage the primary stage for this application
   * @throws IOException if the FXML file cannot be loaded
   */
  @Override
  public void start(final Stage stage) throws IOException {
    FXMLLoader fxmlLoader =
        new FXMLLoader(HelloApplication.class.getResource("/com/example/test_repo/hello-view.fxml"));
    Scene scene = new Scene(fxmlLoader.load(), SCENE_WIDTH, SCENE_HEIGHT);
    stage.setTitle("Hello, World!");
    stage.setScene(scene);
    stage.show();
  }

  /**
   * Main method to launch the application.
   *
   * @param args the command-line arguments
   */
  public static void main(final String[] args) {
    launch();
  }
}
