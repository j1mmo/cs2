public class Moon {
    private String name;
    private double distance;
    private double diameter;
    private double mass;
    private double density;
    private double temperiture;

    public double getDistance() {
        return distance;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getMass() {
        return mass;
    }

    public double getDensity() {
        return density;
    }

    public double getTemperiture() {
        return temperiture;
    }
    public String getName(){
        return name;
    }
    public Moon (double dis, double dia, double mass, double dens, double temp, String nam) {
        distance = dis;
        diameter = dia;
        diameter = mass;
        density = dens;
        temperiture = temp;
        nam = name;
    }

}
