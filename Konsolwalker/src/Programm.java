import java.util.Scanner;

public class Programm {

	public static void main(String[] args) {

		Spielfeld f1 = new Spielfeld();
		f1.buildfield();

		player p1 = new player(f1);
		f1.printfield();
		System.out.println("g = Forward, l = turn left, r = turn right, q = quit");
		Scanner sc = new Scanner(System.in);
		char button = 0;

		while (button != 'q') {

			button = sc.next().charAt(0);
			if (button == 'g') {
				p1.forward(f1);
				System.out.println("g = Forward, l = turn left, r = turn right, q = quit");

			} else if (button == 'r') {
				p1.right(f1);
				System.out.println("g = Forward, l = turn left, r = turn right, q = quit");
			} else if (button == 'l') {
				p1.left(f1);
				System.out.println("g = Forward, l = turn left, r = turn right, q = quit");
			} else if (button == 'q') {
				System.out.println("Programm beendet");

			} else {
				System.out.println("Wrong Input");
				System.out.println("g = Forward, l = turn left, r = turn right, q = quit");
			}
		}

	}

}
