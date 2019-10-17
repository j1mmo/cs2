import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Planet Mercury = new Planet( 4879.4, 57.91, "Mercury");
        Planet Earth = new Planet(12742,149.6, "Earth");
        Planet Mars = new Planet(6779, 227.9, "Mars");
        Planet Uranus = new Planet(50724, 2871, "Uranus");
        Planet Saturn = new Planet(116460, 1434, "Saturn");
        Planet Neptune = new Planet(49244, 4495, "Naptune");
        Planet Jupiter = new Planet(139820, 778.5, "Jupiter");
        Planet Venus = new Planet(12104, 108.2, "Venus");
        ArrayList<Planet> solarSystem = new ArrayList<Planet>();
        solarSystem.add(Mercury);
        solarSystem.add(Earth);
        solarSystem.add(Mars);
        solarSystem.add(Uranus);
        solarSystem.add(Saturn);
        solarSystem.add(Neptune);
        solarSystem.add(Jupiter);
        solarSystem.add(Venus);
        for (Planet p : solarSystem) {
            p.getStats();
        }
    }

}
