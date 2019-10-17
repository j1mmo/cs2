public class Planet {
    private String name;
    private double astronomicalUnits;
    private double mass;
    private double radius;
    Planet(String n, double au, double m, double r){
        name = n;
        astronomicalUnits = au;
        mass = m;
        radius = r;
    }

    public String getName() {
        return name;
    }

    public double getAstronomicalUnits() {
        return astronomicalUnits;
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public void printData(){
        System.out.println("Name: " + name);
        System.out.println("Asronomical Units: " + astronomicalUnits);
        System.out.println("Mass: " + mass + "10^24");
        System.out.println("radius: " + radius + "m\n\n");
    }
}
