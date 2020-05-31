
public class Circle {
	    private double radius;

	    public void setRadius(double r) {
	        radius = r;
	    }

	    public double getRadius() {
	        return radius;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		Circle c2 = new Circle();

		c1.setRadius(10.0);
		c2 = c1;
		c2.setRadius(5.0);

		System.out.println(c1.getRadius() + ", " + c2.getRadius());
	}

}
