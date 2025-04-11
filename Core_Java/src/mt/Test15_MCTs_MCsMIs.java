package mt;
class AddThread extends Thread {
	@Override
	public void run() {
		int sum = 1;
		for(int i=2; i<=3; i++) {
			sum += i;
			System.out.println("summation: "+ sum);
		}
	}
}

class SubThread extends Thread {
	@Override
	public void run() {
		int sub = 1;
		for(int i=2; i<=3; i++) {
			sub -= i;
			System.out.println("subtraction: "+ sub);
		}
	}
}

class MulThread extends Thread {
	@Override
	public void run() {
		int mul = 1;
		for(int i=2; i<=3; i++) {
			mul *= i;
			System.out.println("multiplication: "+ mul);
		}
	}
}

public class Test15_MCTs_MCsMIs {
	public static void main(String[] args) {
		new AddThread().start();
		new SubThread().start();
		new MulThread().start();
	}
}