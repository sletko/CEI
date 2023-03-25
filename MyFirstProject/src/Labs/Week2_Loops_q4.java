package Labs;

public class Week2_Loops_q4 {

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        String userWord = "test"; //in.next();
        String longString ="";

       // create your for loop here
        
        for (int i = 0; i < userWord.length(); i++) {
        	 longString += userWord;
        }


 
        // Do not change this code
        System.out.println(longString);
    }
	}

