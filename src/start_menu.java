import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class start_menu extends MainMenu{
    @FXML
    private CheckBox but_monday;
    @FXML private CheckBox but_tuesday;
    @FXML private CheckBox but_wedn;
    @FXML private CheckBox but_thur;
    @FXML private CheckBox but_friday;

    @FXML private CheckBox but_law;
    @FXML private CheckBox but_phil;
    @FXML private CheckBox but_eng;
    @FXML private CheckBox but_eco;
    @FXML private CheckBox but_lect;

    @FXML private Button but_back;



    @FXML //Back action to return to the previous stage
    void back_action(ActionEvent event) {
        Stage stage = (Stage) but_back.getScene().getWindow();
        stage.close();
    }

    @FXML //Check action to check rooms
    void check_action(ActionEvent event){
        //Reading selected state
        if(but_monday.isSelected() && but_eng.isSelected()) {
            // Create a pane to hold the nodes
            Pane pane = new Pane();
            File file = new File("C://Users//User//IdeaProjects//FinalProject//src//res//Table//mondEng.jpg");
            // Create ImageView to display an image and set its properties
            ImageView img = new ImageView(file.toURI().toString());
            img.setFitWidth(1000);
            img.setFitHeight(700);
            // Place the image in the pane
            pane.getChildren().add(img);
            //Place the pane in the scene
            Scene scene = new Scene(pane, 1000, 700);
            Stage p_stage = new Stage(); //creat new Stage
            scene.setOnKeyPressed(event1 -> {
                if (event1.getCode() == KeyCode.ESCAPE) {
                    p_stage.close();
                }
            });
            p_stage.setScene(scene);  //Place the scene in the stage
            //Defines a Stage style with a transparent background and no decorations.
            p_stage.initStyle(StageStyle.UNDECORATED);
            p_stage.show(); //Display the new stage
        }
        if(but_monday.isSelected() && but_eco.isSelected()) {
            Pane pane = new Pane();
            File file = new File("C://Users//User//IdeaProjects//FinalProject//src//res//Table//mondEco.jpg");
            ImageView img = new ImageView(file.toURI().toString());
            img.setFitWidth(1000);
            img.setFitHeight(700);
            pane.getChildren().add(img);
            Scene scene = new Scene(pane, 1000, 700);
            Stage p_stage = new Stage();
            scene.setOnKeyPressed(event1 -> {
                if (event1.getCode() == KeyCode.ESCAPE) {
                    p_stage.close();
                }
            }); 
            p_stage.setScene(scene);
            p_stage.initStyle(StageStyle.UNDECORATED);
            p_stage.show();
        }
        if(but_monday.isSelected() && but_law.isSelected()) {
            Pane pane = new Pane();
            File file = new File("C://Users//User//IdeaProjects//FinalProject//src//res//Table//mondLaw.jpg");
            ImageView img = new ImageView(file.toURI().toString());
            img.setFitWidth(1100);
            img.setFitHeight(700);
            pane.getChildren().add(img);
            Scene scene = new Scene(pane, 1100, 700);
            Stage p_stage = new Stage();
            scene.setOnKeyPressed(event1 -> {
                if (event1.getCode() == KeyCode.ESCAPE) {
                    p_stage.close();
                }
            });
            p_stage.setScene(scene);
            p_stage.initStyle(StageStyle.UNDECORATED);
            p_stage.show();
        }
        if(but_monday.isSelected() && but_phil.isSelected()) {
            Pane pane = new Pane();
            File file = new File("C://Users//User//IdeaProjects//FinalProject//src//res//Table//mondPhil.jpg");
            ImageView img = new ImageView(file.toURI().toString());
            pane.getChildren().add(img);
            Scene scene = new Scene(pane, 1270, 675);
            Stage p_stage = new Stage();
            scene.setOnKeyPressed(event1 -> {
                if (event1.getCode() == KeyCode.ESCAPE) {
                    p_stage.close();
                }
            });
            p_stage.setScene(scene);
            p_stage.initStyle(StageStyle.UNDECORATED);
            p_stage.show();
        }
        if(but_monday.isSelected() && but_lect.isSelected()) {
            Pane pane = new Pane();
            File file = new File("C://Users//User//IdeaProjects//FinalProject//src//res//Table//mondLect.jpg");
            ImageView img = new ImageView(file.toURI().toString());
            img.setFitWidth(1000);
            img.setFitHeight(700);
            pane.getChildren().add(img);
            Scene scene = new Scene(pane, 1000, 700);
            Stage p_stage = new Stage();
            scene.setOnKeyPressed(event1 -> {
                if (event1.getCode() == KeyCode.ESCAPE) {
                    p_stage.close();
                }
            });
            p_stage.setScene(scene);
            p_stage.initStyle(StageStyle.UNDECORATED);
            p_stage.show();
        }




        //Reading selected state
        if(but_tuesday.isSelected() && but_eng.isSelected()) {
            // Create a pane to hold the nodes
            Pane pane = new Pane();
            File file = new File("C://Users//User//IdeaProjects//FinalProject//src//res//Table//tuesEng.jpg");
            // Create ImageView to display an image and set its properties
            ImageView img = new ImageView(file.toURI().toString());
            img.setFitWidth(1000);
            img.setFitHeight(700);
            // Place the image in the pane
            pane.getChildren().add(img);
            //Place the pane in the scene
            Scene scene = new Scene(pane, 1000, 700);
            Stage p_stage = new Stage(); //creat new Stage
            scene.setOnKeyPressed(event1 -> {
                if (event1.getCode() == KeyCode.ESCAPE) {
                    p_stage.close();
                }
            });
            p_stage.setScene(scene);  //Place the scene in the stage
            //Defines a Stage style with a transparent background and no decorations.
            p_stage.initStyle(StageStyle.UNDECORATED);
            p_stage.show(); //Display the new stage
        }
        if(but_tuesday.isSelected() && but_eco.isSelected()) {
            Pane pane = new Pane();
            File file = new File("C://Users//User//IdeaProjects//FinalProject//src//res//Table//tuesEco.jpg");
            ImageView img = new ImageView(file.toURI().toString());
            img.setFitWidth(1000);
            img.setFitHeight(700);
            Stage p_stage = new Stage();
            pane.getChildren().add(img);
            Scene scene = new Scene(pane, 1000, 700);
            scene.setOnKeyPressed(event1 -> {
                if (event1.getCode() == KeyCode.ESCAPE) {
                    p_stage.close();
                }
            });
            p_stage.setScene(scene);
            p_stage.initStyle(StageStyle.UNDECORATED);
            p_stage.show();
        }
        if(but_tuesday.isSelected() && but_law.isSelected()) {
            Pane pane = new Pane();
            File file = new File("C://Users//User//IdeaProjects//FinalProject//src//res//Table//tuesLaw.jpg");
            ImageView img = new ImageView(file.toURI().toString());
            img.setFitWidth(1100);
            img.setFitHeight(700);
            Stage p_stage = new Stage();
            pane.getChildren().add(img);
            Scene scene = new Scene(pane, 1100, 700);
            scene.setOnKeyPressed(event1 -> {
                if (event1.getCode() == KeyCode.ESCAPE) {
                    p_stage.close();
                }
            });
            p_stage.setScene(scene);
            p_stage.initStyle(StageStyle.UNDECORATED);
            p_stage.show();
        }
        if(but_tuesday.isSelected() && but_phil.isSelected()) {
            Pane pane = new Pane();
            File file = new File("C://Users//User//IdeaProjects//FinalProject//src//res//Table//tuesPhil.jpg");
            ImageView img = new ImageView(file.toURI().toString());
            Stage p_stage = new Stage();
            pane.getChildren().add(img);
            Scene scene = new Scene(pane, 1270, 675);
            scene.setOnKeyPressed(event1 -> {
                if (event1.getCode() == KeyCode.ESCAPE) {
                    p_stage.close();
                }
            });
            p_stage.setScene(scene);
            p_stage.initStyle(StageStyle.UNDECORATED);
            p_stage.show();
        }
        if(but_tuesday.isSelected() && but_lect.isSelected()) {
            Pane pane = new Pane();
            File file = new File("C://Users//User//IdeaProjects//FinalProject//src//res//Table//tuesLect.jpg");
            ImageView img = new ImageView(file.toURI().toString());
            img.setFitWidth(1000);
            img.setFitHeight(700);
            Stage p_stage = new Stage();
            pane.getChildren().add(img);
            Scene scene = new Scene(pane, 1000, 700);
            scene.setOnKeyPressed(event1 -> {
                if (event1.getCode() == KeyCode.ESCAPE) {
                    p_stage.close();
                }
            });
            p_stage.setScene(scene);
            p_stage.initStyle(StageStyle.UNDECORATED);
            p_stage.show();
        }


        if(but_wedn.isSelected() && but_eng.isSelected()) {
            Pane pane = new Pane();
            File file = new File("C://Users//User//IdeaProjects//FinalProject//src//res//Table//wednEng.jpg");
            ImageView img = new ImageView(file.toURI().toString());
            img.setFitWidth(1000);
            img.setFitHeight(700);
            pane.getChildren().add(img);
            Scene scene = new Scene(pane, 1000, 700);
            Stage p_stage = new Stage();
            scene.setOnKeyPressed(event1 -> {
                if (event1.getCode() == KeyCode.ESCAPE) {
                    p_stage.close();
                }
            });
            p_stage.setScene(scene);
            p_stage.initStyle(StageStyle.UNDECORATED);
            p_stage.show();

        }
        if(but_wedn.isSelected() && but_eco.isSelected()) {
            Pane pane = new Pane();
            File file = new File("C://Users//User//IdeaProjects//FinalProject//src//res//Table//wednEco.jpg");
            ImageView img = new ImageView(file.toURI().toString());
            img.setFitWidth(1000);
            img.setFitHeight(700);
            pane.getChildren().add(img);
            Scene scene = new Scene(pane, 1000, 700);
            Stage p_stage = new Stage();
            scene.setOnKeyPressed(event1 -> {
                if (event1.getCode() == KeyCode.ESCAPE) {
                    p_stage.close();
                }
            });
            p_stage.setScene(scene);
            p_stage.initStyle(StageStyle.UNDECORATED);
            p_stage.show();

        }
        if(but_wedn.isSelected() && but_law.isSelected()) {
            Pane pane = new Pane();
            File file = new File("C://Users//User//IdeaProjects//FinalProject//src//res//Table//wednLaw.jpg");
            ImageView img = new ImageView(file.toURI().toString());
            img.setFitWidth(1100);
            img.setFitHeight(700);
            pane.getChildren().add(img);
            Scene scene = new Scene(pane, 1100, 700);
            Stage p_stage = new Stage();
            scene.setOnKeyPressed(event1 -> {
                if (event1.getCode() == KeyCode.ESCAPE) {
                    p_stage.close();
                }
            });
            p_stage.setScene(scene);
            p_stage.initStyle(StageStyle.UNDECORATED);
            p_stage.show();

        }
        if(but_wedn.isSelected() && but_phil.isSelected()) {
            Pane pane = new Pane();
            File file = new File("C://Users//User//IdeaProjects//FinalProject//src//res//Table//wednPhil.jpg");
            ImageView img = new ImageView(file.toURI().toString());
            pane.getChildren().add(img);
            Scene scene = new Scene(pane, 1270, 675);
            Stage p_stage = new Stage();
            scene.setOnKeyPressed(event1 -> {
                if (event1.getCode() == KeyCode.ESCAPE) {
                    p_stage.close();
                }
            });
            p_stage.setScene(scene);
            p_stage.initStyle(StageStyle.UNDECORATED);
            p_stage.show();
        }
        if(but_wedn.isSelected() && but_lect.isSelected()) {
            Pane pane = new Pane();
            File file = new File("C://Users//User//IdeaProjects//FinalProject//src//res//Table//wednLect.jpg");
            ImageView img = new ImageView(file.toURI().toString());
            img.setFitWidth(1000);
            img.setFitHeight(700);
            pane.getChildren().add(img);
            Scene scene = new Scene(pane, 1000, 700);
            Stage p_stage = new Stage();
            scene.setOnKeyPressed(event1 -> {
                if (event1.getCode() == KeyCode.ESCAPE) {
                    p_stage.close();
                }
            });
            p_stage.setScene(scene);
            p_stage.initStyle(StageStyle.UNDECORATED);
            p_stage.show();
        }



        if(but_thur.isSelected() && but_eng.isSelected()) {
            Pane pane = new Pane();
            File file = new File("C://Users//User//IdeaProjects//FinalProject//src//res//Table//thursEng.jpg");
            ImageView img = new ImageView(file.toURI().toString());
            img.setFitWidth(1000);
            img.setFitHeight(700);
            pane.getChildren().add(img);
            Scene scene = new Scene(pane, 1000, 700);
            Stage p_stage = new Stage();
            scene.setOnKeyPressed(event1 -> {
                if (event1.getCode() == KeyCode.ESCAPE) {
                    p_stage.close();
                }
            });
            p_stage.setScene(scene);
            p_stage.initStyle(StageStyle.UNDECORATED);
            p_stage.show();
        }
        if(but_thur.isSelected() && but_eco.isSelected()) {
            Pane pane = new Pane();
            File file = new File("C://Users//User//IdeaProjects//FinalProject//src//res//Table//thursEco.jpg");
            ImageView img = new ImageView(file.toURI().toString());
            img.setFitWidth(1000);
            img.setFitHeight(700);
            pane.getChildren().add(img);
            Scene scene = new Scene(pane, 1000, 700);
            Stage p_stage = new Stage();
            scene.setOnKeyPressed(event1 -> {
                if (event1.getCode() == KeyCode.ESCAPE) {
                    p_stage.close();
                }
            });
            p_stage.setScene(scene);
            p_stage.initStyle(StageStyle.UNDECORATED);
            p_stage.show();
        }
        if(but_thur.isSelected() && but_law.isSelected()) {
            Pane pane = new Pane();
            File file = new File("C://Users//User//IdeaProjects//FinalProject//src//res//Table//thursLaw.jpg");
            ImageView img = new ImageView(file.toURI().toString());
            img.setFitWidth(1100);
            img.setFitHeight(700);
            pane.getChildren().add(img);
            Scene scene = new Scene(pane, 1100, 700);
            Stage p_stage = new Stage();
            scene.setOnKeyPressed(event1 -> {
                if (event1.getCode() == KeyCode.ESCAPE) {
                    p_stage.close();
                }
            });
            p_stage.setScene(scene);
            p_stage.initStyle(StageStyle.UNDECORATED);
            p_stage.show();
        }
        if(but_thur.isSelected() && but_phil.isSelected()) {
            Pane pane = new Pane();
            File file = new File("C://Users//User//IdeaProjects//FinalProject//src//res//Table//thursPhil.jpg");
            ImageView img = new ImageView(file.toURI().toString());
            pane.getChildren().add(img);
            Scene scene = new Scene(pane, 1270, 675);
            Stage p_stage = new Stage();
            scene.setOnKeyPressed(event1 -> {
                if (event1.getCode() == KeyCode.ESCAPE) {
                    p_stage.close();
                }
            });
            p_stage.setScene(scene);
            p_stage.initStyle(StageStyle.UNDECORATED);
            p_stage.show();
        }
        if(but_thur.isSelected() && but_lect.isSelected()) {
            Pane pane = new Pane();
            File file = new File("C://Users//User//IdeaProjects//FinalProject//src//res//Table//thursLect.jpg");
            ImageView img = new ImageView(file.toURI().toString());
            img.setFitWidth(1000);
            img.setFitHeight(700);
            pane.getChildren().add(img);
            Scene scene = new Scene(pane, 1000, 700);
            Stage p_stage = new Stage();
            scene.setOnKeyPressed(event1 -> {
                if (event1.getCode() == KeyCode.ESCAPE) {
                    p_stage.close();
                }
            });
            p_stage.setScene(scene);
            p_stage.initStyle(StageStyle.UNDECORATED);
            p_stage.show();
        }



        if(but_friday.isSelected() && but_eng.isSelected()) {
            Pane pane = new Pane();
            File file = new File("C://Users//User//IdeaProjects//FinalProject//src//res//Table//fridEng.jpg");
            ImageView img = new ImageView(file.toURI().toString());
            img.setFitWidth(1000);
            img.setFitHeight(700);
            pane.getChildren().add(img);
            Scene scene = new Scene(pane, 1000, 700);
            Stage p_stage = new Stage();
            scene.setOnKeyPressed(event1 -> {
                if (event1.getCode() == KeyCode.ESCAPE) {
                    p_stage.close();
                }
            });
            p_stage.setScene(scene);
            p_stage.initStyle(StageStyle.UNDECORATED);
            p_stage.show();
        }
        if(but_friday.isSelected() && but_eco.isSelected()) {
            Pane pane = new Pane();
            File file = new File("C://Users//User//IdeaProjects//FinalProject//src//res//Table//fridEco.jpg");
            ImageView img = new ImageView(file.toURI().toString());
            img.setFitWidth(1000);
            img.setFitHeight(700);
            pane.getChildren().add(img);
            Scene scene = new Scene(pane, 1000, 700);
            Stage p_stage = new Stage();
            scene.setOnKeyPressed(event1 -> {
                if (event1.getCode() == KeyCode.ESCAPE) {
                    p_stage.close();
                }
            });
            p_stage.setScene(scene);
            p_stage.initStyle(StageStyle.UNDECORATED);
            p_stage.show();
        }
        if(but_friday.isSelected() && but_law.isSelected()) {
            Pane pane = new Pane();
            File file = new File("C://Users//User//IdeaProjects//FinalProject//src//res//Table//fridLaw.jpg");
            ImageView img = new ImageView(file.toURI().toString());
            img.setFitWidth(1100);
            img.setFitHeight(700);
            pane.getChildren().add(img);
            Scene scene = new Scene(pane, 1100, 700);
            Stage p_stage = new Stage();
            scene.setOnKeyPressed(event1 -> {
                if (event1.getCode() == KeyCode.ESCAPE) {
                    p_stage.close();
                }
            });
            p_stage.setScene(scene);
            p_stage.initStyle(StageStyle.UNDECORATED);
            p_stage.show();
        }

        if(but_friday.isSelected() && but_phil.isSelected()) {
            Pane pane = new Pane();
            File file = new File("C://Users//User//IdeaProjects//FinalProject//src//res//Table//fridPhil.jpg");
            ImageView img = new ImageView(file.toURI().toString());
            pane.getChildren().add(img);
            Scene scene = new Scene(pane, 1270, 675);
            Stage p_stage = new Stage();
            scene.setOnKeyPressed(event1 -> {
                if (event1.getCode() == KeyCode.ESCAPE) {
                    p_stage.close();
                }
            });
            p_stage.setScene(scene);
            p_stage.initStyle(StageStyle.UNDECORATED);
            p_stage.show();
        }
        if(but_friday.isSelected() && but_lect.isSelected()) {
            Pane pane = new Pane();
            File file = new File("C://Users//User//IdeaProjects//FinalProject//src//res//Table//fridLect.jpg");
            ImageView img = new ImageView(file.toURI().toString());
            img.setFitWidth(1000);
            img.setFitHeight(700);
            pane.getChildren().add(img);
            Scene scene = new Scene(pane, 1000, 700);
            Stage p_stage = new Stage();
            scene.setOnKeyPressed(event1 -> {
                if (event1.getCode() == KeyCode.ESCAPE) {
                    p_stage.close();
                }
            });
            p_stage.setScene(scene);
            p_stage.initStyle(StageStyle.UNDECORATED);
            p_stage.show();
        }
     
    }
    
    @FXML
    void reserv_action(ActionEvent event) {
    	Stage newStage = new Stage();
    	Parent root = null;
        try {
              // Create the FXMLLoader and show the path to the FXML File
        	 root = FXMLLoader.load(getClass().getResource("reservation.fxml")); 
          } catch (IOException e) {
            e.printStackTrace();
        }
          Scene newScene = new Scene(root, 1000, 600);
          newScene.setOnKeyPressed(event1 -> {
              if (event1.getCode() == KeyCode.ESCAPE) {
            	  newStage.close();
              }
          });
          newStage.setScene(newScene); 
          newStage.initStyle(StageStyle.UNDECORATED);
          newStage.show(); //Display the new stage
     }
    } 
    	


