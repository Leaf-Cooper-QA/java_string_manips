package stringManipulation;

public class Exercise1 {
	public static void main(String[] args) {
		part1();
	}

	private static void part1() {
		// TODO Auto-generated method stub
		String string1 = "Yesterday it was raining";
		String string2 = "Today it is sunny";
		String concat = string2 + ", " + string1;
		System.out.println(concat.toUpperCase());
		String part2 = string2.substring(0,11) + string1.substring(16);
		System.out.println(part2.toUpperCase());
	}

}
