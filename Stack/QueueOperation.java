public class QueueOperation {
    public static class MyQueue {
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
        void enqueue(int val) {
            if(rear == size - 1) {
                System.out.println("Queue overflow");
                return;
            }
            if(front == -1) {
                front = 0;
            }
            rear++;
            arr[rear] = val;
        }
        void dequeue() {
            if(front == -1 || front > rear) {
                System.out.println("Queue Underflow");
                return;
            }
            front++;
        }
        int getFront() {
            if(front == -1 || front > rear) {
                System.out.println("Queue empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String args[]) {
        MyQueue s1 = new MyQueue(5);
        s1.enqueue(10);
        
    }
    
}
