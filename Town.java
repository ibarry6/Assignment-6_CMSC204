
/**
 * @author Iburahima Barry
 */

public class Town implements Comparable<Town> {

	protected String name = "";
	protected java.util.Set<Town> towns = new java.util.HashSet<Town>();
	protected int weight = Integer.MAX_VALUE;
	protected Town previous = null;

	
	 // Constructor 
	
	public Town(String name) {

		this.name = name;
	}

	
	 // Copy constructor
	
	public Town(Town templateTown) {

		this.name = templateTown.name;
		this.weight = templateTown.weight;
		this.towns = templateTown.towns;
		this.previous = templateTown.previous;
	}

	
	 // Reset
	 
	public void reset() {
		this.weight = Integer.MAX_VALUE;
		this.previous = null;
	}

	
	 // Returns name of town
	 
	public String getName() {
		return this.name;
	}

	
	 // Return hashcode
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

	
	 // Returns toString return toString
	 
	@Override
	public String toString() {
		return this.getName();
	}

	
	 // Returns true if town names are equal by comparison of names, false if not
	 
	@Override
	public boolean equals(Object obj) {
		return obj == this || this.name.toLowerCase().equals(((Town) obj).name.toLowerCase());
	}

	
	 // Compare 2 Town objects by comparing their names
	//  return integer
	 
	@Override
	public int compareTo(Town o) {
		return this.name.compareTo(o.name);
	}
}