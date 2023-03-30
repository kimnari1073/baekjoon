import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main{
        private static int read() throws IOException{
        int c,n = System.in.read() & 15;
        while((c= System.in.read())>32)
            n = (n <<3) + (n<<1) + (c&15);
        if(c==13) System.in.read();
        return n;
    }
    public static void main(String[]args) throws IOException{
        int []arr = new int[read()];
        for(int i=0;i<arr.length;i++){
            arr[i] = read();
        }
        int count = 0;
        int num = read();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num) count++;
        }
        System.out.println(count);
    }
}