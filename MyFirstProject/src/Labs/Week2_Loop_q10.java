package Labs;

public class Week2_Loop_q10 {

	
    public static void main(String[] args) {

        //Scanner in = new Scanner(System.in);
        int numToAdd = 5;  //in.nextInt();
        int howManyTimes = 5;  //in.nextInt();
        int sumResult = 0;

        // create your do while loop below this line
        int i = 0;

        do {
            sumResult += numToAdd;
            i++;
        } while (i < howManyTimes);
        
        System.out.println(sumResult);
    }
}