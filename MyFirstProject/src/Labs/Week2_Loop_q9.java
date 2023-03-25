package Labs;

public class Week2_Loop_q9 {


	public static void main(String[] args) {
	//Scanner in = new Scanner(System.in);
	int userNumber;
	userNumber = 100;  //in.nextInt();

    // Write your code below 
    if (userNumber >= 10 && userNumber <= 110) {
    	System.out.println(userNumber);
    	while (userNumber > 10) {
    		userNumber--;
     	System.out.println (userNumber);
    }
    }else {
    	System.out.println("Your number is not between 10 and 100.");
    	}
	}
}
