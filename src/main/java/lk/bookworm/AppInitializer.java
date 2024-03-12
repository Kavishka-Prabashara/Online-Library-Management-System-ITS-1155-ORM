package lk.bookworm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


    public class AppInitializer extends Application {
        public static void main(String[] args) {
            launch(args);
        }

        @Override
        public void start(Stage stage) throws Exception {
            stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/view/login-Page.fxml"))));
            stage.centerOnScreen();
            stage.setTitle("BookWorm Library");
            stage.fullScreenProperty();
            stage.setResizable(false);

            stage.show();
        }
}
