package exercise;

// BEGIN
import java.util.Locale;

public class Cottage implements Home {
    private double area;
    private int floorCount;

    public Cottage(double area, int floorCount) {
	this.area = area;
	this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
	return area;
    }

    @Override
    public int compareTo(Home another) {
	return area > another.getArea() ? 1 : area < another.getArea() ? -1 : 0;
    }

    @Override
    public String toString() {
	return String.format(Locale.US, "%d этажный коттедж площадью %.1f метров", floorCount, area);
    }
}

// END
