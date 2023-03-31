import java.util.Arrays;
import java.util.LinkedHashSet;
public class Main{
    public static void main(String[]args)throws Exception{
        Integer []arr=new Integer[10];
        for(int i=0;i<10;i++){
            int n = read();
            arr[i] = n%42;
        }
        LinkedHashSet<Integer> hash = new LinkedHashSet<>(Arrays.asList(arr));
        arr = hash.toArray(new Integer[0]);
        System.out.println(arr.length);
    }
    private static int read()throws Exception{
        int c,n = System.in.read()&15;
        while ((c=System.in.read())>32){
            n = (n<<3)+(n<<1)+(c&15);
        }
        return n;
    }
}