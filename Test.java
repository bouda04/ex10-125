import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Plane p1 = new Plane(50, 8);
		Scanner in = new Scanner(System.in);
		System.out.println("enter list of orders...");
		int row = in.nextInt();
		char col = in.next().charAt(0);
		while (row != 1 && col!='A') {
			if (p1.order(row, col)== false)
				System.out.println("this seat is already taken!!!");
			row = in.nextInt();
			col = in.next().charAt(0);
		}
		System.out.println(p1.toString());

	}

}
