public class InterpreterMain {
    public static void main(String[] args) {
        Expression five = new NumberExpression(5);
        Expression three = new NumberExpression(3);
        Expression two = new NumberExpression(2);

        Expression addExpr = new AddExpression(five, three);
        Expression resultExpr = new SubtractExpression(addExpr, two);

        System.out.println("Result: " + resultExpr.interpret());
    }
}
