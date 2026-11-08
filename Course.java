package org.example;

import java.util.Locale;

public class Course {
    private String courseName;
    private int credit;
    private String letterGrade;
    private double gradePoint;
    //constructor
    public Course(String courseName, int credit, String letterGrade){
        this.courseName = courseName;
        this.credit = credit;
        this.letterGrade = letterGrade.toUpperCase(); //küçük harf girilse bile büyüğe çevir
        this.gradePoint = calculateGradePoint(this.letterGrade);
    }

    private double calculateGradePoint(String letterGrade) {
        switch (letterGrade) {
            case "AA": return 4.0;
            case "BA": return 3.5;
            case "BB": return 3.0;
            case "CB": return 2.5;
            case "CC": return 2.0;
            case "DC": return 1.5;
            case "DD": return 1.0;
            case "FF": return 0.0;
            default:
                System.out.println("geçersiz harf notu girdiniz, puan 0.0 kabul edildi.");
                return 0.0;
        }
    }
    //getter metotları
    public String getCourseName(){
        return courseName;
    }
    public int getCredit(){
        return credit;
    }
    public String getLetterGrade(){
        return letterGrade;
    }
    public double getGradePoint(){
        return gradePoint;
    }
}

