package Labs;

public class Week2_Loop_q6 {

    public static void main(String[] args)  {
        //Scanner in = new Scanner(System.in);
        int num = 5;  //in.nextInt();

        System.out.println("Multiplication Table of " + num);

        // create your for loop below here 
        
        for (int i = 1; i <= 10; i++) {
        	int product = num * i;
        	System.out.println(num + " X " + i + " = " + product);
        }
        
    }

}
