import java.io.*;
import java.util.*;

public class Main {

    static int N, K;
    static long[] pos;

    static boolean check(long length) {
        int count = 1;
        long end = pos[0] + length - 1;

        for (int i = 1; i < N; i++) {
            if (pos[i] > end) {
                if (++count > K) return false;
                end = pos[i] + length - 1;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        pos = new long[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            pos[i] = Long.parseLong(st.nextToken());
        }

        long minLen = 1;
        long maxLen = pos[N - 1] - pos[0] + minLen;

        while (minLen < maxLen) {
            long mid = minLen + (maxLen - minLen) / 2;
            if (check(mid)) {
                maxLen = mid;
            } else {
                minLen = mid + 1;
            }
        }

        System.out.println(minLen);
    }
}