import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class TrafficSimulator {
	
	static Scanner keyboard = new Scanner(System.in);

	public static ArrayList<String> carMakes = new ArrayList<String>();
	public static ArrayList<String> carModels = new ArrayList<String>();
	public static ArrayList<String> carColors = new ArrayList<String>();

	public static List q = Collections.synchronizedList(new LinkedList<Car>());

	public static void main(String[] args) {
		insertCarMakes();
		insertCarModels();
		insertCarColors();

		Queue<Car> queue = new ConcurrentLinkedQueue<Car>();

		System.out.println("This program simulates traffic lines.");
		System.out.println("There are two traffic lines.");
		System.out.println("Press enter to start.");
		
		String input = keyboard.nextLine();
            if(input != null) {

            		LinkedListThread listThread = new LinkedListThread(queue);

            		Thread thread = new Thread(listThread, "Line 1");
            		Thread thread2 = new Thread(listThread, "Line 2");

            		thread.start();
            		thread2.start();
            }			
		
	}

	public static void insertCarMakes(){
		carMakes.addAll(Arrays.asList("Ford","Toyota","Kia","Holden","Truck","Honda","Mitsubishi","Falcon"));
	}

	public static void insertCarModels(){
		carModels.addAll(Arrays.asList("2011","2012","2013","2014","2015","2016","2017","2018"));
	}

	public static void insertCarColors(){
		carColors.addAll(Arrays.asList("White","Red","Green","Blue","Purple","Pink","Orange","Silver"));
	}

}