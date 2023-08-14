import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int N = 0, sayi = 0, max = 0, min = 0;
		Scanner inp = new Scanner(System.in);
		System.out.println("Kac Tane Sayi Gireceksiniz: ");
		N = inp.nextInt();

		for (int i = 1; i <= N; i++) {
			System.out.print(i + "-Sayiyi Giriniz: ");
			sayi = inp.nextInt();
			if (sayi > max) {
				max = sayi;
			}
			if (sayi < min) {
				min = sayi;
			}
		}
		System.out.println("En Buyuk Sayi: " + max);
		System.out.println("En Kucuk Sayi: " + min);
	}
}

