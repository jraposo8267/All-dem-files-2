import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.StackPane.*;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.text.Text;
import javafx.scene.control.*;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
//import javax.swing.JOptionPane;
//String response = JOptionPane.showInputDialog(null,"What is your name?", "Enter your name", JOptionPane.QUESTION_MESSAGE);

public class RaposoJLab12 extends Application { 
    /**
    * @param args the command line arguments
    */
        public static void main(String[] args) {
         Application.launch(args);
        }
  
        @Override
   
        public void start(Stage primaryStage) {
             primaryStage.setTitle("Temperature");
    
             Group root = new Group();
   
             Scene scene = new Scene(root, 300, 300);

             StackPane pain = new StackPane(); //in order to have a text field we first have to summon a stack pane

             Label label = new Label("Easter Egg");
             
             TextField celcius = new TextField("0"), kelvin = new TextField("0"), farenheit = new TextField("0");

            Text Celciustxt = new Text(20, 20, "Celcius-");
            Text Farenheitxt = new Text(20, 220, "Farenheit-");
            Text Kelvintxt = new Text(20, 120, "Kelvin-");
            Font arialFont = Font.font("Arial", 16);

            label.setLayoutX(350);

            Celciustxt.setFont(arialFont);
            Celciustxt.setFill(Color.BLACK);
            root.getChildren().add(Celciustxt);

            Farenheitxt.setFont(arialFont);
            Farenheitxt.setFill(Color.BLACK);
            root.getChildren().add(Farenheitxt);

            Kelvintxt.setFont(arialFont);
            Kelvintxt.setFill(Color.BLACK);
            root.getChildren().add(Kelvintxt);

            celcius.setLayoutX(100);
            celcius.setLayoutY(0);

            kelvin.setLayoutX(100);
            kelvin.setLayoutY(100);

            farenheit.setLayoutX(100);
            farenheit.setLayoutY(200);
            
            EventHandler<ActionEvent> event1 = new EventHandler<ActionEvent>() {
                public void handle(ActionEvent e)
               {
                    label.setText(celcius.getText());

                   Double cel = Double.parseDouble(celcius.getText());
                   Double kel = cel + 273.15;
                   Double far = (cel * 1.8) + 32.0;
                   
                   String farstring = String.valueOf(far);
                   String kelvinstring = String.valueOf(kel);

                   kelvin.setText(kelvinstring);
                   farenheit.setText(farstring);
               }
           };
            
           
           EventHandler<ActionEvent> event2 = new EventHandler<ActionEvent>() {
                 public void handle(ActionEvent e)
                {

                    label.setText(kelvin.getText());
                    Double kel = Double.parseDouble(kelvin.getText());
                    Double cel = kel - 273.15;
                    Double far = (cel * 1.8) + 32.0;

                    String celString = String.valueOf(cel);
                    String farstring = String.valueOf(far);
                    
                    celcius.setText(celString);
                    farenheit.setText(farstring);
                }
            };


           EventHandler<ActionEvent> event3 = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
           {

                label.setText(kelvin.getText());
               Double far = Double.parseDouble(farenheit.getText());
               Double cel = (far -32.0) * (5.0/9.0);
               Double kel = cel + 273.15;

               String kelvinstring = String.valueOf(kel);
               String celstring = String.valueOf(cel);
              
               kelvin.setText(kelvinstring);
               celcius.setText(celstring);
           }
       };
            
            celcius.setOnAction(event1);
            kelvin.setOnAction(event2);
            farenheit.setOnAction(event3);

            root.getChildren().add(celcius);
            root.getChildren().add(farenheit);
            root.getChildren().add(kelvin);
            root.getChildren().add(label);
            
            primaryStage.setScene(scene);
   
            primaryStage.show();
        }
    }
