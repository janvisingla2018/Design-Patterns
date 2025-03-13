public class BlackTea extends BeverageTemplate{
    @Override
    protected void brew() {
        System.out.println("Brewing black coffee...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Steeping coffee leaves...");
    }
}
