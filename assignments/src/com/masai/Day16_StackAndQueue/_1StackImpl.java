package com.masai.Day16_StackAndQueue;

class Stack{
    int[] arr;
    int ptr = -1;
    Stack(int size){
        this.arr = new int[size];
    }

    public void push(int data){
        if(isFull()){
            System.out.println("Stack is full!");
            return;
        }

        ptr++;
        arr[ptr] = data;
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return;
        }

        ptr--;
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }

        System.out.println(arr[ptr]);
    }

    private boolean isEmpty(){
        return ptr == -1;
    }

    private boolean isFull(){
        return ptr == arr.length-1;
    }
}


public class _1StackImpl {
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
