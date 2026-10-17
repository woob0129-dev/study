import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String S = br.readLine();

        if (N % 2 != 0) {
            System.out.println("No");
            return;
        }

        int min = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {
            char ch = S.charAt(i);

            if (ch == '(') {
                min++;
                max++;
            } else if (ch == ')') {
                min--;
                max--;
            } else {
                min--;
                max++;
            }

            if (max < 0) {
                System.out.println("No");
                return;
            }

            if (min < 0) {
                min = 0;
            }
        }

        System.out.println(min == 0 ? "Yes" : "No");
    }
}
