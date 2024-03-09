import javafx.application.Application;
import javafx.stage.FileChooser;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MyApp extends Application{

	Stage stage;
	Scene scene;
	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		this.stage = stage;
		
		addcomponent();
	}
	
	void addcomponent() {
		
		Label lblname = new Label("Name");
		TextField txtname = new TextField();
		
		Label lblemail = new Label("Email");
		TextField txtemail = new TextField();

		Label lblpass = new Label("Password");
		PasswordField txtpass = new PasswordField();

		Label lblphone = new Label("Phone");
		TextField txtphone = new TextField();

		Label lblgender = new Label("Gender");
		ToggleGroup togglegroup = new ToggleGroup();
		RadioButton rbmale = new RadioButton("Male");
		RadioButton rbfemale = new RadioButton("Female");
		
		rbmale.setToggleGroup(togglegroup);
		rbfemale.setToggleGroup(togglegroup);
			
		Label lblabout = new Label("About");
		TextArea txtarea = new TextArea();
		
		Label lbllanguage = new Label("Language");
		ComboBox<String> cmblng = new ComboBox<String>();
		cmblng.getItems().add("Urdu");
		cmblng.getItems().add("English");
		cmblng.getItems().add("Arabic");
		cmblng.getItems().add("German");
		
		Button btnregister = new Button("Register");
		
		
		GridPane gp = new GridPane();
		gp.setStyle("-fx-background-color : #BBE87F");
		//gp.setStyle("-fx-background-image : url('img/1.jpeg')");
			
		gp.setVgap(20);
		gp.setHgap(20);
		gp.setAlignment(Pos.CENTER);
		
		gp.add(lblname, 1, 1);
		gp.add(lblemail, 1, 2);
		gp.add(lblpass, 1, 3);
		gp.add(lblphone, 1, 4);
		gp.add(lbllanguage, 1, 5);
		gp.add(lblgender, 1, 6);
		gp.add(lblabout, 1, 7);
		
		
		gp.add(txtname, 2, 1);
		gp.add(txtemail, 2, 2);
		gp.add(txtpass, 2, 3);
		gp.add(txtphone, 2, 4);
		gp.add(cmblng, 2, 5);
		gp.add(rbmale, 2, 6);
		gp.add(rbfemale, 2, 6);
		gp.setMargin(rbfemale, new Insets(0, 0, 0, 80));
		gp.add(txtarea, 2, 7);
		gp.add(btnregister, 2, 8);
		
		scene = new Scene(gp,700, 600);
		stage.setScene(scene);
		stage.show();
		
		
		btnregister.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {

				String data = "";

				data += txtname.getText() + ", ";
				data += txtemail.getText() + ", ";
				data += txtpass.getText() + ", ";
				data += txtphone.getText() + ", ";
				data += cmblng.getSelectionModel().getSelectedItem() + ", ";
				
				if(rbmale.isSelected()) {
					data += "Male ,";
				}
				else {
					data += "Female ,";
				}
				data += txtarea.getText() + ", ";
				
				System.out.println(data);
			}
		});
		
		
		
		
		
	}

}
