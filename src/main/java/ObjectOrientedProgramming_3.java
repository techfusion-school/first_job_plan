public class ObjectOrientedProgramming_3 {

    public static void main(String[] args) {
        TextMessage textMessage = new TextMessage("Hello world", "Anton");
        AudioMessage audioMessage = new AudioMessage(new byte[100], "Vasya");

        // полиморфизм
        Message msg = textMessage;
        System.out.println(msg.getAuthor());
    }


}

interface Message {

    String getAuthor();
}

class TextMessage implements Message { // наследование (интерфейса)

    // инкапсуляция
    private final String text;
    private final String author;

    public TextMessage(String text, String author) {
        this.text = text;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    @Override
    public String getAuthor() {
        return author;
    }
}

class AudioMessage implements Message {

    private final byte[] audio;
    private final String author;

    public AudioMessage(byte[] audio, String author) {
        this.audio = audio;
        this.author = author;
    }

    public byte[] getAudio() {
        return audio;
    }

    @Override
    public String getAuthor() {
        return author;
    }
}


