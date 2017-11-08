package by.htp.entities;

public class RentStation {
	private Equipment[] availableUnits = new Equipment[100];
	private Equipment[] rentUnits = new Equipment[100];
	int countAvailable = 0;
	int countRent = 0;

	public RentStation(int number) {
		availableUnits = new Equipment[number];

	}

	public RentStation() {

	}

	public void equipmentCatalog() {
		for (int i = 0; i < availableUnits.length; i++) {
			if (availableUnits[i] != null) {
				System.out.println(
						"Season: " + availableUnits[i].getCategory() + " Title: " + availableUnits[i].getTitle());
			}
		}
	}

	public void addEquipment(Equipment availableUnit, int index) {
		availableUnits[index] = availableUnit;
	}

	public void addInArrayEquipment(Equipment eq) {
		availableUnits[countAvailable] = eq;
		countAvailable++;
	}
}
