package inf;
import java.util.Scanner;

public class cf545c {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] height = new int[n];  
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            height[i] = sc.nextInt();
        }
        if (n <= 2) {
            System.out.println(n);
            return;
        }

        int count = 2;
        long Occupied = arr[0];

        for (int i = 1; i < n - 1; i++) {

            if (arr[i] - height[i] > Occupied) {
                count++;
                Occupied = arr[i];
            } else if (arr[i] + height[i] < arr[i + 1]) {
                count++;
                Occupied = arr[i] + height[i];
            } else {
                Occupied = arr[i];
            }
        }
        System.out.println(count);
    }
}
