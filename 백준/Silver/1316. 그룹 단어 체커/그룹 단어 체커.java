// 본인 작성 코드
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.io.BufferedReader;

// public class Main {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int num = Integer.parseInt(br.readLine());
//         boolean flag = true;
//         int resultCount = 0;

//         for (int i = 0; i < num; i++) {
//             char[] charArr = br.readLine().toCharArray();
//             int[] alpArr = new int[26];
//             char prv = '1';

//             for (char input : charArr) {
//                 if (prv == input) {
//                     continue;
//                 } else {
//                     prv = input;
//                     if (alpArr[input - 'a'] == 0) {
//                         alpArr[input - 'a']++;
//                     } else {
//                         flag = false;
//                         break;
//                     }
//                 }
//             }

//             if (flag) {
//                 resultCount++;
//             } else {
//                 flag = true;
//             }
//         }

//         System.out.print(resultCount);
//     }
// }


//GPT 4o 의 성능교정 수정본 코드
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int resultCount = 0;

        for (int i = 0; i < num; i++) {
            String word = br.readLine();
            boolean[] visited = new boolean[26]; // 알파벳 방문 기록
            boolean isGroupWord = true;

            char prevChar = word.charAt(0);
            visited[prevChar - 'a'] = true; // 첫 번째 문자 방문 기록

            for (int j = 1; j < word.length(); j++) {
                char currentChar = word.charAt(j);
                if (currentChar != prevChar) { // 이전 문자와 다를 경우만 처리
                    if (visited[currentChar - 'a']) { // 이미 방문한 문자라면 그룹 단어 아님
                        isGroupWord = false;
                        break;
                    }
                    visited[currentChar - 'a'] = true; // 방문 기록
                    prevChar = currentChar;
                }
            }

            if (isGroupWord) {
                resultCount++;
            }
        }

        System.out.println(resultCount);
    }
}
