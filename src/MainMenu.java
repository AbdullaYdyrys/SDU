import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import javafx.fxml.FXMLLoader;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class MainMenu extends Application {

	private Connection connection;
	private Statement statement;
	private Button back;
	public static Parent root1 = null;
	private MenuBox menu;
	public static TextField nameInput;
	public static PasswordField passInput;
	public static ComboBox<String> email;
	
	
    @Override
    public void start(Stage primaryStage) throws Exception {

        //GridPane with 10px padding around edge
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(20);
        grid.setHgap(30);
        grid.setStyle("-fx-background-color: #99ccff");
        
        //Name Label - constrains use (child, column, row)
        Label nameLabel = new Label("Email:");
        nameLabel.setFont(Font.font("Times New Roman",FontWeight.BOLD, 22));
        grid.add(nameLabel, 0, 0);

        //Name Input
        nameInput = new TextField("");
        nameInput.setPromptText("Enter your email");
        nameInput.setPrefColumnCount(30);
        grid.add(nameInput, 1, 0);

        email = new ComboBox<>();
        email.setValue("@mail.ru");
        email.getItems().addAll("@mail.ru", "@gmail.com", "@list.ru", "@bk.ru", "@inbox.ru");
        grid.add(email, 2, 0);
        
        //Password Label
        Label passLabel = new Label("Password:");
        passLabel.setFont(Font.font("Times New Roman",FontWeight.BOLD,  22));
        grid.add(passLabel, 0, 1);

        //Password Input
        passInput = new PasswordField();
        passInput.setPromptText("Enter your email password");
        grid.add(passInput, 1, 1);

        //Login
        Button Registration = new Button("Registration");
        Registration.setFont(Font.font("Times New Roman",FontWeight.BOLD, 22));
        grid.add(Registration, 1, 2);

        //Sign up
        Button enter = new Button("Enter");
        enter.setFont(Font.font("Times New Roman",FontWeight.BOLD, 22));
        grid.add(enter, 1, 3);
        
        Scene scene = new Scene(grid, 800, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        try {
        	Class.forName("com.mysql.jdbc.Driver");
        	connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "", "");
        	statement = (Statement) connection.createStatement();
        }catch(Exception e) {
        	System.out.println("Error" + e);
        }
            
        enter.setOnAction(event->{
        	  try {
  		       ResultSet result = statement.executeQuery("SELECT * FROM test WHERE Login = \'" + nameInput.getText() + email.getValue() +"\' AND Password= \'" + passInput.getText() + "\'");
  		        if(result.next()) {
  		          Stage stage = new Stage();
  		          // Create a pane to hold the nodes
  		          Pane pane = new Pane();
  		          pane.setPrefSize(1000, 600);
  		          File file = new File("C://Users//User//IdeaProjects//FinalProject//src//res//backgr.jpg");
  		          // Create ImageView to display an image and set its properties
  		          ImageView img = new ImageView(file.toURI().toString());
  		          img.setFitWidth(1000);
  		          img.setFitHeight(600);
  		          // Place the image in the pane
  		          pane.getChildren().add(img);
  		          //Adding itemStart MenuItem
  		          MenuItem itemStart =  new MenuItem("START SEARCHING");
  		          //itemStart action using lambda(->) expression
  		          itemStart.setOnMouseClicked(event1 -> {
  		              try {
  		                  // Create the FXMLLoader and show the path to the FXML File
  		                  root1 = FXMLLoader.load(getClass().getResource("start_menu.fxml")); //
  		              } catch (IOException e) {
  		                  e.printStackTrace();
  		              }
  		              Stage stage1 = new Stage();//Create new Stage
  		              stage1.setScene(new Scene(root1, 1000, 600));//Place the scene in the stage
  		              //Defines a Stage style with a transparent background and no decorations.
  		              stage1.initStyle(StageStyle.UNDECORATED);
  		              stage1.show();//Display the new stage
  		          });
  		          
  		          //Adding itemQuit MenuItem
  		          MenuItem itemQuit = new MenuItem("QUIT");
  		          //itemQuit action using lambda(->) expression
  		          itemQuit.setOnMouseClicked(event1 -> {
  		              try {
  		                  // Create the FXMLLoader and show the path to the FXML File
  		                  root1 = FXMLLoader.load(getClass().getResource("quit_menu.fxml"));
  		              } catch (IOException e) {
  		                  e.printStackTrace();
  		              }
  		              Stage stage2 = new Stage();//Create new Stage
	  		          stage2.setScene(new Scene(root1)); //Place the scene in the stage
	  		          //Defines a Stage style with a transparent background and no decorations.
	  		          stage2.initStyle(StageStyle.UNDECORATED);
	  		          stage2.show();//Display the new stage
  		          });
  		        		  
  		          //Adding itemAbout MenuItem
  		          MenuItem itemAbout = new MenuItem("ABOUT");
  		          //itemAbout action using lambda(->) expression
  		          itemAbout.setOnMouseClicked(event1 -> {
  		              try {
  		                  // Create the FXMLLoader and show the path to the FXML File
  		                  root1 = FXMLLoader.load(getClass().getResource("about.fxml"));
  		              } catch (IOException e) {
  		                  e.printStackTrace();
  		              }
  		              Scene scene3 = new Scene(root1, 1000, 600);
  		              Stage stage3 = new Stage();   //Create new Stage
  		              stage3.setScene(scene3);    //Place the scene in the stage
  		              scene3.setOnKeyPressed(event2 -> {
  		                  if (event2.getCode() == KeyCode.ESCAPE) {
  		                	stage3.close();
  		                  }
  		              });
  		              //Defines a Stage style with a transparent background and no decorations.
  		            stage3.initStyle(StageStyle.UNDECORATED);
  		            stage3.show(); //Display the new stage
  		          });
  		          
  		          //add MenuItems to the Menu
  		          menu = new MenuBox("SDU ROOMS", itemStart, itemAbout, itemQuit);
  		          // Place the menu in the pane
  		          pane.getChildren().add(menu);
  		          // Create a scene and place the pane in the scene
  		          Scene scene4 = new Scene(pane);
  		          scene4.setOnKeyPressed(event1 -> {
  		              if (event1.getCode() == KeyCode.ESCAPE) {
  		                  if (menu.isVisible())
  		                      menu.hide();
  		                  else
  		                      menu.show();
  		              }
  		          });
  		          stage.setTitle("SDU ROOMS");  // Set the stage title
  		          stage.setScene(scene4);   //Place the scene in the stage
  		          stage.initStyle(StageStyle.UNDECORATED);
  		          stage.show();    // Display the stage
		      }
  		      else {
		        	Stage stage8 = new Stage();
		        	StackPane pane = new StackPane();
		        	pane.setStyle("-fx-background-color: #99ccff");
		        	Label label = new Label("The user with such mail didn't register or the incorrect password.");
		        	pane.getChildren().add(label);
		        	Scene scene8 = new Scene(pane, 300, 150);
		        	stage8.setScene(scene8);
		        	stage8.show();
		        }
		}
        	  catch(SQLException e) {
        		  System.out.println("Error:" + e);
        	  } catch (IOException e1) {
				e1.printStackTrace();
			}
        });
        
        
        Registration.setOnAction(event ->{
			Stage stage5 = new Stage();
			// GridPane with 10px padding around edge
			GridPane grid1 = new GridPane();
			grid1.setPadding(new Insets(10, 10, 10, 10));
			grid1.setVgap(20);
			grid1.setHgap(30);
			grid1.setStyle("-fx-background-color: #99ccff");
			
			// Name Label - constrains use (child, column, row)
			Label nameLabel1 = new Label("Email for registration:");
			nameLabel1.setFont(Font.font("Times New Roman",FontWeight.BOLD, 22));
			grid1.add(nameLabel1, 0, 0);

			// Name Input
			TextField nameInput1 = new TextField("");
			nameInput1.setPromptText("Enter your mail");
			nameInput1.setPrefColumnCount(30);
			grid1.add(nameInput1, 1, 0);

			ComboBox<String> emailRegist = new ComboBox<>();
			emailRegist.setValue("@mail.ru");
			emailRegist.getItems().addAll("@mail.ru", "@gmail.com", "@list.ru", "@bk.ru", "@inbox.ru");
			grid1.add(emailRegist, 2, 0);

			// Password Label
			Label passLabel1 = new Label("Password:");
			passLabel1.setFont(Font.font("Times New Roman",FontWeight.BOLD, 22));
			grid1.add(passLabel1, 0, 1);

			// Password Input
			PasswordField passInput1 = new PasswordField();
			passInput1.setPromptText("Enter the mail password");
			grid1.add(passInput1, 1, 1);

			back = new Button("BACK");
			back.setFont(Font.font("Times New Roman",FontWeight.BOLD, 22));
			grid1.add(back, 1, 2);

			back.setOnAction(event1 -> {
				Stage stage3 = (Stage) back.getScene().getWindow();
				stage3.close();
			});

			// Sign up
			Button save = new Button("SAVE");
			save.setFont(Font.font("Times New Roman",FontWeight.BOLD, 22));
			grid1.add(save, 1, 3);

			save.setOnAction(event2 -> {
				try {
					ResultSet result = statement.executeQuery("SELECT * FROM test WHERE Login = \'" + nameInput1.getText() + emailRegist.getValue()  + "\'");
					if (!result.next()) {
						statement.executeUpdate("INSERT INTO test (Login, Password) VALUES (\'" + nameInput1.getText() + emailRegist.getValue()
								+ "\',\'" + passInput1.getText() + "\')");
						Stage stage6 = new Stage();
						StackPane pane = new StackPane();
						pane.setStyle("-fx-background-color: #99ccff");
						Label label = new Label("You have successfully registered");
						pane.getChildren().add(label);
						Scene scene6 = new Scene(pane, 300, 150);
						stage6.setScene(scene6);
						stage6.show();
					} else {
						Stage stage7 = new Stage();
						StackPane pane = new StackPane();
						pane.setStyle("-fx-background-color: #99ccff");
						Label label = new Label("User with such email already registred");
						pane.getChildren().add(label);
						Scene scene7 = new Scene(pane, 300, 150);
						stage7.setScene(scene7);
						stage7.show();
					}
				} catch (SQLException e1) {
					System.out.println("Error" + e1);
				}
			});
			// Add everything to grid
			Scene scene5 = new Scene(grid1, 800, 300);			
			stage5.setScene(scene5);
			stage5.show();
		});
      
        	        
    }
    

    private static class MenuBox extends StackPane {

        public MenuBox(String title, MenuItem... items) {
            // Create a rectangle and set its properties
            Rectangle rectangle = new Rectangle(300, 600);
            rectangle.setOpacity(0.6);
            //Create text and set its properties
            Text text = new Text(title + "   ");
            text.setFont(Font.font("Castellar", FontWeight.BOLD, 32));
            text.setFill(Color.DEEPSKYBLUE);

            // Create a line1 and set its properties
            Line line1 = new Line();
            line1.setEndX(250);
            line1.setStroke(Color.WHITE);

            // Create a line2 and set its properties
            Line line2 = new Line();
            line2.setStartX(300);
            line2.setEndX(300);
            line2.setEndY(600);
            line2.setStroke(Color.WHITE);
            //Create vbox and add text, line, items inside them
            VBox vbox = new VBox();
            vbox.setAlignment(Pos.TOP_RIGHT);
            vbox.setPadding(new Insets(60, 0, 0, 0));
            vbox.getChildren().addAll(text, line1);
            vbox.getChildren().addAll(items);
            setAlignment(Pos.TOP_RIGHT);
            //Place nodes in the pane
            getChildren().addAll(rectangle, line2, vbox);
        }

        //show method
        public void show() {
            setVisible(true);
            //Creating translate transition
            TranslateTransition tt = new TranslateTransition(Duration.seconds(0.5), this);
            //Setting the value of the transition along the X axis
            tt.setToX(0);
            //Playing the animation
            tt.play();
        }
        //hide method
        public void hide() {
            //Creating translate transition
            TranslateTransition tt = new TranslateTransition(Duration.seconds(0.5), this);
            //Setting the value of the transition along the X axis
            tt.setToX(-300);
            tt.setOnFinished(event -> setVisible(false));
            //Playing the animation
            tt.play();
        }
    }

    private static class MenuItem extends StackPane {
        public MenuItem(String name) throws IOException {
            // Create a rectangle and set its properties
            Rectangle rectangle = new Rectangle(300, 24);
            rectangle.setFill(Color.DEEPSKYBLUE);
            rectangle.setVisible(false);
            // Create a text and set its properties
            Text text = new Text(name + "      ");
            text.setFill(Color.LIGHTGREY);
            text.setFont(Font.font("Times New Roman", 20));

            setAlignment(Pos.CENTER_RIGHT);
            getChildren().addAll(rectangle, text);
            //Action using labmda (->) expression
            setOnMouseEntered(event -> {
                rectangle.setVisible(true);
                text.setFill(Color.WHITE);
            });
            //Action using labmda (->) expression
            setOnMouseExited(event -> {
                rectangle.setVisible(false);
                text.setFill(Color.LIGHTGREY);
            });
            //Action using labmda (->) expression
            setOnMousePressed(event -> {
                rectangle.setFill(Color.SLATEGRAY);
                text.setFill(Color.BLACK);
            });
            //Action using labmda (->) expression
            setOnMouseReleased(event -> {
                rectangle.setFill(Color.DEEPSKYBLUE);
                text.setFill(Color.LIGHTGREY);
            });
        }
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
