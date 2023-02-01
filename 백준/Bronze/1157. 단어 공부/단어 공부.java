import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s= br.readLine();
       s= s.toUpperCase();
        int[]n = new int[26];
        for(int i=0;i<s.length();i++){
            n[(int)s.charAt(i)-65]++;
        }
        int[]c = n.clone();
        Arrays.sort(c);
        if(c[c.length-1]==c[c.length-2]){
            bw.write("?");
        }
        else{
            int max=Integer.MIN_VALUE;
            int index=0;
            for(int i=0;i<n.length;i++){
                if(max<n[i]){
                    max=n[i];
                    index=i;
                }

            }
            bw.write((char)(index+65));
            


        }
        bw.close();
    }
}