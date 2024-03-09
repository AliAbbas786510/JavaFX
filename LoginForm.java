import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;




public class LoginForm extends Application{
	
	
	public static void main(String[] args) {
		launch(args);
	}

	Scene loginscene;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		Button b1 = new Button("1");
		Button b2 = new Button("2");
		Button b3 = new Button("3");
		Button b4 = new Button("4");
		
		HBox h = new HBox(20, b1, b2, b3, b4);
		
		Scene scene = new Scene(h);
		
		primaryStage.setScene(scene);
		
		primaryStage.setTitle("My APP");
		primaryStage.setHeight(500);
		primaryStage.setWidth(500);
		primaryStage.show();
		
		//Event Handling
		
		b1.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				//System.out.println("Clicked!!");
				addloginScene();
				primaryStage.setScene(loginscene);
				
			}
		});
		
		
	}
	
	void addloginScene() 
	{
		
		Label lblusername = new Label("Username");
		Label lblpass = new Label("Password");
		
		TextField txtusername = new TextField();
		PasswordField txtpass = new PasswordField();
		
		Button btnlogin = new Button("Login");
		
		
		GridPane gp = new GridPane();
		gp.setAlignment(Pos.CENTER);
		gp.setVgap(20);
		gp.setHgap(20);
		gp.add(lblusername, 1, 1);
		gp.add(lblpass, 1, 2);
		gp.add(txtusername, 2, 1);
		gp.add(txtpass, 2, 2);
		gp.add(btnlogin, 2, 3);


		loginscene = new Scene(gp);
		
		
		
	}
	

}
