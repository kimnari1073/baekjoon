import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        String reversed = new StringBuilder(input).reverse().toString();

        if(input.equals(reversed)){
            System.out.print("1");
        }else{
            System.out.print("0");
        }
        
    }
}