import java.io.*;
public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = new String(br.readLine());
        int ct = Integer.parseInt(br.readLine());
        System.out.println(st.substring(ct-1,ct));
    }
}