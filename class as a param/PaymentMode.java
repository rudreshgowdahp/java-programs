class PaymentMode{
	public static void main(String[]args){
		processing("COD");
	}
	static void processing(String mode){
		switch (mode){
			case "UPI":{
				System.out.println("Redirecting to UPI Gateway");
				break;
			}
			case "CARD":{
				System.out.println("Processing Card Payment");
				break;
			}
			case "NETBANKING":{
				System.out.println("Redirecting to Bank");
				break;
			}
			case "COD":{
				System.out.println("Cash on Delivery Selected");
				break;
			}
			default:{
				System.out.println("Invalid Payment Mode");
			}
		}
	}
}