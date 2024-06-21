package leetcode_practice;

public class leetcode {

	public static void main(String[] args) {

//		9.Palindrome Number

		int num = 121, rem, reverse = 0, temp;

		temp = num;
		while (temp != 0) {
			rem = temp % 10;
			reverse = reverse * 10 + rem;
			temp = temp / 10;
		}

		if (num == reverse)
			System.out.println(num + " is palindrome");

		else
			System.out.println(num + " is not a palindrome");

	}

}
