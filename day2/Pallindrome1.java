package week1.day2;

public class Pallindrome1 {


	public static void main(String[] args) {

		int output = 0;
		int input = 121;
		for(int i=input ; i > 0; i=i/10) {
			output = output*10 + i%10;
		}

		if(output == input) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}

	}

}