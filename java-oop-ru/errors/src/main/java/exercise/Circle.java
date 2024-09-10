package exercise;

// BEGIN
class Circle {

    private Point point;
    private int radius;

    Circle(Point p, int rad) {
	point = p;
	radius = rad;
    }

    public int getRadius() {
	return radius;
    }

    public double getSquare() throws NegativeRadiusException {
	if (radius < 0) {
	    throw new NegativeRadiusException("");
	} else {
	    return Math.PI * radius * radius;
	}
    }
}

// END
