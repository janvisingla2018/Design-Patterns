public class RedLightState implements TrafficLightState{
    @Override
    public void handleState(TrafficLightContext context) {
        System.out.println("Red Light - STOP 🛑");
        context.setState(new GreenLightState());
    }
}
