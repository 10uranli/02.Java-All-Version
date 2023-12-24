package java16.unit_2;


public class _02ExecuteClass {

	public static void main(String[] args) {
		Insurance dask = new Dask("Deprem Sigortasi", "Dask");
		Insurance vehicle = new Vehicle("Kasko", "Vehicle");

		System.out.println("Dask prim : " + getPremium(dask) +
				" Kasko prim : " + getPremium(vehicle));

		System.out.println("Dask prim : " + getPremiumWithPattern(dask) +
				" Kasko prim : " + getPremiumWithPattern(vehicle));

	}

	public static int getPremium(Insurance insurance){
		if (insurance instanceof Dask){
			return ((Dask) insurance).getPremiumForDask();
		} else if (insurance instanceof Vehicle) {
			return ((Vehicle) insurance).getPremiumForVehicle();
		}
		return -1;
	}

	public static int getPremiumWithPattern(Insurance insurance){
		if (insurance instanceof Dask dask){
			return dask.getPremiumForDask();
		} else if (insurance instanceof Vehicle vehicle) {
			return vehicle.getPremiumForVehicle();
		}
		return -1;
	}
}


