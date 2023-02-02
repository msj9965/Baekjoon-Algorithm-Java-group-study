import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String []arg)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer>stick = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        for(int i =0;i<n;i++){
            stick.push(Integer.parseInt(br.readLine()));

        }
        int standard = stick.peek();
        stick.pop();
        int count =1;
        int pull;
        for(int i=0;i<n-1;i++){
            pull=stick.peek();
            stick.pop();
            if(pull>standard){
                standard=pull;
                count++;

            }
        }
        bw.write(String.valueOf(count));
        bw.close();

    }
}
