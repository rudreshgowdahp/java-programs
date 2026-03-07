class Offers{
    String names;
	int   numbers;
	int phoneNumbers;
	boolean result;
	float digits;
	
	
	Offers(){
		System.out.println(" no arguments Constructor ");
	}
    Offers(String names){
		this();
		this.names = names;
		
		System.out.println(" Arguments Constructor  ");
	}	
	Offers(String names,int numbers){
		this(names);
		this.numbers = numbers;
		System.out.println("Arguments Constructor");
	}
	Offers(String names,int numbers,int phoneNumbers){
		this(names,numbers);
		this.phoneNumbers = phoneNumbers;
		System.out.println("Arguments Constructor");
	}
	Offers(String names,int numbers,int phoneNumbers,boolean result){
		this(names,numbers,phoneNumbers);
		this.result = result;
		System.out.println("Arguments Constructor");
	}
	Offers(String names,int numbers,int phoneNumbers,boolean result,float digits){
	     this(names,numbers,phoneNumbers,result);
		this.digits= digits;
		System.out.println("Arguments Constructor");
	}
	}