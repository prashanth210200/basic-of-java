package Java8File;

public interface Apartments {
	public int noOfFlats();
	public boolean isFurnished();
	
	public static String builder() {
		return "VIP Builders";
		
	}
	public default int budget() {
		return 30000000;
	}
	
	public class Flats implements Apartments {
		public int noOfFlats() {
			return 6;
		}
		public boolean  isFurnished() {
			return true;
		}
		public int budget() {
			return 40000000;
		}
		
		public static String builder() {
			return "Raj Builders";
		}
	}
}
