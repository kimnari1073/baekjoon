import java.util.Arrays;

public class Main{
    public static void main(String[]args)throws Exception{
        int arr[] = new int[30];
        Arrays.setAll(arr, i->i+1);
        for(int i=0;i<28;i++){
            int n = read();
            arr[n-1] = 0;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<30;i++){
            if(arr[i]!=0){
                sb.append(arr[i]).append("\n");
            }
        }
        System.out.println(sb);
        
    }
    private static int read()throws Exception{
        int c,n = System.in.read()&15;
        while((c=System.in.read())>32){
            n = (n<<3)+(n<<1)+(c&15);
        }
        return n;
    }
}