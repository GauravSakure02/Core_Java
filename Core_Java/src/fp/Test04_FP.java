package fp;
public class Test04_FP {
	public static void main(String[] args) {
		/*Calc calc = new Calc();
		
		Addition a1 = new Addition();
		a1.add(10, 20); calc.calculate(a1);

		Subtraction s1 = new Subtraction();
		s1.sub(10, 20); calc.calculate(s1);
		
		Multiplication m1 = new Multiplication();
		m1.mul(10, 20); calc.calculate(m1);
		
		Division d1 = new Division();
		d1.div(10, 20); calc.calculate(d1);
		System.out.println();
	*/
	//============ Functional Programming style ============================================	
					//Lambda Expression
		AO ao1 = (a, b) -> { System.out.println(a+b);};		//logic creation and storing
		AO ao2 = (a, b) -> { System.out.println(a-b);};
		AO ao3 = (a, b) -> { System.out.println(a*b);};
		AO ao4 = (a, b) -> { System.out.println(a/b);};
		
		ao1.ao(12, 13);		//calling and executing logic
		ao2.ao(12, 13);	
		ao3.ao(12, 13);	
		ao4.ao(12, 13);	
		
		Calculator cal = new Calculator();
		cal.calculate(ao1);
		cal.calculate(ao2);
		cal.calculate(ao3);		//passing logic as argument
		cal.calculate(ao4); 
	}
}