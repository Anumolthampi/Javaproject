package waterTankCapacity;

public class TankCapacity {
	int currentWaterLevel;
	int tankCapacity;
	int bucketCapacity;

// fill water using bucket
void waterFilling()
{
	while(currentWaterLevel<=tankCapacity)
	{
		if
	
		(currentWaterLevel + bucketCapacity <= tankCapacity)
			{
			currentWaterLevel += bucketCapacity;
			
		System.out.println("Number of times the bucket emptied =" +  (currentWaterLevel/bucketCapacity));	
	}
		
		else 
		{
			System.out.println("The tank will overflow");
			break;
		}

	}
}
}

		

