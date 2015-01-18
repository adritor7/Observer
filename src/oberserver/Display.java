package oberserver;

public class Display extends Observer {
    private final Document document;

    public Display(Document document) {
        this.document = document;
        document.hook(this);
    }

    @Override
    public void changed() {
        System.out.println(document.getText());
    }
    
}
