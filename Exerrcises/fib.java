import java.util.*;

class fib {
    public int fibo(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        int k, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter k value : ");
        k = sc.nextInt();
        fib fibObj = new fib();
        for (i = 0; i < k; i++) {
            System.out.print(fibObj.fibo(i) + " ");
        }
    }
}
