import java.util.TreeSet;

public abstract class Net { // Abstrakte Klassen enthalten keine Konstruktoren

	protected TreeSet<String> resistors = new TreeSet<>();

	public abstract double ohm(); //abstrakte Methode enthält kein Methodenrumpf

	public String show() {
		String str = "";
		for (String id : resistors){
			str += (id + " ");
		}
		return str;
	}	
}








