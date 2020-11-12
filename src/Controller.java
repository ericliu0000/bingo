import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.text.Text;

public class Controller {
    // spaghetti. i'm sorry.
    public Text r1c1 = new Text();
    public Text r1c2 = new Text();
    public Text r1c3 = new Text();
    public Text r1c4 = new Text();
    public Text r1c5 = new Text();
    public Text r2c1 = new Text();
    public Text r2c2 = new Text();
    public Text r2c3 = new Text();
    public Text r2c4 = new Text();
    public Text r2c5 = new Text();
    public Text r3c1 = new Text();
    public Text r3c2 = new Text();
    public Text r3c3 = new Text();
    public Text r3c4 = new Text();
    public Text r3c5 = new Text();
    public Text r4c1 = new Text();
    public Text r4c2 = new Text();
    public Text r4c3 = new Text();
    public Text r4c4 = new Text();
    public Text r4c5 = new Text();
    public Text r5c1 = new Text();
    public Text r5c2 = new Text();
    public Text r5c3 = new Text();
    public Text r5c4 = new Text();
    public Text r5c5 = new Text();

    public Text[][] labels = {{r1c1, r1c2, r1c3, r1c4, r1c5}, {r2c1, r2c2, r2c3, r2c4, r2c5}, {r3c1, r3c2, r3c3, r3c4, r3c5}, {r4c1, r4c2, r4c3, r4c4, r4c5}, {r5c1, r5c2, r5c3, r5c4, r5c5}};

    // function called in fxml to enable/disable bingo tiles
    public void Update(ActionEvent actionEvent) {
        Node eventString = (Node) actionEvent.getSource();
        String ID = eventString.getId();

        int[] values = parseAddresses(ID);
        int r = values[0], c = values[1];

        labels[r][c].setOpacity(labels[r][c].getOpacity() > 0.1 ? 0 : 1);
        System.out.println(labels[r][c].getOpacity());
    }

    // get row and column values out of an action event
    public int[] parseAddresses(String input) {
        char[] ca = input.toCharArray();
        return new int[]{Integer.parseInt(String.valueOf(ca[2])), Integer.parseInt(String.valueOf(ca[4]))};
    }
}
