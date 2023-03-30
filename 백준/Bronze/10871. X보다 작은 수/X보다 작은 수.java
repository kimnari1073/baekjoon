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
        int []arr = new int[n];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            arr[i] = read();
            if(x>arr[i]) sb.append(arr[i]).append(" ");
        }
        System.out.print(sb);
    }
}