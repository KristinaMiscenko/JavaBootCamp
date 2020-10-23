package sef.FinalActivity;

class Calculator {
	public double sum(double a, double b) {		
		return a + b;
	}
	
	public double diff(double a, double b) {
		return a - b;
	}
	
	public double mul(double a, double b) {
		return a * b;
	}
	
	public double div(double a, double b) {
		return a / b;
	}
}

public class SecondActivity {
	public static void main(String[] args) {
		System.out.println("==== Calculator ====");
		
		Calculator c = new Calculator();
		
		double sum = c.sum(2.5, 3.75);
		double diff = c.diff(10, 3.25);
		double mul = c.mul(14, 12);
		double div = c.div(256, 4);
		
		System.out.println("Sum: 2.5 + 3.75 = " + sum);
		System.out.println("Diff: 10 - 3.25 = " + diff);
		System.out.println("Mul: 14 * 12 = " + mul);
		System.out.println("Div: 256 / 4 = " + div);
	}
}

