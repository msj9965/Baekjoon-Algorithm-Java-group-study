import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n= Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            StringBuilder sb = new StringBuilder(br.readLine());
            boolean[] abc = new boolean[26];
            for(int j=0;j<sb.length();j++){
                abc[(int)sb.charAt(j)-65]=true;
            }
            int count =0;
            for(int j=0;j<26;j++){
                if(!abc[j]){
                    count= count +j+65;
                }
            }
            bw.write(count+"\n");



        }
        bw.close();
    }
}