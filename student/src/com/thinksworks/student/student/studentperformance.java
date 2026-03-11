package com.thinksworks.student.student;

  public   class studentperformance {
      private  void studentscore() {
        System.out.println("Student score method");
    }

    void studentmaths() {
        System.out.println("Student maths method");
    }
    public   void display(){
        System.out.println("Display in performance class");
        studentperformance Studentperformance = new studentperformance();
        studentInfo StudentInfo = new studentInfo();
        Studentperformance.studentscore();
        StudentInfo.display();
        Studentperformance.studentmaths();

    }
}

