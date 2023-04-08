package src.log;

public class Application {
	
	public static void main(String[] arg) {
		
		Logger logA = new AsteriskLogger();
		Logger logS = new SpacedLogger();
		
		logA.Log("Star");
		logA.Error("Wars");
		logS.Log("Trek");
		logS.Error("Gate");
		
	}

}
