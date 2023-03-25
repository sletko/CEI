package Labs;

public class Week2_Loop_q8 {


    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        int base = 2;  //in.nextInt();
        int power = 5;  //in.nextInt();
        int result = 1;

        // Create your for loop here 
        
        for (int i = 1; i <= power; i++) {
        	result *= base;
        }
        
        
        // Do not change this code
        System.out.println("Result: "+ result);
    }
}
