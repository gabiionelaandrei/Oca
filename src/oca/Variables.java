package oca;

public class Variables {

	public static void main(String[] args) {
		// max between 2 var
		int a = 12;
		int b = 100;
		System.out.println(Math.max(a, b));

		// int average
		int c = 10;
		int d = 12;
		int e = 33;
		System.out.println((c + d + e) / 3);

		// double average
		double f = 2.3;
		double g = 0.3;
		double h = 6;
		System.out.println((f + g + h) / 3);

		// vowel or not
		// first method
		char var1 = 'a';
		if (var1 == 'e' || var1 == 'i' || var1 == 'o' || var1 == 'u') {
			System.out.println(var1 + " is vowel");
		} else {
			System.out.println(var1 + " is consonant");
		}
		// second method
		char var2 = 'o';
		switch (var2) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(var2 + " is vowel");
			break;
		default:
			System.out.println(var2 + " is consonant");

		}

		// first divisible by the second
		int var3 = 9;
		int var4 = 2;

		if (var3 / var4 == 0) {
			System.out.println(var3 + "is divisible by " + var4);
		}

		else {
			System.out.println(var3 + " is not divisible by " + var4);
		}

		// max of sum
		int x = 2;
		int y = 50;
		int z = 8;
		int t = 20;
		int sum1 = Math.max(x, y) + Math.max(z, t);
		int sum2 = Math.max(x, z) + Math.max(y, t);
		int sum3 = Math.max(x, t) + Math.max(y, z);
		System.out.println(Math.max(sum1, Math.max(sum2, sum3)));
	}
	
}