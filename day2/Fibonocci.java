package week1.day2;

public class Fibonocci {
public static void main(String[] args) {
	int a=0;
	int b=1;
	int n=8;
	for (int i=0; a<=n; i++) {
		System.out.println(a + "");
		int sum=a+b;
		a=b;
		b=sum;
	}
}
}
