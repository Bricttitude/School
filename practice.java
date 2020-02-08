import java.util.Scanner;

public class Balloon
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("Diameter: ");
      double d = in.nextDouble();
      double od = d;
      double vol1 = Math.PI * d * d * d / 6;
      d++;
      double vol2 = Math.PI * d * d * d / 6;
      double growth = vol2 - vol1;
      System.out.printf("Increase: %.0f %n", growth);
      d++;
      double vol3 = Math.PI * d * d * d / 6;
      growth = vol3 - vol2;
      System.out.printf("Increase: %.0f", growth);
      System.out.println();
   }
}
