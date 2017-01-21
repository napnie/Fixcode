/**
 * A simple model for a person with a name.
 * 
 * @author Nitith Chayakul
 */
//TODO Complete the missing Javadoc.
//TODO Fix bad Javadoc tags and poorly written Javadoc.
//TODO Make sure methods have @param and @return tags (if they return something)
//TODO Remove all the "TODO" comments after you do them.
//TODO Fix coding errors.
public class Person {
	/** the person's full name. */
	public String name;
	
	/**
	 * Initialize a new Person object.
	 * @param name - Full name of the person
	 */
	public Person(String name) {
		this.name = name;
	}
	
	/**
	 * Get the Person's name.
	 * @return name - Person's full name
	 */
	public String getName() {
		return name;
	}

	
	/**
	 * Set or change the Person's name.
	 * @param newname = a name that you want to change into
	 */
	public void setname(String newname) {
		this.name = newname;
	}
	
	/**
	 * Compare person's by name.
	 * They are equal if the name matches.
	 * @param other is another Person to compare to this one.
	 * @return true if the name is same, false otherwise.
	 */
	public boolean equals(Object obj) {
		//TODO After running the test program (Main), fix this method.
		//TODO Use the 4-step template for equals in the Fundamental Methods handout.
		if (obj == null || obj.getClass() != this.getClass()) return false;
		Person other = (Person) obj;
		return name.equals( other.getName() );
	}
	
	/**
	 * Get a string representation of this Person.
	 * @return a String representation of this Person
	 */
	public String toString() {
		return "Person " + name;
	}
}
