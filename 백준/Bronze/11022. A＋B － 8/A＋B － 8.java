import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=num;i++){
            String []tem =br.readLine().split(" ");
            int A = Integer.parseInt(tem[0]);
            int B = Integer.parseInt(tem[1]);
            sb.append("Case #").append(i).append(": ").append(A).append(" + ").append(B).append(" = ").append(A+B).append("\n");
        }
        System.out.println(sb);
    }
}