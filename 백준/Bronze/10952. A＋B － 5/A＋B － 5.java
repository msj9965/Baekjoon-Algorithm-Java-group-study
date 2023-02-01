import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main {
    public static void main (String [] ar) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        ArrayList <Integer>result= new ArrayList<Integer>();
        int num1=0;
        int num2=0;

        while(true){
        st= new StringTokenizer(br.readLine());
        num1= Integer.parseInt(st.nextToken());
        num2= Integer.parseInt(st.nextToken());

        if(num1==0&&num2==0){
            break;
        }else{
            result.add(num1+num2);
        }


        }
        for(int i=0;i<result.size();i++){
            bw.write(result.get(i)+"\n");
        }
        bw.flush();


        bw.close();
    }
}