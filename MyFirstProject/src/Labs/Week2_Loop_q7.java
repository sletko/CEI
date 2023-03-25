package Labs;

public class Week2_Loop_q7 {

	
	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		int userValue = 2;
		//userValue = in.nextInt();

        // add your code below this line 
        int count = 1;
        
		if (userValue > 0) {
		    for (int i = 0; count + (i * userValue) <= 100; i++) {
		        int result = count + (i * userValue);
		    {
		        System.out.println(result);
		        }
		    }
     }else {
    	 System.out.println("Your number needs to be greater than 0.");
     }
	}
}
