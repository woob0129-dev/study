import java.util.*;
public class Main {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int INF = 1000000;
        int[] dp = new int[m + 1];

        Arrays.fill(dp, INF);
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            int t = sc.next().charAt(0);
            int c = sc.nextInt();

            if (t == 'A') { // A 타입: 무제한 사용
                for (int j = c; j <= m; j++) {
                    dp[j] = Math.min(dp[j], dp[j - c] + 1);
                }
            } else { // B 타입: 한 번만 사용
                for (int j = m; j >= c; j--) {
                    dp[j] = Math.min(dp[j], dp[j - c] + 1);
                }
            }
        }

        System.out.println(dp[m] == INF ? -1 : dp[m]);
    }
}