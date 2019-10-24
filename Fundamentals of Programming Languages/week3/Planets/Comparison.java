import java.util.Comparator;

class PlanetDistanceComparisonReverse implements Comparator<Planet> {
    @Override
    public int compare(Planet p1, Planet p2){
        double p1au = p1.getAstronomicalUnits();
        double p2au = p2.getAstronomicalUnits();
        if(p1au - p2au > 0){
            return -1;
        }else if(p1au - p2au < 0){
            return 1;
        }
        return 0;
    }
}
