package waterTankCapacity;

public class TankCapacity {
	int currentWaterLevel;
	int tankCapacity;
	int bucketCapacity;

// fill water using bucket
	void waterFilling() {
		while (currentWaterLevel <= tankCapacity) {
			if

			(currentWaterLevel + bucketCapacity <= tankCapacity) {
				currentWaterLevel += bucketCapacity;
				System.out.println("current Waterlevel=" + currentWaterLevel);
			}

			else {
				System.out.println("The tank capacity reaches to maximum, The tank will overflow now ");
				break;
			}

		}
	}
}
