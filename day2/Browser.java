package week1.day2;

public class Browser {
	//Method declaration with datatype
	public String launchBrowser(String browserName) {
		System.out.println(browserName+" Browser launched successfully");
		return browserName;
}
	//Method Declaration
	public void loadURL() {
		System.out.println("Application URL loaded successfully");
	}
	public static void main(String[] args) {
		//Creating object to call the method
		Browser b=new Browser();
				b.launchBrowser("IE");
				b.loadURL();
				
	}
}

