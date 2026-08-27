/**
 * A chatbot that produces a reply for whatever the user says.
 */
public class Duke {

    private String commandType;

    /**
     * Runs Duke as a console app. The GUI is started from Launcher instead.
     *
     * @param args Command line arguments, which Duke does not use.
     */
    public static void main(String[] args) {
        System.out.println("Hello!");
    }

    /**
     * Generates a response for the user's chat message.
     *
     * @param input What the user typed.
     * @return The reply to show in the chat.
     */
    public String getResponse(String input) {
        commandType = classify(input);
        return "Duke heard: " + input;
    }

    /**
     * Returns the kind of command behind the most recent response.
     *
     * @return The simple class name a real command would have, or UnknownCommand.
     */
    public String getCommandType() {
        return commandType;
    }

    /**
     * Maps the leading keyword of a message onto the command that would handle it.
     * A full Duke would read this off the Command object returned by its parser.
     */
    private static String classify(String input) {
        String keyword = input.trim().split(" ", 2)[0];
        switch (keyword) {
        case "todo":
        case "deadline":
        case "event":
            return "AddCommand";
        case "mark":
        case "unmark":
            return "ChangeMarkCommand";
        case "delete":
            return "DeleteCommand";
        default:
            return "UnknownCommand";
        }
    }
}
