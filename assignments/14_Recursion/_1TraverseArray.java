public class _1TraverseArray{
    public static void printArray(int index, int[] arr){
        if(index==arr.length){
            return;
        }
        System.out.println(arr[index]);
        printArray(index+1, arr);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printArray(0, arr);
    }
}