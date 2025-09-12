package AbstractFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application (AbstractFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }
    public void render(){
        button.render();
        checkbox.render();
    }
}
