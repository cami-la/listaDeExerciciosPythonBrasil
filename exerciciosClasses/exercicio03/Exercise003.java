class Exercise003 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the width of the location: ");
		double widthLocation = scan.nextDouble();
		
		System.out.print("Enter the length of the location: ");
		double lengthLocation = scan.nextDouble();
		
		Rectangle location = new Rectangle(widthLocation, lengthLocation);

		System.out.print("\nEnter the width of the porcelain floor: ");
		double  widthFloor = scan.nextDouble();
		
		System.out.print("Enter the length of the porcelain floor: ");
		double  lengthFloor = scan.nextDouble();
		
		Rectangle floor = new Rectangle(widthFloor, lengthFloor);
		
		double areaLocation = location.areaRectangle();
		double areaFloor = floor.areaRectangle();
		
		double amountOfFloor = areaLocation/areaFloor;
		
		System.out.println("\nIt will be necessary " + amountOfFloor + " floor.");
		
	}

}

