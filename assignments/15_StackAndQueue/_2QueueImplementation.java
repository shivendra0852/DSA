public class _2QueueImplementation{
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(2);
        queue.enqueue(5);
        queue.enqueue(3);
        queue.enqueue(1);
        queue.enqueue(8);
        queue.enqueue(6);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}

class Queue{
    int[] arr;
    int front = 0;
    int rear = 0;
    int count = 0;
    Queue(int size){
        this.arr = new int[size];
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full!");
            return;
        }

        arr[front] = data;
        System.out.println(arr[front]);
        count++;
        front = (front+1) % arr.length;
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty!");
            return;
        }

        System.out.println(arr[rear]);
        count--;
        rear = (rear+1) % arr.length;
    }


    private boolean isEmpty(){
        return count == 0;
    }

    private boolean isFull(){
        return count == arr.length;
    }
}