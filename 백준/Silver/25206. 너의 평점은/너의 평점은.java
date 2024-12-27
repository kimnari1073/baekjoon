import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //(학점 x 평점)의 합
        double weightedScoreSum = 0;
        //학점의 합
        double totalCredits=0;
        
        outer:
        for(int i=0;i<20;i++){
            String[] input = br.readLine().split(" ");
 
            //평점 계산
            double score = 0.0;
            switch (input[2]){
                case "A+" -> score = 4.5;
                case "A0" -> score = 4.0;
                case "B+" -> score = 3.5;
                case "B0" -> score = 3.0;
                case "C+" -> score = 2.5;
                case "C0" -> score = 2.0;
                case "D+" -> score = 1.5;
                case "D0" -> score = 1.0;
                case "F" -> score = 0.0;
                case "P" -> {
                    continue outer;
                }
            };
            weightedScoreSum += score * Double.parseDouble(input[1]);
            totalCredits+= Double.parseDouble(input[1]);
        }
        
        double result =weightedScoreSum /totalCredits;
        System.out.print(result);
    }
}