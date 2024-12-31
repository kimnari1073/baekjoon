import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] sizeArr = br.readLine().split(" ");
        int row=Integer.parseInt(sizeArr[0]);
        int col=Integer.parseInt(sizeArr[1]);
        
        int size = row * col;
        int[] input = br.lines()
            .flatMap(line->Arrays.stream(line.split("\\s+")))
            .mapToInt(Integer::parseInt)
            .toArray();
        
        int[][] resultArr = new int[row][col];
        int count=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                resultArr[i][j] = input[count] +input[count+size];
                count++;
            }
  
        }
        
       StringBuilder sb = new StringBuilder();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sb.append(resultArr[i][j]);
                if(j<col-1){
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        
        System.out.print(sb.toString());
    }
}