package stringManipulation;

public class Exercise2 {
	public static void main(String[] args) {
		method1("What a wonderful day");
		method2("What a wonderful day");
		method3("What a wonderful day");
		method4("What a wonderful day", "rful d");
		method4("What a wonderful day", "rfal d");
	}

	private static void method4(String string, String string2) {
		// TODO Auto-generated method stub
		System.out.println(string.contains(string2));
	}

	private static void method3(String string) {
		// TODO Auto-generated method stub
		int j = string.length();
		for(int i = j-1 ; i > 0; i--) {
			if (string.substring(i,j).contains(" ")) {
				System.out.println(string.substring(i+1,j));
				j=i;
			}
		}
		System.out.println(string.substring(0,j));
	}

	private static void method2(String string) {
		// TODO Auto-generated method stub
		int j = 0;
		for(int i = 1 ; i < string.length(); i++) {
			if (string.substring(j,i).contains(" ")) {
				System.out.println(string.substring(j,i));
				j=i;
			}
		}
		System.out.println(string.substring(j));
	}

	private static void method1(String string) {
		// TODO Auto-generated method stub
		int wordcount = 1;
		for(int i = 0 ; i < string.length(); i++) {
			if (string.charAt(i) == ' ') {
				wordcount++;
			}
		}
		System.out.println(wordcount);
		
	}

}
