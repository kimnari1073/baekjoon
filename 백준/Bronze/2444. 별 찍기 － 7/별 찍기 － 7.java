import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int max = 2*n-1;
        int starCount = 0;
        for(int i=1;i<=n;i++){ //1 2 3 4 5
            starCount=i*2-1;
            System.out.print(" ".repeat((max-starCount)/2));
            System.out.println("*".repeat(starCount));
        }
        for(int i=n-1;i>=1;i--){ //4 3 2 1
            starCount=i*2-1;
            System.out.print(" ".repeat((max-starCount)/2));
            System.out.println("*".repeat(starCount));
        }
    }
}