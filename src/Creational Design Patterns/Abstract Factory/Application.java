public class Application {
    Button button;
    Checkbox checkbox;

    Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void renderUI(){
        button.paint();
        checkbox.render();
    }
}
