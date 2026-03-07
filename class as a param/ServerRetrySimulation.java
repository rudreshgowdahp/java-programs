class ServerRetrySimulation{
	public static void main(String[]args){
		int attempt= 1;
		while(attempt<=3){
			System.out.println("attempt:"+attempt);
			attempt++;
		}
		System.out.println("connection is failed");
	}
		
}