import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        int []arr = new int[26];
        Arrays.fill(arr,-1);
        int ct = st.length();
        for(int i=0;i<ct;i++){
            int tem = st.charAt(i)-97;
            if(arr[tem]==-1){
                arr[tem] = i;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<26;i++){
            sb.append(arr[i]).append(" ");
        }
        System.out.println(sb);
    }

}