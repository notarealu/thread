import java.util.*;

public class LinkedListThread implements Runnable {

	private static final int DELAY = 3000;
	private static final int len = 8;
	private static LinkedList<Car> lineone = new LinkedList<Car>();
	private static LinkedList<Car> linetwo = new LinkedList<Car>();
	private static HashMap<String, LinkedList<Car>> newMap = new HashMap<String, LinkedList<Car>>();
	static{
		newMap.put("Line 1",lineone);
		newMap.put("Line 2",linetwo);
	}

	private static Random randomizer;
	private Car car = new Car();
	private final Queue<Car> carQueue;
	
	public LinkedListThread(Queue<Car> carQueue) {
		randomizer = new Random();
		this.carQueue = carQueue;
	}
	
	@Override
	public void run() {
		try {
			for (int count = 0; count <= 2; count++) {
				initCar();
				Car carInQueue = new Car();
           		carInQueue = carQueue.poll();

           		Queue2.addCar(newMap.get(Thread.currentThread().getName()),carInQueue);				 
				
			}	

		}
		catch (Exception exception) {}
	}

	private void initCar(){
		    try {
                Thread.sleep(randomizer.nextInt(DELAY));
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            	Car car = new Car();

				int random = randomizer.nextInt(len);
				car.setRandomMake(random, TrafficSimulator.carMakes);
				random = randomizer.nextInt(len);
				car.setRandomModel(random, TrafficSimulator.carModels);
				random = randomizer.nextInt(len);
				car.setRandomColor(random, TrafficSimulator.carColors);
				System.out.println("In "+ Thread.currentThread().getName()+" the following car has been added: "+car.getColor()+" "+car.getMake()+ " "+car.getModel());

				carQueue.offer(car);

				synchronized (carQueue) {
            		carQueue.notifyAll();
       			 }
	}

}