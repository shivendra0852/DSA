public class _7CharAtOddPosition {
    public static void printCharacter(int ptr, String str){
        if(ptr==str.length()){
            return;
        }
        if(ptr%2!=0){
            System.out.println(str.charAt(ptr));
        }
        printCharacter(ptr+1, str);
    }
    public static void main(String[] args) {
        String str = "Shivendra";
        printCharacter(0, str);
    }
}
