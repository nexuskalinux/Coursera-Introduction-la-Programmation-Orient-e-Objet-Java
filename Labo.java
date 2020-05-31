class Souris {

	public static final int ESPERANCE_VIE_DEFAUT = 36;

	private static int Souris_autres_age;

    /*******************************************
     * Completez le programme a partir d'ici.
     *******************************************/
	private int poids;
    private String couleur;
    private int age;
    private int esperanceVie;
    private boolean clonee;

    public Souris(int poids, String couleur){
        this.poids = poids;
        this.couleur = couleur;
        age = 0;
        esperanceVie = ESPERANCE_VIE_DEFAUT;
        clonee = false;
        System.out.println("Une nouvelle souris !");
    }

    public Souris(int poids, String couleur, int age){
        this.poids = poids;
        this.couleur = couleur;
        this.age = age;
        esperanceVie = ESPERANCE_VIE_DEFAUT;
        System.out.println("Une nouvelle souris !");
    }

    public Souris(int poids, String couleur, int age, int esperanceVie){
        this.poids = poids;
        this.couleur = couleur;
        this.age = age;
        this.esperanceVie = esperanceVie;
        System.out.println("Une nouvelle souris !");
    }

    public Souris(Souris copy){
        this.poids = copy.poids;
        this.couleur = copy.couleur;
        this.age = copy.age;
        this.esperanceVie = copy.esperanceVie*4/5;
        this.clonee = true;        
        System.out.println("Clonage d'une souris !");
    }
    
    public String toString(){
    	String strict = "Une souris " + couleur;
    		if (clonee) { strict += ", clonee,"; }
    			strict += " de " + age + " mois et pesant " + poids + " grammes"; return strict;
    }
    
    public void vieillir (){
    	age++;
    		if (clonee) { 
    			couleur = "verte";
    	}
    }
    
    public void evolue(){
    	while ( age < esperanceVie){
    		vieillir();
    	}
    }
        
}


/*******************************************
 * Ne rien modifier apres cette ligne.
 *******************************************/

public class Labo {

    public static void main(String[] args) {
        Souris s1 = new Souris(50, "blanche", 2);
        Souris s2 = new Souris(45, "grise");
        Souris s3 = new Souris(s2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        s1.evolue();
        s2.evolue();
        s3.evolue();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}