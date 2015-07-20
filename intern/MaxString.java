package intern2;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxString {

	public static void main(String[] args) {
		System.out.println("Enter stings('Y' as end):");
		ArrayList<String> strings = new ArrayList<String>();
		while(true){
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			if (line.equals("Y"))
				break;
			strings.add(line);
		}
		System.out.println(strings);
		String max = findMaxString(strings);
		System.out.println(max);
		
	}

	private static String findMaxString(ArrayList<String> strings) {
		String max = null;
		ArrayList<String> candidates = new ArrayList<String>();
		for(String x: strings){
			candidates.add(getMaxString(x));
		}
		for(String candidate : candidates){
			if(max == null){
				max = candidate;
			}
			else{
				if(candidate.length()>max.length()){
					max = candidate;
				}
				else if(candidate.length() == max.length() &&
						candidate.charAt(0) < max.charAt(0)){
					max = candidate;
				}
			}
		}
		
		return max;
	}

	private static String getMaxString(String x) {
		for(int i=x.length(); i>=0; i--){
			String max = null;
			for(int j=0; j<=x.length() - i; j++){
				String s = x.substring(j, j+i);
				if (isSame(s)){
					if (max == null){
						max = s;
					}
					else{
						if (s.charAt(0) < max.charAt(0)){
							max = s;
						}
					}
				}
			}
			if (max != null){
				return max;
			}
		}
		return null;
	}

	private static boolean isSame(String s) {
		char x = s.charAt(0);
		for(char c : s.toCharArray()){
			if (x != c)
				return false;
		}
		return true;
	}

}
