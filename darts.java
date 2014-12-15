import java.util.Scanner;

/**
 * The purpose of this program is to calculate pi based on random 
 * numbers representing a dart thrown at a circle with radius 1.0
 * surrounded by a square with length and width 1.0.
 * @author Logan Labanna 12/15/2014
 *
 */
public class darts {
	
	public static double getX(){
		double x = Math.random();
		return x;
	};
	public static double getY(){
		double y = Math.random();
		return y;
	};
	public static int getTrials(Scanner in){
		int t = in.nextInt();
		return t;
	}
	public static int getDarts(Scanner in){
		int d = in.nextInt();
		return d;	
	}
	public static void printAverage(double average){
		System.out.printf("Average: " + average);
	}
	public static void main(String[] args){
		
		Scanner in = new Scanner (System.in);
		double h , n , x, y, piAvg = 0, piTotal = 0;
		int dartsThrown = 0, trials = 0, counter = 0;
		double pi [] = new double [trials];
		
		System.out.printf("How many trials?: \n");
		trials = getTrials(in);
		System.out.printf("How many darts?: \n");
		dartsThrown = getDarts(in);
		
		in.close();
		
		for(int i = 0; i < pi.length; i++){
			h = 0;
			n = 0;
			while(counter < dartsThrown){
				x = getX();
				y = getY();
				n++;
				if((Math.pow(x, 2) + (Math.pow(y, 2)) <= 1.0)){
					h++;
				}
				counter++;
			}
			pi [i] = 4 * (h/n);
			piTotal += pi [i];
			System.out.printf("Trial [%d]: pi = %.6f\n", i, pi[i]);
			counter = 0;
			}
		
		piAvg = piTotal / trials;
		printAverage(piAvg);
		
    }
}
