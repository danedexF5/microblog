
import java.util.ArrayList;


public class User {

    // create a name property
    String name;

    // create a message property. This should be an ArrayList that holds Message objects.
    ArrayList<Message> messages = new ArrayList<>();

    // Create a constructor that accepts one argument, the user's name

    public User(String name) {
        this.name = name;
    }


    // create a getter for name

    public String getName() {
        return name;
    }


    // create a setter for name

    public void setName(String name) {
        this.name = name;
    }


    // create a getter for messages

    public ArrayList<Message> getMessages() {
        return messages;
    }


    // create a setter for messages

    public void setMessages(ArrayList<Message> messages) {
        this.messages = messages;
    }
}
