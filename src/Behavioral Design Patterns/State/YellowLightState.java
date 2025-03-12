public class YellowLightState implements TrafficLightState {
    @Override
    public void handleState(TrafficLightContext context) {
        System.out.println("Yellow Light - SLOW DOWN ⚠️");
        context.setState(new RedLightState());
    }
}
