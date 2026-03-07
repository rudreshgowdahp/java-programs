class HttpStatusHandler{
	public static void main(String[]args){
	handler(500);
	}
	static void handler(int code){
		switch(code){
			case 200:{
				System.out.println("OK – Request Successful");
				break;
			}
			case 201:{
				System.out.println("Created Successfully");
				break;
			}
			case 400:{
				System.out.println("Bad Request");
				break;
			}
			case 401:{
				System.out.println("Unauthorized Access");
				break;
			}
			case 404:{
				System.out.println("Page Not Found");
				break;
			}
			case 500:{
				System.out.println("Internal Server Error");
				break;
			}
			default:{
				System.out.println("Unknown Status Code");
			}
		}
	}
}