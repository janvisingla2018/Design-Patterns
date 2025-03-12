public class GreenLightState implements TrafficLightState{
    @Override
    public void handleState(TrafficLightContext context) {
        System.out.println("Green Light - GO ✅");
        context.setState(new YellowLightState());
    }
}
