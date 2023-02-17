import java.io.*;

public class Main {
    public static int count,n;
    public static void main(String[] ar )throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int case_num = Integer.parseInt(br.readLine());
        for(int k = 0;k<case_num;k++){
            n = Integer.parseInt(br.readLine());
            count=0;
            add(0);
            bw.append(String.valueOf(count)).append("\n");
        }
        bw.flush();
        bw.close();
    }
    public static void add(int num){

            
            if(num==n){
                count++;
            }
            else if(num<n){
                if(num+1<=n){
                    add(num+1);
                }
                if(num+2<=n){
                    add(num+2);
                }
                if(num+3<=n){
                    add(num+3);
                }
            }

        }
    }

