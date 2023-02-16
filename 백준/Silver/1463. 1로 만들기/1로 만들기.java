import java.io.*;

public class Main {
    public static int count,min;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine());
        min =Integer.MAX_VALUE;
        count=0;
        make_one(x);
        bw.write(String.valueOf(min));
        bw.close();
    }
    public static void make_one(int x ){
        if(x==1){
            int num=minVal(min,count);
            min=num;

        }
        else{
            if(count<min) {

                if (x % 3 == 0) {
                    count++;
                    make_one(x / 3);
                    count--;
                }
                if (x % 2 == 0) {
                    count++;
                    make_one(x / 2);
                    count--;

                }
                if (true) {
                    count++;
                    make_one(x - 1);
                    count--;

                }
            }
        }

    }
    public static int minVal(int n1, int n2){
        if(n1>n2){
            return n2;
        }
        else{
            return n1;
        }
    }
}