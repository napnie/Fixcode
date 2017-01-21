//TODO Write class Javadoc
/**
 * An extends of Person class to represents a student.
 * @author Nitith Chayakul
 */
public class Student extends Person {
	private long id;
	
	/**
	 * Initialize a new Student object which is an extends of Person class.
	 * @param name - Student's name manage by Person class
	 * 		  id - Student's ID
	 */
	//TODO Write constructor Javadoc
	public Student(String name, long id) {
		super(name); // name is managed by Person class
		this.id = id;
	}

	/** 
	 *Return a string representation of this Student. 
	 *@return String represents this Student class
	 */
	public String toString() {
		return String.format("Student %s (%d)", getName(), id);
	}

	//TODO Fix the parameter!
	//TODO Write Javadoc and fix equals: two objects are equal if
	//TODO they are both Students, have same name, *and* have same id.
	//TODO Use the 4-step template for equals in the Fundamental Methods handout.
	/**
	 * Two students are equal if their name and ID is the same.
	 */
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass() ) return false;
		
		Student other = (Student) obj;
		return this.id == other.getId() && name.equalsIgnoreCase(other.getName());
	}

	//TODO Write getter and setter for id.  Write Javadoc, of course.
	/** 
	 * Accessor method for id 
	 * @return Student id 
	 */
	public long getId(){
		return id;
	}
	
	/** 
	 *  Change the student's id
	 *  @param id - ID to assign to this student
	 */
	public void setId(long id){
		this.id = id;
	}
}
