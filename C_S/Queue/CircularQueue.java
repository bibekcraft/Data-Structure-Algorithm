package Queue;

public class CircularQueue {
    int front = -1;
    int rear = -1;
    int size;

    CircularQueue(int size) {
        this.size = size;
        queue = new int[size];
    }

    void enqueue(int data){

    }if(isFull(){
        System.out.println("queue is full");
    })

    boolean isFull() {
        return (rear + 1) % size == front;
    }else

    {
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;
        queue[rear] = data;
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("queue is empty");
            return -1;
        }
        if (front == rear) {
            int temp = front;
            front = rear = -1;
            return queue[temp];
        }
        int temp = front;
        front = (front + 1) % size;
        return queue[temp];

    }

    boolean isEmpty() {

    }

}

 public static void main(String[] args){

 }