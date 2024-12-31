//Chat GPT 성능 보완 코드
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 첫째 줄에서 N, M 읽기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        
        // 행렬 A 읽기
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 행렬 B 읽기
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 결과 행렬 C 출력 (A + B)
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sb.append(A[i][j] + B[i][j]).append(" ");
            }
            sb.append("\n");
        }
        
        // 출력
        System.out.print(sb.toString());
    }
}

//import java.io.IOException;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//
//public class Main{
//    public static void main(String[] args)throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        String[] sizeArr = br.readLine().split(" ");
//        int row=Integer.parseInt(sizeArr[0]);
//        int col=Integer.parseInt(sizeArr[1]);
//
//        int size = row * col;
//        int[] input = br.lines()
//                .flatMap(line->Arrays.stream(line.split("\\s+")))
//                .mapToInt(Integer::parseInt)
//                .toArray();
//
//        int[][] resultArr = new int[row][col];
//        int count=0;
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                resultArr[i][j] = input[count] +input[count+size];
//                count++;
//            }
//
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++){
//                sb.append(resultArr[i][j]);
//                if(j<col-1){
//                    sb.append(" ");
//                }
//            }
//            sb.append("\n");
//        }
//
//        System.out.print(sb.toString());
//    }
//}