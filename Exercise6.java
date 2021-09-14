/*
UCF COP3330 FALL 2021 ASSIGNMENT 6 SOLUTION
COPYRIGHT 2021 Jonathan Tsui
 */
import java.util.Calendar;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int current, retire;
        int sub;

        System.out.println("What is your current age?");
        current = scan.nextInt();

        System.out.println("At what age would you like to retire?");
        retire = scan.nextInt();

         sub = retire - current;

        System.out.println("You have " + sub + " years until you can retire");

        int year = Calendar.getInstance().get(Calendar.YEAR);
        int newyear = year + sub;
        System.out.println("It's "+ year + ", so you can retire in " + newyear + ".");


    }
}
