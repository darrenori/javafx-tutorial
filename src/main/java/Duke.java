/**
 * A chatbot that produces a reply for whatever the user says.
 */
public class Duke {
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
        return "Duke heard: " + input;
    }
}
