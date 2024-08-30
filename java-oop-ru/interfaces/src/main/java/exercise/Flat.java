package exercise;

// BEGIN
import java.util.Locale;

public class Flat implements Home {
    private double area;
    private double balconyArea;
    private int floor;

    public Flat(double area, double balconyArea, int floor) {
        this.area = area;
	this.balconyArea = balconyArea;
	this.floor = floor;
    }

    @Override
    public double getArea() {
	return area + balconyArea;
    }

    @Override
    public int compareTo(Home another) {
	return getArea() > another.getArea() ? 1 : getArea() < another.getArea() ? -1 : 0;
    }

    @Override
    public String toString() {
	return String.format(Locale.US, "Квартира площадью %.1f метров на %d этаже", getArea(), floor);
    }
}

// END
