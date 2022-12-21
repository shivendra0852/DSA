import java.util.*;
public class _1CheckYear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input here:-");
        int year = sc.nextInt();
        switch(year){
            case 365 : System.out.println("This is not a leap year.");
            break;

            case 366 : System.out.println("This is a leap year.");
            break;

            default : System.out.println("Please enter a valid input!");
        }
        sc.close();
    }
}
