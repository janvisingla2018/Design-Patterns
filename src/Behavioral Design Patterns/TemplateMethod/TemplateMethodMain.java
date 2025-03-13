public class TemplateMethodMain {
    public static void main(String[] args) {
        BeverageTemplate tea = new Tea();
        tea.prepareBeverage();

        BeverageTemplate coffee = new BlackTea();
        coffee.prepareBeverage();
    }
}
