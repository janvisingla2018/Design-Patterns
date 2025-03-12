public class TrafficLightContext {
    TrafficLightState trafficLightState;

    TrafficLightContext() {
        trafficLightState = new RedLightState();
    }

    public void setState(TrafficLightState trafficLightState) {
        this.trafficLightState = trafficLightState;
    }

    public void changeLight() {
        trafficLightState.handleState(this);
    }
}
