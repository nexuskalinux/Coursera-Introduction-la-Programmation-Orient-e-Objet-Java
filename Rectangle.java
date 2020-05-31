
public class Rectangle {
	    private double largeur;
	    private double hauteur;

	    public Rectangle(double lr, double hr) {
	        largeur = lr;
	        hauteur = hr;
	    }
	    public Rectangle(Rectangle r) {
	        this(r.getLargeur(), r.getHauteur());
	    }

	    public void setLargeur(double lr){ largeur = lr; }
	    public void setHauteur(double hr){ hauteur = hr; }

	    public double getLargeur() { return largeur; }
	    public double getHauteur() { return hauteur; }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(2, 1);
		Rectangle r2 = new Rectangle(r1);

		System.out.println(r1 == r2);
		System.out.println(r1.equals(r2));

		r1.setHauteur(2.4);
		System.out.println(r2.getHauteur());
	}

}
