public class Main{
    public static void main(String[]args)throws Exception{
        int index = read();
        double []arr = new double[index];
        int max = 0;
        double sum = 0.0;
        for(int i=0;i<index;i++){
            arr[i] = read();
            if(max < arr[i]) max = (int)arr[i];
            sum += arr[i];
        }
        System.out.println(sum/max/index*100);
    }
    private static int read()throws Exception{
        int c,n = System.in.read()&15;
        while((c=System.in.read())>32){
            n = (n<<3)+(n<<1)+(c&15);
        }
        return n;
    }
}