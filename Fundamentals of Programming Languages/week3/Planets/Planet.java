public class Planet {
    private double diameter;
    private double distanceFromTheSun;
    private String name;
    Planet(double d, double ds, String s){
        diameter = d;
        distanceFromTheSun = ds;
        name = s;
    }
    public double getDiameter() { return diameter;};
    public String getDistanceFromTheSun() {return distanceFromTheSun + "m";};
    public void getStats(){
        System.out.println("Name: " + name);
        System.out.println("Diameter: "+ diameter);
        System.out.println("Distance from the sun: "+ distanceFromTheSun + "\n\n");
    }
}
