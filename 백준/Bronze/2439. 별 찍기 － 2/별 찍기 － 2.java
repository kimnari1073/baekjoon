import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i =1; i<=num;i++){
            for(int k=1; k<=num ; k++){
                if(num-i>=k) sb.append(" ");
                else sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}