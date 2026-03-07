class Ecommerce{
	
	
static void shoppingAmount (double amount){
	if(Amount>=5000){
		System.out.println( "Discount is 20%");
	}
	else if (Amount>=2000){
		System.out.println( "Discount is 10%");
	}
	else if (Amount<=2000){
		System.out.println( " No Discount");
	}
}
   public static void main(String[]args){
	   shoppingAmount(2222.0);
   }
 


}