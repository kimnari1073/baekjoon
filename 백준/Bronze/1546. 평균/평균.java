import java.util.Arrays;
public class Main{
    public static void main(String[]args)throws Exception{
        int index = read();
        double []arr = new double[index];
        for(int i=0;i<index;i++){
            arr[i] = read();
        }
        Arrays.sort(arr);
        double avg =0.0;
        for(int i=0;i<index;i++){
            avg += (arr[i]/arr[index-1]*100)/index;
        }
        System.out.println(avg);
    }
    private static int read()throws Exception{
        int c,n = System.in.read()&15;
        while((c=System.in.read())>32){
            n = (n<<3)+(n<<1)+(c&15);
        }
        return n;
    }
}