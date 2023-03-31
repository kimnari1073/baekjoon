public class Main{
    public static void main(String[]args) throws Exception{
        int arrlen=read();
        int []arr = new int[arrlen];
        int count = read();
        for(int i=0;i<count;i++){
            int a = read();
            int b = read();
            int num = read();
            for(int k = a-1;k<b;k++){
                arr[k] = num;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arrlen;i++){
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
    private static int read() throws Exception{
        int c, n = System.in.read() & 15;
        while((c=System.in.read())>32){
            n = (n<<3) + (n<<1) + (c&15);
        }
        return n;
    }
}