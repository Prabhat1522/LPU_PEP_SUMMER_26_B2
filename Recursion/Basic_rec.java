public class Basic_rec {

    public static int fact(int n) {
        if(n == 0 || n == 1) return 1;
        return n * fact(n-1);
    }
    public static int fibonacci(int n) {
        if(n == 0 || n == 1) return n;
        int fnm1 = fibonacci(n - 1);
        int fnm2 = fibonacci(n - 2);
        return fnm1 + fnm2;
    }

    public static void main(String[] args) {
        System.out.println("-------------------Recursion-----------------------");
        System.out.print("the factorial of given number is : ");
        System.out.println(fact(5));

        int n = 5;
        System.out.print("The Fibonacci series number : ");
        System.out.println(fibonacci(n));
        System.out.print("The Fibonacci series : ");
        for(int i=0;i<=n;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
}