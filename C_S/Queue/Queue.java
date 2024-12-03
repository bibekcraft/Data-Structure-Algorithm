public class Queue {
    int queue[];
    int size;
    int rear = -1;
    int front
    
    Queue(int  size) {
        this.size = size;
        queue = new int[size];
    }

    void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1)
                front = 0;
            queue[++rear] = data;
        }
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        } if (front ==rear ){
            int temp = front ; 
            front = rear =-1;
            return queue[temp];
        }
            return queue[front++];
    }

    boolean isFull() {
        return rear == size - 1;
    }
ean isEmpty(

     }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(1);
        q.enqueue(2);
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
    }
}