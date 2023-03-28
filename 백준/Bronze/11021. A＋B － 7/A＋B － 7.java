import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk;
        StringBuilder sb = new StringBuilder();
        int a = Integer.parseInt(br.readLine());
        for(int i=0;i<a;i++){
            tk = new StringTokenizer(br.readLine());
            int sum = Integer.parseInt(tk.nextToken())+Integer.parseInt(tk.nextToken());
            sb.append("Case #").append(i+1).append(": ").append(sum).append("\n");

        }
        System.out.println(sb);
    }
}