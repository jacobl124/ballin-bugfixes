import java.util.Scanner;
public class BoxCars
{
    public static void main (String[] args)
    {
    boolean run = false ;
    PairOfDice pair = new PairOfDice();
    int Boxcars = 0;
   
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("Would you like to roll a pair of dice one thousand times? (y/n)");
    if (scan.next().equals("y"))
    run = true;
    while (run)
    {
      for( int i=0; i<=1000; i++)
      {
          System.out.println(pair.roll());
    
    if (pair.getResult() == 12)
    Boxcars++;
   
    

    }
     System.out.println("You rolled " + Boxcars + " boxcars.");
    System.out.print("Would you like to roll again? (y/n)");
    if (scan.next().equals("y"))
        run = true;
        else 
        run = false;
        Boxcars = 0;
    }
    }
    
}
        
