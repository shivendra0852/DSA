import java.util.Scanner;

public class _13FactorialOfN {
    public static int factorial(int n) {
        if(n==0){
            return 1;
        }

        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here to get the factorial:-");
        int num = sc.nextInt();
        System.out.println(factorial(num));
        sc.close();
    }
}
