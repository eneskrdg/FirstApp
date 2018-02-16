import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {

		do {

			System.out.println("****Hesap Makinası****");
			System.out.println("Çarpma işlemi için 1 Seçiniz");
			System.out.println("Bölme işlemi için 2 Seçiniz");
			System.out.println("Toplama işlemi için 3 Seçiniz");
			System.out.println("Çıkarma işlemi için 4 Seçiniz");
			System.out.println("Çıkarma işlemi için 5 Seçiniz");

			Scanner scan = new Scanner(System.in);
			int read = scan.nextInt();
			if (read == 1 || read == 2 || read == 3 || read == 4 || read == 5) {
				if (read == 1) {
					System.out.println("Çarpma İşlemini Seçtiniz");
				} else if (read == 2) {
					System.out.println("Bölme İşlemini Seçtiniz");
				} else if (read == 3) {
					System.out.println("Toplama İşlemini Seçtiniz");
				} else if (read == 4) {
					System.out.println("Çıkarma İşlemini Seçtiniz");
				} else if (read == 5) {
					System.out.println("Çıkış Yaptınız.");
					System.exit(0);
				}

				System.out.println("İlk Sayıyı Giriniz");
				Scanner i = new Scanner(System.in);
				float m = i.nextFloat();
				System.out.println("İkinci Sayıyı Giriniz");
				Scanner j = new Scanner(System.in);
				float n = i.nextFloat();

				switch (read) {
				case 1:
					System.out.println("Çarpma İşleminizin Sonucu:" + (m * n));

					break;
				case 2:
					System.out.println("Bölme İşleminizin Sonucu:" + (m / n));

					break;
				case 3:
					System.out.println("Toplama İşleminizin Sonucu" + (m + n));

					break;
				case 4:
					System.out.println("Çıkarma İşleminizin Sonucu:" + (m - n));

					break;

				default:
					System.out.println("Yanlış bir değer girdiniz lütfen tekrar seçiniz.");
					break;
				}

			} else {
				System.out.println("Yanlış bir değer girdiniz lütfen tekrar seçiniz.");

			}

		} while (true);
	}

}
