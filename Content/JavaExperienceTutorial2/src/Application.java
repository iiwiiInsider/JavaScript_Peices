
public class Application {
	public static void main(String[] args) {
		int myInt = 7;
		
		String PackageAnalysisIntroText = "the filesize for this package is 35 bytes ";
		
		String PackageHolderType = "and is owned and managed by ";
		
		String HolderName = "Bob.";
				
		String greet = PackageAnalysisIntroText + PackageHolderType + HolderName;		
		
		System.out.println(greet);
		
		System.out.println("the filesize for this package is 35 bytes " + "and is owned and managed by " + "Bob.");
		
		System.out.println("my Interger is: " + myInt + ".");
		
		double myDouble = 7.8;
		
		System.out.println("my Number is: " + myDouble + ".");
	}
}
