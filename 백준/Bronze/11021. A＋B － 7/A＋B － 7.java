import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk;
        StringBuilder sb;
        int a = Integer.parseInt(br.readLine());
        for(int i=0;i<a;i++){
            tk = new StringTokenizer(br.readLine());
            int sum = Integer.parseInt(tk.nextToken())+Integer.parseInt(tk.nextToken());
            sb = new StringBuilder("Case #");
            sb.append(i+1);
            sb.append(": ");
            sb.append(sum);
            System.out.println(sb);
        }
    }
}