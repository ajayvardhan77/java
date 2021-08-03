package strings;

public class Anagram {

	public static void main(String[] args) {
		String a = "aab";
		String b = "aba";
		boolean isanagram = false;
		boolean visited[] = new boolean[b.length()];
		if(a.length() == b.length()) {
			for(int i = 0 ; i < a.length() ; i++) {
				char c = a.charAt(i);
				isanagram = false;
				for(int j = 0 ; j < b.length(); j++) {
					if(b.charAt(j) == c && !visited[j]) {
						isanagram = true;
						visited[j] = true;
						break;
						}
					}if(!isanagram) {
						break;
						}
			 }
		}
		if(isanagram) {
			System.out.println("anagram");
		}else{
			System.out.println("not anagram");
		}
	}

}


