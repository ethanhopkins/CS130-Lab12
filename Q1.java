package Lab12;

public class Q1 {
	public static void main(String[] args) {
	int[] numbers = new int[11];
		numbers[0] = 0;
		numbers[1] = 1;
		numbers[2] = 2;
		numbers[3] = 3;
		numbers[4] = 4;
		numbers[5] = 5;
		numbers[6] = 6;
		numbers[7] = 7;
		numbers[8] = 8;
		numbers[9] = 9;
		numbers[10] = 10;
		
	System.out.println("We are checking even and odd numbers for a range 0 to 10");
	for (int i = 0; i < numbers.length; i++) {
		if (numbers[i] % 2 == 0) {
			System.out.println("Even: " + numbers[i]);
		} else {
			System.out.println("Odd: " + numbers[i]);
		}
	}
}
}