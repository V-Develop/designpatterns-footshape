import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      FootShape footShape = new FootShape();  
      Foot foot = new Foot(footShape);
      Scanner sc = new Scanner(System.in);
      System.out.print("What to draw? 1. Ellipse, 2. Rectangle ");
      int type = sc.nextInt();
      switch(type) {
          case 1:
              foot.draw("Ellipse");
              break;
          case 2:
              foot.draw("Rectangle");
              break;
      }
    }
}
