import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Planet> solarSystem = new ArrayList<>();
        String[] names = {"Mercury",
                "Venus",
                "Earth",
                "Mars",
                "Jupiter",
                "Saturn",
                "Uranus",
                "Neptune"
        };
        double[] radius = {2439.7, 6051.8, 6371, 3389.7, 69911, 58232, 25362, 24622};
        double[] au = {0.39, 0.723, 1, 1.524, 5.203, 9.539, 19.18, 30.06};
        double[] mass = {0.330, 4.87, 5.97, 0.642, 1898, 568, 86.8, 102};
        for(int i = 0 ; i < 7; i++){
            Planet p = new Planet(names[i], au[i], mass[i], radius[i]);
            solarSystem.add(p);
        }
        for(Planet p : solarSystem){
            p.printData();
        }
    }
}
