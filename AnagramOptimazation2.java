package strings;

public class AnagramOptimazation2 {

	public static void main(String[] args) {
		String a = "aikijgpap234#@";
		String b = "kiaijgpap243@#";
		boolean isanagram = true;
		int al[] = new int[256];
		for (char c : a.toCharArray()) {
			int index = (int) c;
			al[index]++; 
			}
		for(char c : b.toCharArray()) {
			int index = (int) c;
			al[index]--;
		}
		for(int i = 0 ; i < 256 ; i++) {
			if(al[i] != 0) {
				isanagram = false;
				break;
			}
		}
		if(isanagram) {
			System.out.println("anagram");
		}else {
			System.out.println("not anagram");
		}
		
	}

}
