import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] sizeArr = br.readLine().split(" ");
        int sizeA=Integer.parseInt(sizeArr[0]);
        int sizeB=Integer.parseInt(sizeArr[1]);
        
        int[][] arrA = new int[sizeA][sizeB];
        int[][] arrB = new int[sizeA][sizeB];
        
        
        for(int i=0;i<sizeA;i++){
            String[] arr_String = br.readLine().split(" ");
            for(int j=0;j<sizeB;j++){
                arrA[i][j] = Integer.parseInt(arr_String[j]);
            }
        }
        for(int i=0;i<sizeA;i++){
            String[] arr_String = br.readLine().split(" ");
            for(int j=0;j<sizeB;j++){
                arrB[i][j] = Integer.parseInt(arr_String[j]);
            }
        }
        
        int[][] resultArr = new int[sizeA][sizeB];
        for(int i=0;i<sizeA;i++){
            for(int j=0;j<sizeB;j++){
                resultArr[i][j]= arrA[i][j] + arrB[i][j];
            }
        }
        
        for(int i=0;i<sizeA;i++){
            for(int j=0;j<sizeB;j++){
                System.out.print(resultArr[i][j]);
                if(j+1==sizeB){
                    System.out.print("\n");
                }else{
                    System.out.print(" ");
                }
                
            }
        }
        
        
        

    }
}