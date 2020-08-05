import java.util.Random;

public class CalcPi { //Use Math.random() to calculate Pi
	//pir^2/4r^2 = number of points in circle / number of total points
	
	//pi = num of points in circle / num of total points

	
	
	public static double calculate(double n) {
		
		double numOfPointsInCircle = 0;
		
		Random r = new Random();
		
		for(int i = 0; i < n; i++) {
			double x = r.nextDouble();
			double y = r.nextDouble();
			
			double distance = (x*x) + (y*y);
			
			if(distance < 1) {
				numOfPointsInCircle += 1;
			}
			
		}
		
		return (4 * numOfPointsInCircle)/n;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("Calculating...");
		double pi = calculate(1000); //The greater amount of data points you put in, the more accurate your result 
		
		System.out.println("Pi equals " + pi);
	}
}
