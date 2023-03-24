
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk;
        int total = Integer.parseInt(br.readLine());
        int ct = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i=0; i<ct; i++){
            tk = new StringTokenizer(br.readLine());
            sum += Integer.parseInt(tk.nextToken()) * Integer.parseInt(tk.nextToken());
        }
        if(total == sum) System.out.println("Yes");
        else System.out.println("No");
    }
}