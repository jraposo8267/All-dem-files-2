import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.text.Text;
import javafx.scene.control.*;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;


public class RaposoJLab10 extends Application {
    /**
    * @param args the command line arguments
    */
        public static void main(String[] args) {
         Application.launch(args);
        }
  
        @Override
   
        public void start(Stage primaryStage) {
             primaryStage.setTitle("Hello World");
    
             Group root = new Group();
   
             Scene scene = new Scene(root, 300, 300);
   
             Button btn = new Button(), onoff = new Button();

            Text text = new Text(120, 80, "Make Java Great Again!");
            Font arialFont = Font.font("Arial", 16);

            text.setFont(arialFont);
            text.setFill(Color.WHITE);
            root.getChildren().add(text);
   
             btn.setLayoutX(60); //sets x coordinate of button
             btn.setLayoutY(60);  // sets y coordinate of button
             btn.setText("Java"); // name of button

             onoff.setLayoutX(60);
             onoff.setLayoutY(120);
             onoff.setText("OFF");
   
             btn.setOnAction(new EventHandler<ActionEvent>() {
   
                public void handle(ActionEvent event) { // everything inside this happens when the button is pressed
   
                    if (text.getFill().equals(Color.WHITE))
                        text.setFill(Color.BLACK);

                    else text.setFill(Color.WHITE);
                }
            });

            onoff.setOnAction(new EventHandler<ActionEvent>() {
   
                public void handle(ActionEvent event) { // everything inside this happens when the button is pressed
   
                    if(onoff.getText().equals("OFF"))
                        onoff.setText("ON");
                    
                    else onoff.setText("OFF");
                }
            });
   
            root.getChildren().add(btn);
            root.getChildren().add(onoff);
            
            primaryStage.setScene(scene);
   
            primaryStage.show();
        }
    }
