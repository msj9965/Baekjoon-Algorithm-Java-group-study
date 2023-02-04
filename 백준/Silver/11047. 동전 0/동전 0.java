import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n =Integer.parseInt(st.nextToken());
        int k =Integer.parseInt(st.nextToken());
        Stack<Integer> stack =new Stack<>();
        for(int i=0;i<n;i++){
            stack.push(Integer.parseInt(br.readLine()));

        }
        int value=0;
        int num;
        for(int i =0;i<n;i++){
            num=stack.pop();
            if(k/num!=0){
                value = value+ k/num;
                if(k%num==0){
                    break;

                }
                else{
                    k=k%num;
                }
            }
        }
        bw.write(String.valueOf(value));
        bw.close();
    }
}