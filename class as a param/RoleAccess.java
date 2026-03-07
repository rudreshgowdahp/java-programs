class RoleAccess{
	public static void main(String[]args){
		accessControl("Manager");
	}
	static  void accessControl(String role){
		switch(role){
		 case "Admin":{
			 System.out.println("Full system access");
			 break;
		 }
		 case "Manager":{
			 System.out.println("Manage team access");
			 break;
		 }
		 case "User":{
			 System.out.println("Limited access");
			 break;
		 }
		 case "Guest":{
			 System.out.println("View only access");
			 break;
		 }
		 default:{
			 System.out.println("Invalid role");
		 }
		}
		
	}
 }