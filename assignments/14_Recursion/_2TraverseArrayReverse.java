public class _2TraverseArrayReverse{
    public static void printArray(int index, int[] arr){
        if(index<0){
            return;
        }
        System.out.println(arr[index]);
        printArray(index-1, arr);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArray(4, arr);
    }
}