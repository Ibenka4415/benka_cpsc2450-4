import java.util.Scanner;

public class Area {
	static Scanner sc = new Scanner(System.in);
	
	public static void welcomeBanner() {
		System.out.print("*******************************************************************\n");
		System.out.print("                       Shape Calculator\n");
		System.out.print("*******************************************************************\n");
	}
	
	public static void Circle () {
		System.out.print("Enter the radius: ");
		int radius = sc.nextInt();
		double Circumfrence = Math.PI*(2 * radius);
		double areaCircle = Math.PI * Math.pow(radius, 2);
		System.out.printf("The area of the circle %.2f, and the Circumference is %.2f \n",areaCircle,Circumfrence);
	}
	
	public static void Rectangle() {
		System.out.print("Enter the Length and Width: ");
		int Length = sc.nextInt();
		int Width = sc.nextInt();
		double areaRec = Length * Width;
		double perimeterRec = (Length * 2)+(Width * 2);
		System.out.printf("The area of the Rectangle %.2f, and the perimeter is %.2f \n",areaRec, perimeterRec);
	}
	
	public static void Triangle() {
		System.out.print("Enter the Length of the three sides: ");
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();
		double areaTri = (side1*side2*side3)*.5;
		double perimeterTri = side1 + side2 + side3;
		System.out.printf("The area of the Triangle %.2f, and the perimeter is %.2f \n",areaTri, perimeterTri);
	}
	
	public static void main(String[] args) {
		
		String Shape;
		welcomeBanner();
		do {
			System.out.print("Enter C for circle, R for rectangle, or T for Triangle:");
			Shape = sc.next().trim().toUpperCase();
		
			if (Shape.equals("C")){
				Circle();
				
				
			} else if (Shape.equals("R")){
				Rectangle();
				
			} else if (Shape.equals("T")){
				Triangle();
				
			} else if (!Shape.equals("Q")){
				System.out.print("That is not a shape\n");
			}
			
		}while (!Shape.equals("Q"));
			System.out.print("Thanks for using Shape Calulator");
		sc.close();
		
	}
		
}
