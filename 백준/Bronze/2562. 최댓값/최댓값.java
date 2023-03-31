public class Main{
    public static void main(String[]args)throws Exception{
        int p=0,max = 0;
        int tem=0;
        for(int i=1;i<=9;i++){
            tem = read();
            if(tem>max){
                p=i; max = tem;
            }
        }
        System.out.println(max);
        System.out.println(p);
    }
    private static int read()throws Exception{
        int c, n = System.in.read() & 15;
        while((c=System.in.read())>32){
            n = (n<<3) + (n<<1) + (c&15);
        }
        return n;
    }
}