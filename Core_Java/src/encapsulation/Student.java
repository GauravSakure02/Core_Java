package encapsulation;
class Student extends Person {
	int sno;	 //extending Person functionality		
	String course;

	void listen() {		 //reusing Person class members in Student
				 //as if it is Student class member
	    System.out.println(name + " is listening "+ course);
	}			

	void reply() {
	    System.out.println(name + " is replying to "+ course + " questions");
	}

	void write() {
	    System.out.println(name + " is writing "+ course + " notes");
	}

	void read() {
	    System.out.println(name + " is reading "+ course + " notes");
	}
}