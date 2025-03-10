public class HomeTheaterFacade {
    private DVDPlayer dvd;
    private Projector projector;
    private SoundSystem sound;
    private Lights lights;

    public HomeTheaterFacade(DVDPlayer dvd, Projector projector, SoundSystem sound, Lights lights) {
        this.dvd = dvd;
        this.projector = projector;
        this.sound = sound;
        this.lights = lights;
    }

    public void watchMovie(){
        System.out.println("\nStarting Movie...");
        lights.dim(30);
        dvd.turnOn();
        projector.turnOn();
        projector.setInput(dvd);
        sound.turnOn();
        sound.setVolume(50);
        dvd.play();
    }

    public void endMovie() {
        System.out.println("\nStopping Movie...");
        dvd.turnOff();
        projector.turnOff();
        sound.turnOff();
        System.out.println("Movie Ended!\n");
    }
}
