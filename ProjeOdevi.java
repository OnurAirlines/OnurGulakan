import java.security.SecureRandom;
import java.util.Scanner;

public class ProjeOdevi {
    private static final String Karakterler = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnoprstuvwxyzq0123456789!@#$%^&*()_+";
    private static SecureRandom random = new SecureRandom();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Şifre Üret");
            System.out.println("2. Çıkış Yap");
            System.out.print("Seçiminizi yapın (1/2): ");

            String giris = scanner.nextLine();
            if ("1".equals(giris)) {
                System.out.println("Üretilen Şifre: " + SifreUret());
            } else if ("2".equals(giris)) {
                System.out.println("Programdan çıkılıyor.");
                break;
            } else {
                System.out.println("Geçersiz giriş, lütfen 1 veya 2'yi seçiniz.");
            }
        }
        scanner.close();
    }

    public static String SifreUret() {
        int sifreuzunlugu = 12 + random.nextInt(13); // Şifre uzunluğunu 12 ile 24 karakter arasında rastgele seç
        StringBuilder sb = new StringBuilder(sifreuzunlugu);
        for (int i = 0; i < sifreuzunlugu; i++) {
            int randomIndex= random.nextInt(Karakterler.length());
            sb.append(Karakterler.charAt(randomIndex));
        }
        return sb.toString();
    }
}