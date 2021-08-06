import java.util.TreeSet;

public class Serial extends Net { //gekapselte Datenelemente
	private Net w1;
	private Net w2;

	//Laufzeitfehler
	
	public Serial(Net initw1, Net r2){
		try {
			TreeSet<String> tmp = new TreeSet<String>();
			
			for(String id : initw1.resistors) {
				tmp.add(id);
			}
			for(String id : r2.resistors) {
				tmp.add(id);
			}
			
			this.w1 = initw1;
			this.w2 = r2;
			
			if (tmp.size() != (initw1.resistors.size() + r2.resistors.size())) {
				throw new IDNotUniqueException("In beiden Netzen sind ein oder mehrere Resistoren enthalten.");
			} 
			else {
				this.resistors = tmp;
			}
		}
		catch(IDNotUniqueException e){
			System.err.println("Fehler: ein paralleles Netz konnte nicht aus dem Netz erstellt werden" + initw1.show() + "and" + r2.show() + "Error message: ");
			System.err.println(e.getMessage());
			System.err.println("Das Netz konnte nicht erstellt werden");
			System.exit(1);
		}
	}

	public double ohm() { //Gesamtwiderstand
		return (w1.ohm() + w2.ohm()); //Summe der Reihenschaltung zurück geben
	}
}