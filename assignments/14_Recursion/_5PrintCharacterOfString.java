public class _5PrintCharacterOfString {
    public static void printChar(int ptr, String str){
        if(ptr==str.length()){
            return;
        }
        System.out.println(str.charAt(ptr));
        printChar(ptr+1, str);

    }
    public static void main(String[] args) {
        printChar(0, "Shivendra");
    }
}
