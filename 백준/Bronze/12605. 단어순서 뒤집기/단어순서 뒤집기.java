import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[]ar)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=1;i<=n;i++){
            sb.append("Case #").append(i).append(": ");
            Stack<String>word = new Stack<>();
            String s = br.readLine();
            String[]arr= s.split(" ");
            for(int j =0;j<arr.length;j++){
                word.push(arr[j]);
            }
            for(int j =0;j<arr.length;j++) {
                sb.append(word.pop()).append(" ");
            }
            sb.append("\n");

        }
        bw.write(String.valueOf(sb));
        bw.close();
    }
}
