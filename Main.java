package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TranscriptService transcript = new TranscriptService();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        System.out.println("ÜNİVERSİTE NOT HESAPLAMA VE ORTALAMA SİSTEMİ ");

        while (!exit){
            System.out.println("\n---İŞLEM MENÜSÜ---");
            System.out.println("1. Yeni ders ekle");
            System.out.println("2. Alınan Dersleri Listele");
            System.out.println("3. AGNO hesapla");
            System.out.println("4. Çıkış");

            int choice = scanner.nextInt();
            scanner.nextLine(); //dummy buffer fix (enter karaketerini yakalamak için)

            switch (choice){
                case 1:
                    System.out.println("Ders Adı: ");
                    String courseName = scanner.nextLine();

                    System.out.println("Dersin kredisi / AKTS'si: ");
                    int credit = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("harf notunuz: ");
                    String letterGrade = scanner.nextLine();

                    Course newCourse = new Course(courseName, credit, letterGrade);
                    transcript.addCourse(newCourse);
                    break;
                case 2:
                    transcript.listCourses();
                    break;
                case 3:
                    double gpa = transcript.calculateGPA();
                    System.out.printf("Güncel Dönem Ortalamanız (AGNO): %.2f / 4.00\n", gpa);
                    break;
                case 4:
                    exit =true;
                    System.out.println("Sistemden çıkılıyor. Başarılar Dileriz");
                    break;
                default:
                System.out.println("geçersiz seçim lütfen 1-4 arasında bir sayı seçin");
            }
        }
        scanner.close();
    }
}