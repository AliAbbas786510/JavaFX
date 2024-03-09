import javafx.application.Application;
import javafx.beans.property.ReadOnlyBooleanWrapper;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.ComboBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ViewData extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		
		TableView tableView = new TableView();
		tableView.setEditable(true);

		TableColumn<Person, String> column1 = new TableColumn<>("Name");
		column1.setCellValueFactory(new PropertyValueFactory<>("name"));

		TableColumn<Person, String> column2 = new TableColumn<>("Email");
		column2.setCellValueFactory(new PropertyValueFactory<>("email"));

		TableColumn<Person, String> column3 = new TableColumn<>("Password");
		column3.setCellValueFactory(new PropertyValueFactory<>("password"));

		TableColumn<Person, String> column4 = new TableColumn<>("Phone");
		column4.setCellValueFactory(new PropertyValueFactory<>("phone"));

		TableColumn<Person, String> column5 = new TableColumn<>("Gender");
		column5.setCellValueFactory(new PropertyValueFactory<>("gender"));

		TableColumn<Person, String> column6 = new TableColumn<>("Laguage");
		column6.setCellValueFactory(new PropertyValueFactory<>("language"));

		/*
		 * TableColumn<Person, String> column2 = new TableColumn<>("Email");
		 * column2.setCellValueFactory(new PropertyValueFactory<>("lastName"));
		 * column2.setCellFactory(TextFieldTableCell.<Person>forTableColumn());
		 * 
		 * TableColumn<Person, String> column3 = new TableColumn<>("Category");
		 * column3.setCellValueFactory(new PropertyValueFactory<>("category"));
		 * column3.setCellFactory(ComboBoxTableCell.<Person,
		 * String>forTableColumn("Category 1", "Category 2"));
		 * 
		 * TableColumn<Person, Boolean> column4 = new TableColumn<>("Is XYZ");
		 * column4.setCellValueFactory( cellData -> new
		 * ReadOnlyBooleanWrapper(cellData.getValue().getIsXyz()));
		 * column4.setCellFactory(CheckBoxTableCell.<Person>forTableColumn(column4));
		 * 
		 */
		tableView.getColumns().add(column1);
		tableView.getColumns().add(column2);
		tableView.getColumns().add(column3);
		tableView.getColumns().add(column4);
		tableView.getColumns().add(column5);
		tableView.getColumns().add(column6);

		tableView.getItems().add(new Person("ali"  , "gamil.com"  ,"1234", "123456", "Male", "eng"));
		tableView.getItems().add(new Person("Ali2"  , "gamil.com"  ,"1234", "123456", "Male", "eng"));
		tableView.getItems().add(new Person("Ali3"  , "gamil.com"  ,"1234", "123456", "Male", "eng"));
		
	    
	     VBox vbox = new VBox(tableView);
	        vbox.setSpacing(5);
	        vbox.setPadding(new Insets(10, 0, 0, 10));
	       // vbox.getChildren().addAll(label, table);
	 
	        
	        Scene scene = new Scene(vbox);
	        stage.setScene(scene);
	        stage.show();
		
	}

	
	
}
