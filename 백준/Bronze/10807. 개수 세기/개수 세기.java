import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []arr = new String[Integer.parseInt(br.readLine())];
        arr = br.readLine().split(" ");
        int count = 0;
        String num = br.readLine();
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(num)) count++;
        }
        System.out.println(count);
    }
}