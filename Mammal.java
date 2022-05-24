/**
 * // create the other 2 setters and getters, for hasFur, species
 * @author staceya
 */

	public class Mammal {
		// attributes
		private int numOfLegs;
		private boolean hasFur;
		private String species;
		
		//default constructor
		public Mammal () {
			this.numOfLegs = 2;
			this.hasFur    = true;
			this.species   = "bear";
		} 
		
		//overloaded constructor
		public Mammal (int numOfLegs, boolean hasFur, String species) {
			this.numOfLegs = numOfLegs;
			this.hasFur	   = hasFur;
			this.species   = species;
			
		}
		
		//setter
		public void setNumOfLegs (int numOfLegs) {
			this.numOfLegs = numOfLegs;
		}
		
		//getter
		public int getNumOfLegs() {
			return this.numOfLegs;
		}
		
		
		public boolean isHasFur() {
			return hasFur;
		}

		public void setHasFur(boolean hasFur) {
			this.hasFur = hasFur;
		}

		public String getSpecies() {
			return species;
		}

		public void setSpecies(String species) {
			this.species = species;
		}

		public static void main(String []args) {
			
			Mammal mammal1 = new Mammal();// creating object type mammal  
			
			Mammal mammal2 = new Mammal(4, false, "cat");

			System.out.println(mammal2.species);
			
		}
	}

	
	
