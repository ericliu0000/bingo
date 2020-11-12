import javafx.event.ActionEvent;

public class Controller {
    public void Update(ActionEvent actionEvent) {
        System.out.println(actionEvent.getSource().toString());
    }
}
