package src.log;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String x) {
		for (int i = 0; i < x.length(); i++) {
			System.out.print(x.charAt(i) + " " );   // print Char with spaces between each
		}
		System.out.print("\n");
		
	}
	
	@Override
	public void Error(String z) {
		System.out.print("ERROR: ");
		for (int i = 0; i < z.length(); i++) {
			System.out.print(z.charAt(i) + " ");  //print Char with spaces between each
		}
	}
}
