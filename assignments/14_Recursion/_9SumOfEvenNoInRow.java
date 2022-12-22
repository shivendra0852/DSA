import java.util.Scanner;

public class _9SumOfEvenNoInRow {
    public static void printSum(int index, int N, int M, int[][] arr){
        if (index == N){
            return;
        }
        int sum=0;
        for(int i=0;i<M;i++){
            if(arr[index][i]%2==0){
                sum+=arr[index][i];
            }
        }
        
        System.out.println(sum);
        printSum(index+1,N,M,arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ptr = 0;
        int N= 3;
        int M = 3;
        int[][] arr = new int[N][M];
        System.out.println("Input:-");
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Output:-");
        printSum(ptr, N, M, arr);
        sc.close();
    }
}
