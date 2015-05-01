import java.util.Scanner;

public class DiceRoller
{
    public static void main (String[] args)
    {
    boolean run = true ;
    Die dice = new Die(6);
    Scanner scan = new Scanner(System.in);
    while (run )
    {
    System.out.print("Enter a value for the amount of faces on the die: ");
    dice.setNumberOfSides(scan.nextInt());
    
    System.out.println(dice.getFaceValue());
    System.out.println(dice.roll());
    
    System.out.print("Would you like to roll again? (y/n)");
    if (scan.next().equals("y"))
        run = true;
        else 
        run = false;
    }
    
    
    
}
}
   


