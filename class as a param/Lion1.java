class Lion1{
	static int a =10;
	static boolean b = true;
	static byte c = 30;
	static short d = 40;
	static long e = 50;
	
	static String wish(){
		System.out.println("happy birthday");
		return "rudra";
	}
	static void vehicle() {
        System.out.println("all vehicles");
    }

    static int number() {
        System.out.println(" printing numbers");
        return 100;
    }

    static double file() {
        System.out.println("opening files");
        return 10.5;
    }

    static boolean car() {
        System.out.println("there are 5 seats in car");
        return false;
    }

    static char fruits() {
        System.out.println("mango is the fruits");
        return 'Z';
    }

    static long television() {
        System.out.println(" electronic device");
        return 1000L;
    }

    static float point () {
        System.out.println("this is the point ");
        return 5.5f;
    }

    static byte divide() {
        System.out.println("dividing the numbers");
        return 1;
    }

    static short small() {
        System.out.println("this is very small");
        return 2;
    }

    public static void main(String[] args) {
		wish();
        vehicle();
		number();
		file();
		car();
		fruits();
	    television();
		point();
	    divide();
		small();
	        System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(e);
			
			
		}


}