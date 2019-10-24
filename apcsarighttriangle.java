import java.util.Scanner;

public class apcsarighttriangle {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter base: ");
      int base = in.nextInt();

      System.out.print("Enter height: ");
      int height = in.nextInt();

      System.out.print("Enter hypotenuse: ");
      int hypotenuse = in.nextInt();

      int baseSquared = base * base;
      int heightSquared = height * height;
      int ab = baseSquared + heightSquared;
      int hypotenuseSquared = hypotenuse * hypotenuse;

      if (ab == hypotenuseSquared) {
        System.out.println("\nYes, that's a right triangle!");
      }

      if (ab != hypotenuseSquared) {
        System.out.println("\nNope...not a right triangle.");
      }
      in.close();
    }
}
