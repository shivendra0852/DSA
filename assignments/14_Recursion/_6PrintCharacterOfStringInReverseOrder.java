public class _6PrintCharacterOfStringInReverseOrder {
    public static void printChar(int ptr, String str){
        if(ptr==str.length()){
            return;
        }
        
        printChar(ptr+1, str);
        System.out.println(str.charAt(ptr));

    }
    public static void main(String[] args) {
        printChar(0, "Shivendra");
    }
}
