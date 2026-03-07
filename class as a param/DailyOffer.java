class DailyOffer{
public static void main(String[]args){
	printOffer(3);
}
static void printOffer(int day){
	switch (day){
		case 1:
		System.out.println("Monday Offer: 10% Discount");
		break;
		case 2:
		System.out.println("Tuesday Offer: Free Delivery");
	    break;
		case 3:
		System.out.println("Wednesday Offer: Buy 1 Get 1");
		break;
		case 4:
		System.out.println("Thursday Offer: Cashback 5%");
	    break;
		case 5:
		System.out.println("Friday Offer: 15% Discount");
	    break;
		case 6:
		case 7:
		System.out.println( "Weekend Mega Sale");
	    break;
		default:{
			System.out.println("Invalid Day");
		}	
	}
}
}	
	    




























