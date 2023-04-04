import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[]args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str.equals(" ")) System.out.println(0);
        else{
            String[] arr = str.trim().split("\\s+");
            System.out.println(arr.length);
        }
    }
}