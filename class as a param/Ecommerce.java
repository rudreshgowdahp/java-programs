class Ecommerce{
	
	
static void shoppingAmount (double amount){
	if(amount>=5000){
		System.out.println( "Discount is 20%");
		amount = amount - amount*0.2;
		System.out.println( "Your fial payuable value is : "+amount);
	}
	else if (amount>=2000){
		System.out.println( "Discount is 10%");
		amount = amount - amount*0.1;
		System.out.println( "Your fial payuable value is : "+amount);
	}
	else if (amount<=2000){
		System.out.println( " No Discount");
		System.out.println( "Your final payuable value is : "+amount);
	}
}
   public static void main(String[]args){
	   shoppingAmount(1000.0);
   }



}