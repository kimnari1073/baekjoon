public class Main{
    private static int read() throws Exception{

        int c,n;
        if((n=System.in.read())==45) {
            return read()*-1;
        }
        else{
            n = n & 15;
            while((c=System.in.read())>32)
                n = (n<<3)+(n<<1)+(c&15);
        }
        return n;
    }
    public static void main(String[]args)throws Exception{
        int n = read();
        int min,max;
        min = max = read();
        for(int i=0;i<n-1;i++){
            int num = read();
            if(min>num) min = num;
            else if(max<num) max = num;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(min).append(" ").append(max);
        System.out.print(sb);
    }
}