public class AbstractFactoryMain {
    public static void main(String[] args) {
        GUIFactory guiFactory;
        String os = "Windows";

        if(os.equalsIgnoreCase("Mac")) {
            guiFactory = new MacFactory();
        }else{
            guiFactory = new WindowsFactory();
        }

        Application application = new Application(guiFactory);
        application.renderUI();
    }
}
