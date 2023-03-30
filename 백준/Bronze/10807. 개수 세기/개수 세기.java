import java.io.IOException;

public class Main{
        private static int read() throws IOException{
        int c,n = System.in.read() & 15;
        while((c= System.in.read())>32)
            n = (n <<3) + (n<<1) + (c&15);
        if(c==13) System.in.read();
        return n;
    }
    public static void main(String[]args) throws IOException{
        int n = read();
        int []arr = new int[n];
        int count = 0;

        for(int i=0;i<n;i++){
            arr[i] = read();
        }
        int num = read();
        for(int i=0;i<n;i++){
            if(arr[i]==num) count++;
        }
        System.out.println(count);
    }
}