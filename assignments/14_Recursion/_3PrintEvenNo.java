public class _3PrintEvenNo {
    public static void printArray(int index, int[] arr){
        if(index==arr.length){
            return;
        }

        if(arr[index]%2==0){
            System.out.println(arr[index]);
        }

        printArray(index+1, arr);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArray(0, arr);
    }
}
