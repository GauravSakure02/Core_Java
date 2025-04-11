package fp;
class Addition {
	void add(int a, int b) {
		System.out.println(a+b);
	}
}
class Subtraction {
	void sub(int a, int b) {
		System.out.println(a-b);
	}
}

class Multiplication {
	void mul(int a, int b) {
		System.out.println(a*b);
	}
}

class Division {
	void div(int a, int b) {
		System.out.println(a/b);
	}
}

class Calc {
	void calculate(Addition a) {
		a.add(50, 60);
	}
	void calculate(Subtraction s) {
		s.sub(50, 60);
	}
	void calculate(Multiplication m) {
		m.mul(50, 60);
	}
	void calculate(Division d) {
		d.div(50, 60);
	}
}