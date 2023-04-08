package src.log;



public class AsteriskLogger implements Logger {
	
	public void Log(String x)  {
	System.out.println("***" + x + "***");  // print asterisk both side of String
	}

	public void Error(String z) {
		System.out.println("***Error: " + z + "***");  // print asterisk both side of String
		
	}


}


