package pack2;
import java.util.*;
public class Circle {
	public static void main(String[] args) {
		Scanner obj = new Scanner (System.in);
		System.out.println("enter radius:");
		float r = obj.nextFloat();
		float a = 3.14f * r * r;
System.out.println("area of circle = "+a);
System.out.printf("%1.2f",a);

	}

}
