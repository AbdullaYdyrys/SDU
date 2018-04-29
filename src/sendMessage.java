import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class sendMessage extends MainMenu {
    @FXML
    private TextArea message;
    @FXML
    private TextField emailFacult;
    @FXML
    private ComboBox<String> selectHost;
    @FXML
    void send_action(ActionEvent event) {
            String username = nameInput.getText() + email.getValue();
            String password = passInput.getText();
            Properties props = new Properties();
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.host", selectHost.getValue());
            props.put("mail.smtp.port", "587");
            Session session = Session.getInstance(props,
                    new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(username, password);
                        }
                    });
            try {
                Message message1 = new MimeMessage(session);
                message1.setFrom(new InternetAddress(username));
                message1.setRecipients(Message.RecipientType.TO,
                        InternetAddress.parse(emailFacult.getText()));
                message1.setSubject("Reservation request");
                message1.setText(message.getText());
                Transport.send(message1);
            } catch (MessagingException e) {
                throw new RuntimeException(e);
            }
            Stage newStage1 = new Stage();
            StackPane pane = new StackPane();
            Label label = new Label("Message sent successfully");
            pane.getChildren().add(label);
            Scene newScene1 = new Scene(pane, 300, 150);
            newStage1.setScene(newScene1);
            newStage1.show();
    }
}
