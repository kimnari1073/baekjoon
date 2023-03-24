import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tk;
        int ct = Integer.parseInt(br.readLine());
        int sum;
        for(int i=0; i<ct;i++){
            tk = new StringTokenizer(br.readLine());
            sum = Integer.parseInt(tk.nextToken())+Integer.parseInt(tk.nextToken());
            bw.write(sum+"\n");
        }
        bw.close();
    }
}