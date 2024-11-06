package labc3;

public class Main {

	public static void main(String[] args) {
		HillStations hillStation = new HillStations();
		hillStation.location();
		hillStation.famousFor();
		
		System.out.println();
		hillStation = new Manali();
		hillStation.location();
		hillStation.famousFor();
		
		System.out.println();
		hillStation = new Mussoorie();
		hillStation.location();
		hillStation.famousFor();
		
		System.out.println();
		hillStation = new Gulmarg();
		hillStation.location();
		hillStation.famousFor();
	}

}
