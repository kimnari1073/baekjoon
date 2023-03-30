public class Main{
    private static int read() throws Exception{
        int c,n = System.in.read() & 15;
        while((c=System.in.read())>32){
            n = (n<<3)+(n<<1)+(c&15);
        }
        return n;
    }
    public static void main(String[]args)throws Exception{
        int n = read();
        int x = read();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            int input=read();
            if(x>input) sb.append(input).append(" ");
        }
        System.out.print(sb);
    }
}