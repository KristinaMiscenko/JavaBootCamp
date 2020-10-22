package sef.module6.activity;

public class AbstractionActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shape p1 = new Rectangle(5,6);
		//Rectangle r1 = new Rectangle(5 ,6);
		
		p1.setColor("RED");
		
		System.out.println("Color of Rectangle is ..." + p1.getColor());
		System.out.println("Area of Rectangle is..." + p1.calculateArea());
		System.out.println("Perimeter of the Rectangle is..." + p1.calculatePerimeter());
		
		
	}

}
