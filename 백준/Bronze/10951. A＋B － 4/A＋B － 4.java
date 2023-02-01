import java.io.*;
import java.lang.StringBuilder;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;



public class Main {

    public static void main (String [] ar) throws IOException, NoSuchElementException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb =new StringBuilder();
        StringTokenizer st;
        int num1;
        int num2;
        String s;
        while((s=br.readLine())!=null){

            st= new StringTokenizer(s, " ");

                num1 = Integer.parseInt(st.nextToken());
                num2 = Integer.parseInt(st.nextToken());


                sb.append(num1+num2).append("\n");


        }

        bw.write(sb.toString());


        bw.close();
    }
}