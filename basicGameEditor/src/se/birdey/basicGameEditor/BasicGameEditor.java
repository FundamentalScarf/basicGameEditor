package se.birdey.basicGameEditor;
public class BasicGameEditor {
	public static void main(String[] args) {
		
		try{
			LibrarySetup.loadNativeLibraries();
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Sorry :(");
			System.exit(1);
		}
		
		System.out.println("YAY!!!");
		
	}
}
