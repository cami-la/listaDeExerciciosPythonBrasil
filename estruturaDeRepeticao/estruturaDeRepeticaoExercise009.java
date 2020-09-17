//Make a program that prints on the screen only numbers odd between 1 and 50.

class EstruturaDeRepeticaoExercise009 {
  public static void main(String[] args) {
    System.out.println();

    for(int i = 1; i <=50; i++) {
      if (i % 2 != 0) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }
}
