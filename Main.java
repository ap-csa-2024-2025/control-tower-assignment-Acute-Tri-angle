import java.util.Scanner;
 
public class Main
{
  public static void main(String[] args)
  {
   // Complete the code below
   
   // TODO: Create Airplane 1 and 2
    Airplane boeing = new Airplane();
    Airplane malaysian = new Airplane("AAA02", 15.8, 128, 30000);
   // TODO: Create a Scanner
   Scanner sc = new Scanner(System.in);
   // TODO: Getting inputs for Airplane 3
   System.out.println("Enter the details of the third airplane (call-sign, distance, bearing and altitude): ");
   String cs = sc.nextLine();
   double dist = sc.nextDouble();
   int dir = sc.nextInt();
   int alt = sc.nextInt();
   // TODO: Create Airplane 3 from inputs
   Airplane american = new Airplane(cs, dist, dir, alt);
   // TODO: Print the initial positions
   System.out.println("\nInitial Positions:");
   System.out.println("\"Airplane 1\": " + boeing.toString());
   System.out.println("\"Airplane 2\": " + malaysian.toString());
   System.out.println("\"Airplane 3\": " + american.toString());

   
   // TODO: Print initial distances 
   System.out.println("\nInitial Distances:");
   System.out.println("The distance between Airplane 1 and Airplane 2 is " + boeing.distTo(malaysian) + " miles.");
   System.out.println("The distance between Airplane 1 and Airplane 3 is " + boeing.distTo(american) + " miles.");
   System.out.println("The distance between Airplane 2 and Airplane 3 is " + malaysian.distTo(american) + " miles.");
   
   // TODO: Print initial height differences
   System.out.println("\nInitial Height Differences:");
   System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + Math.abs(boeing.getAlt() - malaysian.getAlt()) + " feet.");
   System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + Math.abs(boeing.getAlt() - american.getAlt()) + " feet.");
   System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + Math.abs(malaysian.getAlt() - american.getAlt()) + " feet.");
   
   // TODO: Airplane 1 changes
   boeing.move(malaysian.distTo(american), 65);
   boeing.gainAlt();
   boeing.gainAlt();
   boeing.gainAlt();
   // TODO: Airplane 2 changes
   malaysian.move(8.0, 135);
   malaysian.loseAlt();
   malaysian.loseAlt();
   // TODO: Airplane 3 changes
   american.move(5.0, 55);
   american.loseAlt();
   american.loseAlt();
   american.loseAlt();
   american.loseAlt();
   // TODO: Print new positions of airplanes
   System.out.println("\nNew Positions: ");
   System.out.println("\"Airplane 1\": " + boeing.toString());
   System.out.println("\"Airplane 2\": " + malaysian.toString());
   System.out.println("\"Airplane 3\": " + american.toString());
   // TODO: Print new distances between airplanes
   System.out.println("\nNew Distances:");
   System.out.println("The distance between Airplane 1 and Airplane 2 is " + boeing.distTo(malaysian) + " miles.");
   System.out.println("The distance between Airplane 1 and Airplane 3 is " + boeing.distTo(american) + " miles.");
   System.out.println("The distance between Airplane 2 and Airplane 3 is " + malaysian.distTo(american) + " miles.");
   
   // TODO: Print new heights between airplanes
   System.out.println("\nNew Height Differences:");
   System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + Math.abs(boeing.getAlt() - malaysian.getAlt()) + " feet.");
   System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + Math.abs(boeing.getAlt() - american.getAlt()) + " feet.");
   System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + Math.abs(malaysian.getAlt() - american.getAlt()) + " feet.");

   sc.close();
  }
}
