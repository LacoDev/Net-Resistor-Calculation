import java.util.TreeSet;
public class Resistor extends Net{

	protected double value;
	
	public Resistor(double initValue, String id) { //Initialisierungskonstruktor
		this.value = initValue;
		this.resistors.add(id); //
	}

	public TreeSet<String> getResistors() {
		return this.resistors;
	}

	@Override
	public double ohm() {
		return value;
	}
}