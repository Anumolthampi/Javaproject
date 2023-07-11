package waterTankCapacity;

import java.util.Scanner;

public class TankOverFlow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TankCapacity bucket = new TankCapacity();
		
		//Scanner scanner = new Scanner(System.in);
		
//		System.out.println("Enter the Tank capacity in liters");
//		int tankCapacity = scanner.nextInt();
//		System.out.println("Enter the bucket capacity in liters");
//		int bucketCapacity = scanner.nextInt();
//		
		bucket.currentWaterLevel=20;
		bucket.tankCapacity=100;
		bucket.bucketCapacity=10;
		bucket.waterFilling();

	}

}
