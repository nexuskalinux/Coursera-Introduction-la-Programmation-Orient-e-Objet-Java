
	class Livre {

		private int numPages;

		public void setNumPages(int numPages) {
			numPages = this.numPages;
		}

		public void afficher() {
			System.out.println(numPages);
		}
	

	public static void main(String[] args) {
		
		Livre livre = new Livre();
		
		livre.setNumPages(120);
		
		livre.afficher();
		
	}
	}	