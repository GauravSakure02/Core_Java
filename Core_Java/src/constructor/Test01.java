package constructor;
class Test01 {
		public static void main(String[] args) {
			Example e1 = new Example();
			Example e2 = new Example(15, 16);
			
			System.out.println(e1);
			System.out.println(e2);
			System.out.println();

			e2.x = 45;
			e2.y = 55;

			Example e3 = new Example(e2);
			System.out.println(e2);
			System.out.println(e3);
			System.out.println(e2 == e3);
			System.out.println();

			
			Example e4 = e2;
			System.out.println(e2);
			System.out.println(e4);
			System.out.println(e2 == e4);

		}
	}