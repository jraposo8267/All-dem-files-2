import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.scene.transform.Scale;
import javafx.scene.control.*;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

//Line nodes drawn on the scene graph default to a stroke width of 1.0 (double) and a stroke color of black (Color.BLACK). According to the Javadoc, all shapes have a stroke color of null (no color) except Line, Polyline, and Path nodes.

public class RaposoJLab11 extends Application {
    /**
    * @param args the command line arguments
    */
        public static void main(String[] args) {
         Application.launch(args);
        }
  
        @Override
   
        public void start(Stage primaryStage) {
            primaryStage.setTitle("Lab 11");
    
            Group root = new Group();
   
            Scene scene = new Scene(root, 400, 400);

            Scale scale = new Scale();
            scale.setX(1);
            scale.setY(1);
   
            Button scalebutton = new Button(), colorbutton = new Button();
            root.getChildren().add(scalebutton);
            root.getChildren().add(colorbutton);

            Line line = new Line(20, 20, 200, 200), thickline = new Line(120, 340, 360, 340);
            thickline.setStrokeWidth(40);
            root.getChildren().add(line);       root.getChildren().add(thickline);
            
            Circle circle = new Circle(200, 200, 100);
            circle.setFill(Color.TRANSPARENT);
            circle.setStroke(Color.BLACK);
            root.getChildren().add(circle);

            Ellipse egg = new Ellipse(50, 50, 30, 25);
            root.getChildren().add(egg);

            Rectangle longboi = new Rectangle(30, 200, 40, 180);
            longboi.setFill(Color.TRANSPARENT);
            longboi.setStroke(Color.BLACK);
            root.getChildren().add(longboi);

            Text text = new Text(80, 50, "This is drawn on the canvas.");
            Font arialFont = Font.font("Arial", 24);
            
            text.setFont(arialFont);
            text.setFill(Color.BLACK);
            root.getChildren().add(text);
   
            scalebutton.setLayoutX(220); //sets x coordinate of button
            scalebutton.setLayoutY(370);  // sets y coordinate of button
            scalebutton.setText("Change Scale"); // name of button

            colorbutton.setLayoutX(90);
            colorbutton.setLayoutY(370);
            colorbutton.setText("Change Color");
            

            scalebutton.setOnAction(new EventHandler<ActionEvent>() { //for this wile loop we will use shape.contains(localX, localY) (I believe so)
   
                public void handle(ActionEvent event) { // everything inside this happens when the button is pressed
   
                    scale.setX(scale.getX() * 2);
                    scale.setY(scale.getY() * 2);

                    if(scale.getX() > 1){
                        scale.setX(.25);
                        scale.setY(.25);
                    }
                }
            });

            circle.getTransforms().addAll(scale);
            line.getTransforms().addAll(scale);
            egg.getTransforms().addAll(scale);
            thickline.getTransforms().addAll(scale);
            longboi.getTransforms().addAll(scale);
            text.getTransforms().addAll(scale);

            colorbutton.setOnAction(new EventHandler<ActionEvent>() {
   
                public void handle(ActionEvent event) { // everything inside this happens when the button is pressed
   
                    if (text.getFill().equals(Color.BLACK)){

                        line.setStroke(Color.RED);  thickline.setStroke(Color.RED);     egg.setFill(Color.RED);
                        circle.setStroke(Color.RED); egg.setStroke(Color.RED); longboi.setStroke(Color.RED); text.setFill(Color.RED);
                    
                    }else if(text.getFill().equals(Color.RED)) {

                        line.setStroke(Color.GREEN);  thickline.setStroke(Color.GREEN);     egg.setFill(Color.GREEN);
                        circle.setStroke(Color.GREEN); egg.setStroke(Color.GREEN); longboi.setStroke(Color.GREEN); text.setFill(Color.GREEN);
                       
                    }else if(text.getFill().equals(Color.GREEN)) {

                        line.setStroke(Color.BLUE);  thickline.setStroke(Color.BLUE);     egg.setFill(Color.BLUE);
                        circle.setStroke(Color.BLUE); egg.setStroke(Color.BLUE); longboi.setStroke(Color.BLUE); text.setFill(Color.BLUE);
                    
                    }else if(text.getFill().equals(Color.BLUE)){

                        line.setStroke(Color.BLACK);  thickline.setStroke(Color.BLACK);     egg.setFill(Color.BLACK);
                        circle.setStroke(Color.BLACK); egg.setStroke(Color.BLACK); longboi.setStroke(Color.BLACK); text.setFill(Color.BLACK);
                    }
                }
            });
    
            primaryStage.setScene(scene);
   
            primaryStage.show();
        }
    }
