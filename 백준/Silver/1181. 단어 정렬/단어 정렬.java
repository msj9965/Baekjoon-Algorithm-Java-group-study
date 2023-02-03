import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb=new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] w= new String[n];
        for(int i =0;i<n;i++){
            w[i]=br.readLine();
        }
        Arrays.sort(w, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()==o2.length()){
                    return o1.compareTo(o2);
                }
                else{
                    return o1.length()-o2.length();
                }
            }
        });
        sb.append(w[0]).append("\n");
        for(int i=1;i<n;i++){
            if(!w[i].equals(w[i-1])){
                sb.append(w[i]).append("\n");
            }
        }
        bw.write(String.valueOf(sb));
        bw.close();


    }
}