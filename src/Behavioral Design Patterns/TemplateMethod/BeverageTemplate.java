public abstract class BeverageTemplate {
    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        if (addCondimentsNeeded()) {
            addCondiments();
        }
        System.out.println("Your " + getClass().getSimpleName() + " is ready!\n");
    }

    private void boilWater() {
        System.out.println("Boiling water...");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup...");
    }

    protected abstract void brew();
    protected abstract void addCondiments();

    protected boolean addCondimentsNeeded() {
        return true;
    }
}
