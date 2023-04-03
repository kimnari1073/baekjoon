/**/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter print = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(input.readLine());
		
		for(int i = 0; i < T; i++) {
			String[] str = input.readLine().split(" ");
			int R = Integer.parseInt(str[0]);
			char[] ch = str[1].toCharArray();
			
			for(int j = 0; j < ch.length; j++) {
				for(int k = 0; k < R; k++) {
					print.write(ch[j]);
				}
			}
			print.write("\n");
		}
		
		print.flush();
	}

}