public class Exercise002 {

	public static void main(String[] args) {
		Square square = new Square(5);
		
		square.area();
		System.out.println(square.sideValue());
		System.out.println(square);
		square.changeSideValue(2);
		System.out.println(square);
	}
}
