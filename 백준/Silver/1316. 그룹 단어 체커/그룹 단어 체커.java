import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num= Integer.parseInt(br.readLine());
        boolean flag = true;
        int resultCount=0;
        for(int i=0;i<num;i++){
            char[] charArr = br.readLine().toCharArray(); //첫번째 문자열
            int[] alpArr = new int[26];
            char prv='1';
            
            for(char input : charArr){
                if(prv==input){
                    continue;
                }else{
                    prv=input;
                    if(alpArr[input-'a']==0){
                        alpArr[input-'a']++;
                    }else{
                        flag=false;
                        break;
                    }
                }
            }
            
            if(flag){
                resultCount++;
            }else{
                flag=true;
            }
        }
        
        System.out.print(resultCount);
    }
}