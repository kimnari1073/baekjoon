import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[] inputArray = br.readLine().toCharArray();
        int result = 0;
        
        for(int index=0;index<inputArray.length;index++){
            if (index + 1 < inputArray.length) {
                if (inputArray[index] == 'c' && (inputArray[index + 1] == '=' || inputArray[index + 1] == '-')) {
                    index++;
                } else if (inputArray[index] == 'd') {
                    if (index + 2 < inputArray.length && inputArray[index + 1] == 'z' && inputArray[index + 2] == '=') {
                        index += 2;
                    } else if (inputArray[index + 1] == '-') {
                        index++;
                    }
                } else if (inputArray[index] == 'l' && inputArray[index + 1] == 'j') {
                    index++;
                } else if (inputArray[index] == 'n' && inputArray[index + 1] == 'j') {
                    index++;
                } else if (inputArray[index] == 's' && inputArray[index + 1] == '=') {
                    index++;
                } else if (inputArray[index] == 'z' && inputArray[index + 1] == '=') {
                    index++;
                }
            }
            result++;
        }
        System.out.print(result);
    }
}