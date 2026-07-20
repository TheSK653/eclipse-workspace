package cf10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class c {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            int total_a = 0;
            int total_b = 0;
            for (char c : s.toCharArray()) {
                if (c == 'a') {
                    total_a++;
                } else {
                    total_b++;
                }
            }

            if (total_a == total_b) {
                System.out.println(0);
                continue;
            }

            int target_diff = total_a - total_b;
            
            Map<Integer, Integer> memo = new HashMap<>();
            
            memo.put(0, -1);
            
            int current_diff = 0;
            int min_len = n;

            for (int j = 0; j < n; j++) {
                if (s.charAt(j) == 'a') {
                    current_diff++;
                } else {
                    current_diff--;
                }

                int needed_diff = current_diff - target_diff;
                if (memo.containsKey(needed_diff)) {
                    int i = memo.get(needed_diff);
                    int len = j - i;
                    min_len = Math.min(min_len, len);
                }

                if (!memo.containsKey(current_diff)) {
                    memo.put(current_diff, j);
                }
            }
            
            if (min_len == n) {
                 System.out.println(-1);
            } else {
                 System.out.println(min_len);
            }
        }
        sc.close();
    }
}