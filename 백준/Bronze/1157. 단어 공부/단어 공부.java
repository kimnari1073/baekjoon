import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //대문자
        String input = br.readLine().toUpperCase();
        
        int[] alphabet= new int[26];
        //for
        for(int i=0;i<input.length();i++){
            int index = ((int)input.charAt(i)) -65;
            alphabet[index]++;
        }
        
        //find max
        int max = 0;
        int index = 0;
        boolean flag = false;
        for(int i=0;i<alphabet.length;i++){
            if(max<alphabet[i]){
                max=alphabet[i];
                index = i;
                flag=false;
            }else if(max!=0 && max==alphabet[i]){
                flag = true;
            }
      
        }
        
        //print
        if(flag){
            System.out.print("?");
        }
        else{
            System.out.print((char)(index+65));
        }
        
    }
}