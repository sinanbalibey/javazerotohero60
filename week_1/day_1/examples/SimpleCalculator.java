import java.util.Scanner;

/**
 * Basit Hesap Makinesi Uygulaması
 * Bu program kullanıcıdan iki sayı ve bir işlem alıp sonucu hesaplar.
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        // Scanner nesnesi oluşturma (kullanıcıdan girdi almak için)
        Scanner scanner = new Scanner(System.in);
        
        // Kullanıcıdan ilk sayıyı alma
        System.out.print("İlk sayıyı girin: ");
        double number1 = scanner.nextDouble();
        
        // Kullanıcıdan ikinci sayıyı alma
        System.out.print("İkinci sayıyı girin: ");
        double number2 = scanner.nextDouble();
        
        // Kullanıcıdan işlem seçimini alma
        System.out.println("Yapmak istediğiniz işlemi seçin:");
        System.out.println("1 - Toplama");
        System.out.println("2 - Çıkarma");
        System.out.println("3 - Çarpma");
        System.out.println("4 - Bölme");
        System.out.print("Seçiminiz (1-4): ");
        int choice = scanner.nextInt();
        
        // Seçilen işleme göre hesaplama yapma
        double result = 0;
        boolean isValidOperation = true;
        String operation = "";
        
        switch (choice) {
            case 1: // Toplama
                result = number1 + number2;
                operation = "+";
                break;
            case 2: // Çıkarma
                result = number1 - number2;
                operation = "-";
                break;
            case 3: // Çarpma
                result = number1 * number2;
                operation = "*";
                break;
            case 4: // Bölme
                // Bölme işleminde 0'a bölme kontrolü
                if (number2 != 0) {
                    result = number1 / number2;
                    operation = "/";
                } else {
                    System.out.println("Hata: Sıfıra bölme işlemi yapılamaz!");
                    isValidOperation = false;
                }
                break;
            default: // Geçersiz seçim
                System.out.println("Hata: Geçersiz işlem seçimi!");
                isValidOperation = false;
        }
        
        // Sonucu ekrana yazdırma
        if (isValidOperation) {
            System.out.println("\nİşlem: " + number1 + " " + operation + " " + number2);
            System.out.println("Sonuç: " + result);
            
            // Sonucun tam sayı olup olmadığını kontrol etme
            if (result == (int) result) {
                System.out.println("Sonuç bir tam sayıdır: " + (int) result);
            } else {
                System.out.println("Sonuç bir ondalıklı sayıdır.");
            }
        }
        
        // Scanner'ı kapatma
        scanner.close();
    }
} 