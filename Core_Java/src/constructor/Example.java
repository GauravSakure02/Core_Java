package constructor;
/*class Example {
		int x;
		int y;

		Example(){			//NPC
			x = 10;
			y = 20;
		}

		Example(int x, int y){		//PC
			this.x = x;
			this.y = y;
		}

		Example(Example e){		//CC
			this.x = e.x;
			this.y = e.y;
		}

		public String toString(){
			return x + "  " + y;
		}
	}*/
/*
class Example {
	private int x;
	private int y;

	Example(int x, int y) {
		System.out.println("param constructor");
		this.x = x;
		this.y = y;
	}

	public static void main(String[] args) {
		System.out.println("main ");

		Example e1 = new Example(10, 20);

		Example e2 = new Example(30, 40);

		System.out.println(e1.x + " " + e1.y);
		System.out.println(e2.x + " " + e2.y);
	}
}*/
/*
class Example {
	int x;
	int y;

	Example() {
		x = 10;
		y = 20;
	}

	Example(int x, int y) {
		this.x = x;
		this.y = y;
	}

	Example(Example e) {
		this.x = e.x;
		this.y = e.y;
	}

	public void display(){
		System.out.println(x + "  " + y);
	}
}*/

class  Example {
	int x ;
	int y ;

	Example() {
		this(10, 20);
		System.out.println("NPC is executed");
	}

	Example(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("I,I PC is executed");
	}

	Example(Example e){
		this.x = e.x;
		this.y = e.y;
		System.out.println("E PC is executed");
	}

}
