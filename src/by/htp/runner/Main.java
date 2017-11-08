package by.htp.runner;

import by.htp.entities.Bike;
import by.htp.entities.Category;
import by.htp.entities.Equipment;
import by.htp.entities.RentStation;
import by.htp.entities.Snowboard;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Bike bike1 = new Bike(Category.SUMMEREQUIPMENT, "Merida",
		// "Downhill");
		// Bike bike2 = new Bike(Category.SUMMEREQUIPMENT, "Cross", "Track");
		// Snowboard snowboard1 = new Snowboard(Category.WINTEREQUIPMENT,
		// "Burton", "new");
		// Snowboard snowboard2 = new Snowboard(Category.WINTEREQUIPMENT,
		// "Head", "used");

		RentStation riderShop = new RentStation();

		Equipment eq1 = new Bike(Category.SUMMEREQUIPMENT, "Bike", riderShop);
		Equipment eq2 = new Bike(Category.SUMMEREQUIPMENT, "Bike", riderShop);
		Equipment eq3 = new Snowboard(Category.WINTEREQUIPMENT, "Snowboard", riderShop);

		riderShop.equipmentCatalog();

		// allEquipment.addEquipment(bike1, 0);
		// allEquipment.addEquipment(bike2, 1);
		// allEquipment.addEquipment(snowboard1, 2);
		// allEquipment.addEquipment(snowboard2, 3);
		//
		// allEquipment.equipmentCatalog();

	}

}
