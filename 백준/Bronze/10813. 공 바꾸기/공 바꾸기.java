import java.util.Arrays;

public class Main{
    public static void main(String[]args)throws Exception{
        int index = read();
        int []arr = new int[index];
        Arrays.setAll(arr, i->i+1);
        int ct = read();
        for(int i=0;i<ct;i++){
            int a = read()-1;
            int b = read()-1;
            int tem = arr[a];
            arr[a] = arr[b];
            arr[b] = tem;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<index;i++){
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
    private static int read()throws Exception{
        int c, n = System.in.read()&15;
        while((c=System.in.read())>32){
            n = (n<<3)+(n<<1)+(c&15);
        }
        return n;
    }
}