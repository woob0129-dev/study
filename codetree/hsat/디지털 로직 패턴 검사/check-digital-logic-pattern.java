import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in)
        );

        String s = br.readLine().trim();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long mask = (1L << K) - 1;

        long hash = 0;

        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            int bit = s.charAt(i) - '0';
            hash = ((hash << 1) | bit) & mask;

            if (i < K - 1) continue;

            int count = map.getOrDefault(hash, 0) + 1;

            if (count >= M) {
                System.out.println(1);
                return;
            }

            map.put(hash, count);
        }

        System.out.println(0);
    }
}