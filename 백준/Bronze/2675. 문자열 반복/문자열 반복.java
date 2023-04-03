import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<inputNum;i++){
            StringTokenizer tk= new StringTokenizer(br.readLine());
            int n = Integer.parseInt(tk.nextToken());
            String str = tk.nextToken();
            for(int k=0; k<str.length();k++){
                for(int j=0;j<n;j++){
                    sb.append(str.charAt(k));
                }
            }
            if(i!=inputNum-1)
                sb.append("\n");
        }
        System.out.println(sb);
    }
}