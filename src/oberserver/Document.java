package oberserver;

public class Document extends Observable {
    
    private String text = "";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        notifyObservers();
    }
    
    
    
}
