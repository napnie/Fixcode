/**
 * An extends of Person class to represents a student.
 * @author Nitith Chayakul
 */
public class Student extends Person {
	private long id;
	
	/**
	 * Initialize a new Student object which is an extends of Person class.
	 * @param name - Student's name manage by Person class
	 * @param id - Student's ID
	 */
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

	/**
	 * Two students are equal if their name and ID is the same.
	 * @param obj - Object that you want to check
	 * @return boolean - Is the two object equal or not
	 */
	public boolean equals(Object obj) {
		if (obj == null || obj.getClass() != this.getClass() ) return false;
		
		Student other = (Student) obj;
		return this.id == other.getId() && name.equalsIgnoreCase(other.getName());
	}

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
