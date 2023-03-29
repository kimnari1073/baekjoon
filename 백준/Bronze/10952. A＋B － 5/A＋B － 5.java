import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String []tem = br.readLine().split(" ");
            int sum = Integer.parseInt(tem[0])+Integer.parseInt(tem[1]);
            if(sum == 0) break;
            else sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}