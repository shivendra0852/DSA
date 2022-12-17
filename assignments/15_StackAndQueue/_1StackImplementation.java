public class _1StackImplementation {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(2);
        stack.push(4);
        stack.pop();
        stack.peek();
        stack.pop();
        stack.push(8);
        stack.peek();
        stack.pop();
        stack.peek();
    }
}

class Stack{
    int top = -1;
    int[] arr;
    Stack(int size){
        this.arr = new int[size];
    }
    
    public void push(int data){
        if(isFull()){
            return;
        }
        top++;
        arr[top] = data;
    }
    
    public void pop(){
        if(isEmpty()){
            return;
        } top--;
    }
    
    public void peek(){
        if(isEmpty()){
            System.out.println("Empty!");
            return;
        }
        System.out.println(arr[top]);
    }
    
    public boolean isEmpty(){
        return top == -1;
    }
    
    public boolean isFull(){
        return top == arr.length-1;
    }
}
