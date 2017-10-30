
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.Scene;


public class Calculate extends Application 
{
	
   public static void main(String[] args) 
   {
	   launch(args);
   }
   
   @Override
   public void start(Stage stage) throws Exception
   {
	   GridPane grid = new GridPane();
	   grid.setAlignment(Pos.CENTER);
	   grid.setHgap(10);
	   grid.setVgap(10);
	   grid.setPadding(new Insets(25, 25, 25, 25));

	   Scene scene = new Scene(grid, 300, 275);
	   stage.setScene(scene);
	   
	   Text scenetitle = new Text("Calculate! (i.e. x+y)");
	   scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
	   grid.add(scenetitle, 0, 0, 2, 1);

	   Label xLabel = new Label("X:");
	   grid.add(xLabel, 0, 1);

	   TextField xInput = new TextField();
	   grid.add(xInput, 1, 1);

	   Label yLabel = new Label("Y:");
	   grid.add(yLabel, 0, 2);

	   TextField yInput = new TextField();
	   grid.add(yInput, 1, 2);
	   
	   final Text actiontarget = new Text();
       grid.add(actiontarget, 1, 6);
       
       CalculationFactory factory = new CalculationFactory();
	   
	   Button subBtn = new Button("Subtract -");
	   HBox hbBtn2 = new HBox(10);
	   hbBtn2.setAlignment(Pos.BOTTOM_RIGHT);
	   hbBtn2.getChildren().add(subBtn);
	   grid.add(hbBtn2, 1, 4);
	   subBtn.setOnAction(new EventHandler<ActionEvent>() {
		   
		    @Override
		    public void handle(ActionEvent e) {
		    	try 
		        {
		        	String xStr = xInput.getText();
			        int x = Integer.parseInt(xStr);
			        String yStr = yInput.getText();
			        int y = Integer.parseInt(yStr);	
			        Calculation sub = factory.getOperation("Subtract");
			        float answer = sub.calculate(x, y);			    
			        actiontarget.setFill(Color.GREEN);
			        actiontarget.setText("Answer: " + answer);
		        }
		        catch(Exception except) 
		        {		        	
			        actiontarget.setFill(Color.RED);
		        	actiontarget.setText("Must Provide integers for both X and Y");
		        }
		    }
		});	  
	   
	   Button multBtn = new Button("Multiply *");
	   HBox hbBtn1 = new HBox(10);
	   hbBtn1.setAlignment(Pos.BOTTOM_RIGHT);
	   hbBtn1.getChildren().add(multBtn);
	   grid.add(hbBtn1, 1, 6);
	   multBtn.setOnAction(new EventHandler<ActionEvent>() {
		   
		    @Override
		    public void handle(ActionEvent e) {
		    	try 
		        {
		        	String xStr = xInput.getText();
			        int x = Integer.parseInt(xStr);
			        String yStr = yInput.getText();
			        int y = Integer.parseInt(yStr);	
			        Calculation mult = factory.getOperation("Multiply");
			        float answer = mult.calculate(x, y);			    
			        actiontarget.setFill(Color.GREEN);
			        actiontarget.setText("Answer: " + answer);
		        }
		        catch(Exception except) 
		        {		        	
			        actiontarget.setFill(Color.RED);
		        	actiontarget.setText("Must Provide integers for both X and Y");
		        }
		    }
		});
	   
	   Button divBtn = new Button("Divide /");
	   HBox hbBtn3 = new HBox(10);
	   hbBtn3.setAlignment(Pos.BOTTOM_RIGHT);
	   hbBtn3.getChildren().add(divBtn);
	   grid.add(hbBtn3, 1, 7);
	   divBtn.setOnAction(new EventHandler<ActionEvent>() {
		   
		    @Override
		    public void handle(ActionEvent e) {
		    	try 
		        {
		        	String xStr = xInput.getText();
			        int x = Integer.parseInt(xStr);
			        String yStr = yInput.getText();
			        int y = Integer.parseInt(yStr);	
			        Calculation div = factory.getOperation("Divide");
			        float answer = div.calculate(x, y);			    
			        actiontarget.setFill(Color.GREEN);
			        actiontarget.setText("Answer: " + answer);
		        }
		        catch(Exception except) 
		        {		        	
			        actiontarget.setFill(Color.RED);
		        	actiontarget.setText("Must Provide integers for both X and Y");
		        }
		    }
		});
	   
	   Button addBtn = new Button("Add +");
	   HBox hbBtn4 = new HBox(10);
	   hbBtn4.setAlignment(Pos.BOTTOM_RIGHT);
	   hbBtn4.getChildren().add(addBtn);
	   grid.add(hbBtn4, 1, 5);
	   addBtn.setOnAction(new EventHandler<ActionEvent>() {
		   
		    @Override
		    public void handle(ActionEvent e) {
		        try 
		        {
		        	String xStr = xInput.getText();
			        int x = Integer.parseInt(xStr);
			        String yStr = yInput.getText();
			        int y = Integer.parseInt(yStr);	
			        Calculation add = factory.getOperation("Add");
			        float answer = add.calculate(x, y);	
			        actiontarget.setFill(Color.GREEN);
			        actiontarget.setText("Answer: " + answer);
		        }
		        catch(Exception except) 
		        {		        	
			        actiontarget.setFill(Color.RED);
		        	actiontarget.setText("Must Provide integers for both X and Y");
		        }
		    }
		});
	   

	   stage.show();
   }
}