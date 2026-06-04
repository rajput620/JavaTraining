public class FibonacciRecursion1ton {

    static void printNumbers(int n) {

        if (n == 0) {
            return;
        }

        printNumbers(n - 1);

        System.out.print(n + " ");
    }

    public static void main(String[] args) {

        int n = 10;

        printNumbers(n);
    }
}



public class FibonacciRecursion n to 1 {
    static void printNumbers(int n) {
        if(n==0) {
            return 
        }

            System.out.print(n + " ");
            printNumbers(n-1);
            
        }
    

    public static void main(String[] args) {
        int n=10;

        printNumbers(n);
    
    }