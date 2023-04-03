import java.io.IOException;
public class Main{
    public static void main(String[]args)throws IOException{
        int ct = read();
        int sum=0;
        for(int i=0;i<ct;i++){
            sum += System.in.read() -'0';
        }
        System.out.println(sum);
    }
    private static int read()throws IOException{
        int c, n= System.in.read() & 15;
        while((c=System.in.read())>32){
            n = (n<<3) + (n<<1) + (c&15);
        }
        return n;
    }
}