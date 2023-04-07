import java.io.*;
import java.util.*;

public class Main {
    static int[][] map;
    static boolean[][] value;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int n, count;

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        value = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        List<Integer> counts = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && value[i][j]==false) {
                    count = 0;
                    dfs(i, j);
                    counts.add(count);
                }
            }
        }

        Collections.sort(counts);
        bw.write(String.valueOf(counts.size()));
        bw.write("\n");
        for (int i = 0; i < counts.size(); i++) {
            bw.write(String.valueOf(counts.get(i)));
            bw.write("\n");

        }
        bw.close();
    }

    public static void dfs(int x, int y) {
        value[x][y] = true;
        count++;

        for (int i = 0; i < 4; i++) {
            int loc_x = x + dx[i];
            int loc_y = y + dy[i];

            if (loc_x >= 0 && loc_x < n && loc_y >= 0 && loc_y < n) {
                if (map[loc_x][loc_y] == 1 && value[loc_x][loc_y]==false) {
                    dfs(loc_x, loc_y);
                }
            }
        }
    }
}