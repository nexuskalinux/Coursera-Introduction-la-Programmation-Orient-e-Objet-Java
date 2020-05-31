
public class Point {
	private double x;
	private double y;
	 
	public void setX(double newX){
		x = newX;
	}

	public void setY(double newY){
		y = newY;
	}

	public double getX(){ return x;}

	public double getY(){ return y;}
	
	public static void main(String[] args) {	
		
Point p1 = new Point();
Point p2 = new Point();

p1.setX(4.0);
p2.setY(2.5);

System.out.println(p1.getX() + ", " + p1.getY());
System.out.println(p2.getX() + ", " + p2.getY());
}
}
