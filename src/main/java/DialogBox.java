import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

/**
 * Represents a dialog box consisting of an ImageView to represent the speaker's face
 * and a label containing text from the speaker.
 */
public class DialogBox extends HBox {

    private Label text;
    private ImageView displayPicture;

    private DialogBox(String message, Image displayImage) {
        text = new Label(message);
        displayPicture = new ImageView(displayImage);

        // Styling the dialog box
        text.setWrapText(true);
        displayPicture.setFitWidth(100.0);
        displayPicture.setFitHeight(100.0);
        this.setAlignment(Pos.TOP_RIGHT);

        this.getChildren().addAll(text, displayPicture);
    }

    /**
     * Flips the dialog box such that the ImageView is on the left and text on the right.
     */
    private void flip() {
        this.setAlignment(Pos.TOP_LEFT);
        ObservableList<Node> tmp = FXCollections.observableArrayList(this.getChildren());
        FXCollections.reverse(tmp);
        this.getChildren().setAll(tmp);
    }

    /**
     * Returns a dialog box for something the user said, aligned to the right.
     *
     * @param message What the user typed.
     * @param displayImage The avatar of the user.
     * @return A right-aligned dialog box.
     */
    public static DialogBox getUserDialog(String message, Image displayImage) {
        return new DialogBox(message, displayImage);
    }

    /**
     * Returns a dialog box for something Duke replied, aligned to the left.
     *
     * @param message What Duke replied.
     * @param displayImage The avatar of Duke.
     * @return A left-aligned dialog box.
     */
    public static DialogBox getDukeDialog(String message, Image displayImage) {
        DialogBox dialogBox = new DialogBox(message, displayImage);
        dialogBox.flip();
        return dialogBox;
    }
}
