package org.example;
import java.util.ArrayList;
import java.util.List;

public class TranscriptService {
    private List<Course> courses;

    public TranscriptService(){
        courses = new ArrayList<>();
    }
    //yeni ders ekleme
    public void addCourse(Course course){
        courses.add(course);
        System.out.println("ders başarıyla eklendi: "+ course.getCourseName() +" (" + course.getCredit() + " Kredi, Harf: " + course.getLetterGrade() + ")");
    }
    //eklenen tüm dersleri listeleme
    public void listCourses() {
        if (courses.isEmpty()){
            System.out.println("henüz eklenmiş bir ders bulunmuyor.");
            return;
        }
        System.out.println("\n---ALINAN DERSLER LİSTESİ---");
        System.out.println("Ders Adı\t\tKredi\tHarf Notu\tPuan");
        System.out.println("---------------------------------------------");
        for (Course c : courses){
            System.out.println(c.getCourseName() +"\t\t"+ c.getCredit() + "\t" + c.getLetterGrade() + "\t\t" + c.getGradePoint());
        }
    }
    //dönem ortalama (AGNO) hesaplama
    public double calculateGPA(){
        if (courses.isEmpty()){
            return 0.0;
        }
        double totalPoints = 0.0; // (kredi*harf notu puanı) toplamı
        int totalCredits = 0;
        for (Course c : courses){
            totalPoints += (c.getCredit() * c.getGradePoint());
            totalCredits += c.getCredit();
        }
        if (totalCredits == 0){
            return 0.0;
        }
        return totalPoints / totalCredits;
    }
}
