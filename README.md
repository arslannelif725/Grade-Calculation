# 🎓 University Grade & GPA Calculator (Not Hesaplama ve Ortalama Sistemi)

Bu proje, Java programlama dili ve Nesne Yönelimli Programlama (OOP) prensipleri kullanılarak geliştirilmiş konsol tabanlı bir **Üniversite Not Hesaplama ve AGNO (Dönem Ortalaması) Sistemi**dir.

## 🚀 Projenin Amacı ve Özellikleri
* **Nesne Yönelimli Tasarım (OOP):** `Course` ve `TranscriptService` sınıfları aracılığıyla modüler ve temiz bir mimari sunar.
* **Otomatik Harf Notu Dönüşümü:** Girilen harf notlarını (AA, BA, BB vb.) üniversite sistemine uygun 4.0'lık sisteme otomatik olarak çevirir.
* **Ağırlıklı Ortalama (AGNO / GPA) Hesaplama:** Alınan derslerin kredilerini (AKTS) ve harf puanlarını baz alarak dönem ortalamasını hassas bir şekilde hesaplar.
* **İnteraktif Konsol Menüsü:** Kullanıcı dostu `Scanner` tabanlı menü döngüsü ile kolay veri girişi ve listeleme sağlar.

## 🛠️ Kullanılan Teknolojiler
* **Java** (JDK 17+)
* **Maven** (Proje ve bağımlılık yönetimi)
* **IntelliJ IDEA** (Geliştirme ortamı)

## 📦 Proje Mimarisi (Package Structure)
```text
src/main/java/org/ezample/
├── Course.java            # Ders bilgilerini ve harf puanı dönüşümlerini tutar
├── TranscriptService.java # Ders listeleme ve AGNO hesaplama mantığını barındırır
└── Main.java              # Konsol arayüzü ve kullanıcı etkileşim döngüsü
