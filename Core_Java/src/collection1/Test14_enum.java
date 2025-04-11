package collection1;
enum Course {
	C(2000), CPP(2500), ORACLE(3000), HTML(3000), 
	COREJAVA(3500), ADVJAVA(3500), SBMS(8000),
	PYTHON(6000)
	
		;
	
	private double fee;

	Course(double fee){
		this.fee = fee;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}
	
}
public class Test14_enum {
	public static void main(String[] args) {
		
		Course[] courses = Course.values();
		
		System.out.println("======================================");
		System.out.println("S.No\tCourse\t\t\tFee");
		System.out.println("======================================");
		for(int i=0; i<courses.length; i++) {
			Course course = courses[i];
			System.out.println(course.ordinal()+1 + "\t" + course.name() + "\t\t\t" + course.getFee());
		}
		System.out.println("======================================");
		
		
	} 
}