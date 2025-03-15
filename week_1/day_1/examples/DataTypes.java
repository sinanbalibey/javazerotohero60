/**
 * Java Veri Tipleri ve Tip Dönüşümleri Örneği
 * Bu program Java'daki temel veri tiplerini ve aralarındaki dönüşümleri gösterir.
 */
public class DataTypes {
    public static void main(String[] args) {
        // İlkel (Primitive) Veri Tipleri
        System.out.println("--- Ilkel Veri Tipleri ---");
        
        // Tam sayı tipleri
        byte myByte = 127;                 // 8-bit
        short myShort = 32767;             // 16-bit
        int myInt = 2147483647;            // 32-bit
        long myLong = 9223372036854775807L; // 64-bit, L harfi long olduğunu belirtir
        
        System.out.println("byte degeri: " + myByte);
        System.out.println("short degeri: " + myShort);
        System.out.println("int degeri: " + myInt);
        System.out.println("long degeri: " + myLong);
        
        // Ondalıklı sayı tipleri
        float myFloat = 3.14f;  // 32-bit, f harfi float olduğunu belirtir
        double myDouble = 3.14159265359d;  // 64-bit, d harfi opsiyoneldir
        
        System.out.println("float degeri: " + myFloat);
        System.out.println("double degeri: " + myDouble);
        
        // Karakter ve boolean tipleri
        char myChar = 'A';      // 16-bit Unicode karakter
        boolean myBool = true;  // true veya false
        
        System.out.println("char degeri: " + myChar);
        System.out.println("boolean degeri: " + myBool);
        
        // -------------------------
        // Tip Dönüşümleri (Casting)
        System.out.println("\n--- Tip Donusumleri ---");
        
        // Otomatik Dönüşüm (Widening Casting)
        System.out.println("Otomatik Donusum:");
        int number = 100;
        long longNumber = number;  // int'den long'a otomatik dönüşüm
        float floatNumber = longNumber;  // long'dan float'a otomatik dönüşüm
        
        System.out.println("int degeri: " + number);
        System.out.println("long degeri: " + longNumber);
        System.out.println("float degeri: " + floatNumber);
        
        // Manuel Dönüşüm (Narrowing Casting)
        System.out.println("\nManuel Donusum:");
        double doubleNumber = 9.78;
        int intNumber = (int) doubleNumber;  // double'dan int'e manuel dönüşüm
        
        System.out.println("double degeri: " + doubleNumber);
        System.out.println("int degeri: " + intNumber); // Ondalık kısım kaybedilir
        
        // String ve Sayı Dönüşümleri
        System.out.println("\nString ve Sayi Donusumleri:");
        String numberStr = "123";
        int parsedInt = Integer.parseInt(numberStr); // String'den int'e dönüşüm
        
        System.out.println("String degeri: " + numberStr);
        System.out.println("Parse edilmis int degeri: " + parsedInt);
        
        int backToString = 456;
        String strFromInt = String.valueOf(backToString); // int'den String'e dönüşüm
        
        System.out.println("int degeri: " + backToString);
        System.out.println("String'e donusturulmus deger: " + strFromInt);
        
        // Sabitler (Constants)
        System.out.println("\n--- Sabitler ---");
        final double PI = 3.14159265359;
        final int MAX_USERS = 100;
        
        System.out.println("PI sabiti: " + PI);
        System.out.println("MAX_USERS sabiti: " + MAX_USERS);
        
        // Aşağıdaki satır hata verir çünkü sabitler değiştirilemez
        // PI = 3.14; // Hata!
    }
} 