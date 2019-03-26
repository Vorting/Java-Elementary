package je_multithreadig.concurrent.waitNotifyTest;

public class Message {
    //поле, с которым будут работать потоки через вызовы геттеров и сеттеров
    private String message;

    public Message(String string) {
        this.message = string;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String string) {
        this.message = string;
    }
}
