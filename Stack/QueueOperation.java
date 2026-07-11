public class QueueOperation {
    static class MyQueue {
        int[] arr;
        int front;
        int rear;
        int size;

        MyQueue(int size) {
            this.size = size;
            arr = new int[size];
            front = -1;
            rear = -1;
        }
        // Enqueue
        void enqueue(int val) {
            if (rear == size - 1) {
                System.out.println("Queue Overflow");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear++;
            arr[rear] = val;
            System.out.println(val + " inserted into queue");
        }
        // Dequeue
        void dequeue() {
            if (front == -1 || front > rear) {
                System.out.println("Queue Underflow");
                return;
            }
            System.out.println(arr[front] + " removed from queue");
            front++;
            // Reset when queue becomes empty
            if (front > rear) {
                front = -1;
                rear = -1;
            }
        }
        // Get Front Element
        int getFront() {
            if (front == -1) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }
        // Get Rear Element
        int getRear() {
            if (rear == -1) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[rear];
        }
        // Check if Queue is Empty
        boolean isEmpty() {
            return front == -1;
        }
        // Check if Queue is Full
        boolean isFull() {
            return rear == size - 1;
        }
        // Current Size
        int size() {
            if (front == -1)
                return 0;
            return rear - front + 1;
        }
        // Display Queue
        void display() {
            if (front == -1) {
                System.out.println("Queue is Empty");
                return;
            }
            System.out.print("Queue : ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        MyQueue q = new MyQueue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display();

        System.out.println("Front = " + q.getFront());
        System.out.println("Rear = " + q.getRear());

        System.out.println("Is Empty = " + q.isEmpty());
        System.out.println("Is Full = " + q.isFull());

        q.dequeue();
        q.dequeue();

        q.display();

        System.out.println("Current Size = " + q.size());

        q.enqueue(50);
        q.enqueue(60);

        q.display();

        System.out.println("Front = " + q.getFront());
        System.out.println("Rear = " + q.getRear());

        System.out.println("Is Full = " + q.isFull());

        q.enqueue(70); // Overflow
    }
}