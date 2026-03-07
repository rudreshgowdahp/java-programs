class Student{
	static int studentMarks=100;
    static double twoMarks=200; ;
    static String name= "rudresh";
    static boolean studentResult= true;
    static char studentGrade='A';
	
	 static void student(){
	  System.out.println("student name");
     } 
     static byte studentAge(){
	  System.out.println("student Age");
	  return 23;
     } 
     static  boolean studentResult(){
	  System.out.println("student Result");
	  return true;
     } 	 
	 static short studentMaths(){
	  System.out.println("student Maths");
	  return 200;
     } 
	 static int  studentScience(){
	  System.out.println("student Science");
	  return 2000;
     } 
	 static long studentKannada(){
	  System.out.println("student kannada");
	  return 50000;
     } 
	 static float studentEnglish(){
	  System.out.println("student english");
	  return 10.5f;
     } 
	 static double studentHindi(){
	  System.out.println("student hindi");
	  return 22.5d;
     } 
	 static char studentSocial(){
	  System.out.println("student Social");
	  return  'D';
     } 
	 static Object studentPolictics(){
	  System.out.println("student polictics");
	  return "ram";
     } 
	 
	  
	   public static void main(String[]args){
		   byte car= studentAge();
		   System.out.println(car);
		   
		   double name = studentHindi();
			   System.out.println(name);
		  
		   
		   System.out.println(studentMarks);
		   System.out.println(twoMarks);
		   System.out.println(name);
		   System.out.println(studentResult);
	       System.out.println(studentGrade);
		   student();
		   studentAge();
		   studentResult();
		   studentMaths();
		   studentScience();
		   studentKannada();
		   studentEnglish();
		   studentHindi();
		   studentSocial();
		   studentPolictics();
	   }
}