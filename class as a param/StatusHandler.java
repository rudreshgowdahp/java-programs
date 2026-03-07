class StatusHandler{
	
	static void payment(String status){
		switch(status){
			case "Sucess":{
			System.out.println("Ordered Confirmed");
			break;
		}
		    case "Failed":{
			System.out.println("Transaction failed");
			break;
		}
		    case "Pending":{
			System.out.println("Awaiting Payment Confirmation");
			break;
		}
		   default:{
			  System.out.println("Invalid ");
		   }
		}
	
	}
		public static void main(String[]args){
			payment("Surtyuitryui");
		}
	
	
			
			
			







}