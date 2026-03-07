class Box{
  byte boxNumber(){
	  System.out.println("It is a Instance method");
	  return 15;
  }
  float noOfBoxes(){
	  System.out.println(" it is  a Instance  method");
	  return 10.5f;
  }
  static String boxName(){
	  System.out.println(" It ia also Instance method");
	  return "FruitBox";
  }
  Box(){
	  System.out.println("Constructor is Box");
	  
  }
  }