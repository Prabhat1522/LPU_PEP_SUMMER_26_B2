class BasicsStack {
    public static class MyStack {
        int[] arr;
        int top;
        int size;
        MyStack(int size) {
            this.size = size;
            arr = new int[size];
            top = -1;
        }
        void push(int val) {
            if(top == size - 1) {
                System.out.println("Stack Overflow");
                return;
            }
            top++;
            arr[top] = val;
        }
        int pop() {
            if(top == -1) {
                System.out.println("Stack Underflow");
                return -1;
            }
            return arr[top--];
        }
        int peek() {
            if(top == -1) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[top];
        }
        boolean isEmpty() {
            return top == -1;
        }

        void display() {
            if(top == -1) {
                System.out.println("Stack is Empty");
                return;
            }
            for(int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        
        MyStack s1 = new MyStack(5);
        s1.push(10);
        s1.push(20);
        s1.push(30);

        s1.display();

        System.out.println(s1.pop());   // 30

        s1.display();      // 20 10

         System.out.println(s1.peek());  // 20

        
    }    
}
