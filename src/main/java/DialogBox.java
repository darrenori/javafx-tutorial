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

    /**
     * Creates a dialog box showing what a speaker said next to their avatar.
     *
     * @param message What the speaker said.
     * @param displayImage The avatar of the speaker.
     */
    public DialogBox(String message, Image displayImage) {
        text = new Label(message);
        displayPicture = new ImageView(displayImage);

        this.getChildren().addAll(text, displayPicture);
    }
}
