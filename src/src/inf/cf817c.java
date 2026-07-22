package inf;
import java.util.Scanner;

public class cf817c {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long s = sc.nextLong();

        long first = -1;
        long limit = Math.min(n, s + 162);

        for (long i = s; i <= limit; i++) {
            long temp = i;
            long sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (i - sum >= s) {
                first = i;
                break;
            }
        }
        if (first == -1) {
            System.out.println(0);
        } else {
            System.out.println(n - first + 1);
        }

    }
}
