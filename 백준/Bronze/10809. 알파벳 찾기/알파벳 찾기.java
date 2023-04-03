import java.io.IOException;
import java.util.Arrays;
public class Main{
    public static void main(String[]args)throws IOException{
        int num;
        int []arr = new int[26];
        Arrays.fill(arr,-1);
        int ct = 0;
        while((num = System.in.read())!=10){
            if(arr[num-97]==-1) arr[num-97] = ct;
            ct++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++){
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }
}