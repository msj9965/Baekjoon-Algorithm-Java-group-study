import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int N;
    private static int count;
    private static int[] col;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        count = 0;
        col = new int[N + 1];

        queens(1);
        System.out.println(count);
    }

    private static void queens(int row) {
        if (row > N) {
            count++;
        } else {
            for (int i = 1; i <= N; i++) {
                col[row] = i;
                if (isPossible(row)) {
                    queens(row + 1);
                }
            }
        }
    }

    private static boolean isPossible(int row) {
        for (int i = 1; i < row; i++) {
            if (col[i] == col[row] || Math.abs(col[i] - col[row]) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }
}
