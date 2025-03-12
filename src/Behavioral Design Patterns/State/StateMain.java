public class StateMain {
    public static void main(String[] args) {
        TrafficLightContext trafficLight = new TrafficLightContext();

        // Simulating traffic light changes
        for (int i = 0; i < 6; i++) {
            trafficLight.changeLight();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
