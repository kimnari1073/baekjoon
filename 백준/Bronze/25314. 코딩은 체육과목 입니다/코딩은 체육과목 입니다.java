import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        StringBuilder bd = new StringBuilder();
        for(int i=0; i<input/4;i++){
            bd.append("long ");
        }
        bd.append("int");
        System.out.println(bd);
    }
}