/**
 * Java String Sınıfı ve Metodları Örneği
 * Bu program Java'daki String sınıfını ve temel metotlarını gösterir.
 */
public class StringExamples {
    public static void main(String[] args) {
        // String tanımlama yöntemleri
        System.out.println("--- String Tanimlama ---");
        
        String str1 = "Merhaba"; // String literal
        String str2 = new String("Dunya"); // String nesnesi oluşturma
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        
        // String birleştirme
        System.out.println("\n--- String Birlestirme ---");
        
        // 1. + operatörü ile
        String fullText = str1 + " " + str2;
        System.out.println("+ operatoru ile: " + fullText);
        
        // 2. concat() metodu ile
        String fullText2 = str1.concat(" ").concat(str2);
        System.out.println("concat() metodu ile: " + fullText2);
        
        // String uzunluğu
        System.out.println("\n--- String Uzunlugu ---");
        System.out.println("'" + fullText + "' metninin uzunlugu: " + fullText.length() + " karakter");
        
        // String metodları
        System.out.println("\n--- String Metodlari ---");
        
        // Büyük/küçük harf dönüşümleri
        System.out.println("Buyuk harfe donusturme: " + fullText.toUpperCase());
        System.out.println("Kucuk harfe donusturme: " + fullText.toLowerCase());
        
        // Karakter ve alt string bulma
        System.out.println("\n--- Karakter ve Alt String Islemleri ---");
        
        // İndex bulma
        int index = fullText.indexOf("Dunya");
        System.out.println("'Dunya' kelimesinin indeksi: " + index);
        
        // Belirli bir indeksteki karakteri bulma
        char character = fullText.charAt(0);
        System.out.println("0. indeksteki karakter: " + character);
        
        // Alt string (substring)
        String subString = fullText.substring(8); // 8. indeksten sonuna kadar
        System.out.println("8. indeksten sonrasi: " + subString);
        
        String subString2 = fullText.substring(0, 7); // 0'dan 7'ye kadar (7 dahil değil)
        System.out.println("0-7 arasi: " + subString2); 
        
        // String karşılaştırma
        System.out.println("\n--- String Karismasima ---");
        
        String text1 = "Java";
        String text2 = "Java";
        String text3 = new String("Java");
        
        // == operatörü (referans karşılaştırma)
        System.out.println("text1 == text2: " + (text1 == text2)); // true (aynı nesneyi gösterirler)
        System.out.println("text1 == text3: " + (text1 == text3)); // false (farklı nesneler)
        
        // equals() metodu (içerik karşılaştırma)
        System.out.println("text1.equals(text2): " + text1.equals(text2)); // true
        System.out.println("text1.equals(text3): " + text1.equals(text3)); // true (içerik aynı)
        
        // Boşluk temizleme
        System.out.println("\n--- Bosluk Temizleme ---");
        
        String textWithSpaces = "   Java Programlama   ";
        System.out.println("Orijinal: '" + textWithSpaces + "'");
        System.out.println("trim() ile: '" + textWithSpaces.trim() + "'");
        
        // String değiştirme (replace)
        System.out.println("\n--- String Degistirme ---");
        
        String originalText = "Java programlama dili";
        String replacedText = originalText.replace("Java", "Python");
        
        System.out.println("Orijinal metin: " + originalText);
        System.out.println("Degistirilmis metin: " + replacedText);
        
        // String bölme (split)
        System.out.println("\n--- String Bolme ---");
        
        String sentence = "Java,Python,C++,JavaScript";
        String[] languages = sentence.split(",");
        
        System.out.println("Bolunmus string:");
        for (int i = 0; i < languages.length; i++) {
            System.out.println((i+1) + ". " + languages[i]);
        }
        
        // String'in boş olup olmadığını kontrol etme
        System.out.println("\n--- Bos String Kontrolu ---");
        
        String emptyString = "";
        String nullString = null;
        
        System.out.println("emptyString.isEmpty(): " + emptyString.isEmpty()); // true
        
        // Not: nullString üzerinde metot çağırmak NullPointerException hatası verir
        // System.out.println(nullString.isEmpty()); // NullPointerException!
        
        // Güvenli null kontrolü
        System.out.println("nullString == null: " + (nullString == null)); // true
    }
} 