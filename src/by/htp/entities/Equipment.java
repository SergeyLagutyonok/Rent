package by.htp.entities;

public class Equipment {

	private Category category;
	private String title;
	private int price;

	public Equipment(Category category, String title, RentStation rent) {
		this.category = category;
		this.title = title;
		rent.addInArrayEquipment(this);
	}

	public Equipment() {
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
