# Gün 1: Java Syntax, Değişkenler, Veri Tipleri

## Java JDK Kurulumu
Java geliştirme yapmak için JDK (Java Development Kit) kurulu olmalıdır. JDK, kodları derlemek ve çalıştırmak için gerekli tüm araçları içerir.

### Kurulum Adımları:
1. [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html) veya [OpenJDK](https://openjdk.java.net/) sitesinden JDK indir
2. Kurulum sihirbazını izle
3. Kurulumdan sonra, komut satırından şu komutu çalıştırarak kurulumun başarılı olduğunu doğrula:
   ```
   java -version
   ```

## İlk Java Programı: Hello World
Java'da her program bir sınıf içinde yer alır ve her programın başlangıç noktası `main` metodudur.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

- `public class HelloWorld`: Sınıf tanımı, dosya adı ile aynı olmalıdır (HelloWorld.java)
- `public static void main(String[] args)`: Ana metot, program buradan başlar
- `System.out.println()`: Konsola çıktı yazdırma metodu

### Java Programını Çalıştırma:
1. Dosyayı `HelloWorld.java` adıyla kaydet
2. Komut satırında şu komutları çalıştır:
   ```
   javac HelloWorld.java   // Derleme işlemi
   java HelloWorld         // Çalıştırma işlemi
   ```

## Temel Veri Tipleri
Java'da iki tür veri tipi vardır: ilkel (primitive) ve referans tipleri.

### İlkel Veri Tipleri:
- `byte`: 8-bit, -128 ile 127 arası
- `short`: 16-bit, -32,768 ile 32,767 arası
- `int`: 32-bit, -2^31 ile 2^31-1 arası
- `long`: 64-bit, -2^63 ile 2^63-1 arası
- `float`: 32-bit, ondalıklı sayılar
- `double`: 64-bit, ondalıklı sayılar
- `char`: 16-bit, tek bir Unicode karakter
- `boolean`: true veya false değeri

### Örnek:
```java
byte myByte = 127;
short myShort = 32767;
int myInt = 100000;
long myLong = 15000000000L; // L harfi long olduğunu belirtir
float myFloat = 5.75f;      // f harfi float olduğunu belirtir
double myDouble = 19.99d;   // d harfi opsiyoneldir
char myChar = 'A';
boolean myBool = true;
```

## Değişkenler ve Sabitler
Değişkenler, değerleri saklayan hafıza bölgeleridir. Sabitler (constants) ise değeri değiştirilemeyen değişkenlerdir.

### Değişken Tanımlama:
```java
veriTipi değişkenAdı = değer;
```

### Sabit Tanımlama:
```java
final veriTipi SABİT_ADI = değer;
```

Örnek:
```java
int age = 25;                    // Değişken
final double PI = 3.14159265359; // Sabit (final anahtar kelimesi ile)
```

## Tip Dönüşümleri (Casting)
Bir veri tipinden diğerine dönüşüm yapmak için casting kullanılır.

### Otomatik Dönüşüm (Widening Casting):
Küçük veri tipinden daha büyük bir veri tipine otomatik dönüşüm.

```java
int myInt = 9;
double myDouble = myInt; // Otomatik dönüşüm
```

### Manuel Dönüşüm (Narrowing Casting):
Büyük veri tipinden daha küçük bir veri tipine manuel dönüşüm.

```java
double myDouble = 9.78;
int myInt = (int) myDouble; // Manuel dönüşüm, 9 değerini alır
```

## String Sınıfı
String, Java'da çok sık kullanılan bir referans veri tipidir. Metinleri temsil eder.

```java
String greeting = "Merhaba!";
```

### String Metodları:
- `length()`: String'in uzunluğunu döndürür
- `concat()`: İki String'i birleştirir
- `toUpperCase()`: Tüm karakterleri büyük harfe dönüştürür
- `toLowerCase()`: Tüm karakterleri küçük harfe dönüştürür
- `indexOf()`: Belirli bir karakterin veya alt dizinin indexini döndürür
- `substring()`: Belirli bir bölümü alt string olarak döndürür

```java
String txt = "Merhaba Dünya";
System.out.println("Uzunluk: " + txt.length());
System.out.println("Büyük Harf: " + txt.toUpperCase());
System.out.println("'Dünya' kelimesinin indexi: " + txt.indexOf("Dünya"));
```

