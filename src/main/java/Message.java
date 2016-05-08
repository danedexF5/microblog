

public class Message {

    // create a property "text" to hold the text of a message
    String text;
    // create a constructor for Message that accepts one argument, the text of the message

    public Message(String text) {
        this.text = text;
    }

    // create a getText method

    public String getText() {
        return text;
    }

    // create a setText method


    public void setText(String text) {
        this.text = text;
    }
}
