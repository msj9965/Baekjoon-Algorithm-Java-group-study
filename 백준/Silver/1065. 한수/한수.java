import java.io.*;

public class Main {
    public static void main(String[] ar) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        boolean[] su = new boolean[N + 1];
        int count =0;
        for(int i=1;i<=N;i++){
           su[i]= han(i);
            if(su[i]){
                count++;

            }
        }
        bw.write(String.valueOf(count));
        bw.close();


    }

    public static boolean han(int num) {

        if (num / 10 == 0) {
            return true;
        }else if(num/100==0){
            return true;
        }else if(num==1000){
            return false;
        }
        else{
            int k=1;
            int n1 = (num/k)%10;
            int n2= (num/(k*10))%10;
            int n3 =(num/(k*100))%10;
            if((n2-n1)==(n3-n2)){
                return true;
            }
            else {
                return false;}

        }

    }
}
