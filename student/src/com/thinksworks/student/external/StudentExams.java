package com.thinksworks.student.external;

public class StudentExams {

    private void mathsExam(){
        System.out.println("Method in Mathsexam");
    }
    void englishExam(){
        System.out.println("Method in Englishexam");
    }
      public void display(){
        System.out.println("Display all method");
        mathsExam();
    }

}
