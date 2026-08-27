import javafx.application.Application;

/**
 * A launcher class to work around classpath issues.
 */
public class Launcher {

    /**
     * Starts the JavaFX application.
     *
     * @param args Command line arguments forwarded to JavaFX.
     */
    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }
}
