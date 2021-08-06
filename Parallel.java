import java.util.TreeSet;

public class Parallel extends Net {

	// gekapselte Datenelemente
	private Net w3;
	private Net w4;
	
	//Laufzeitfehler
	public Parallel(Net initw3, Net initw4){
		try {
			TreeSet<String> tmp = new TreeSet<String>();
			for(String id : initw3.resistors) {
				tmp.add(id);
			}
			for(String id : initw4.resistors) {
				tmp.add(id);
			}
			
			this.w3 = initw3;
			this.w4 = initw4;
			
			if (tmp.size() != (initw3.resistors.size() + initw4.resistors.size())) {
				throw new IDNotUniqueException("In beiden Netzen sind ein oder mehrere Resistoren enthalten.");
			} else {
				this.resistors = tmp;
			}
		} catch(IDNotUniqueException e){
			System.err.println("Fehler: ein paralleles Netz konnte nicht aus dem Netz erstellt werden" + initw3.show() + "and" + initw4.show() + "Error message: ");
			System.err.println(e.getMessage());
			System.err.println("Das Netz konnte nicht erstellt werden");
			System.exit(1);
		}
	}

	public double ohm() { //Gesamtwiderstand
		return 1/((1/w3.ohm()) + (1/w4.ohm())); //Parallelschaltung wird zurückgegeben in Ohm
	}
}