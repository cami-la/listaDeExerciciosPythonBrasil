//Make a program that prints the numbers from 1 to 20, one below the other. Then modify the program so that it shows the numbers next to each other.

class EstruturaDeRepeticaoExercise006 {
  public static void main(String[] args) {
    System.out.println();

    for (int i = 1; i <= 20; i++) {
      System.out.println(i);
    }

    for (int i = 1; i <= 20; i++) {
      System.out.print(i + " ");
    }
    System.out.println();
  }
}
