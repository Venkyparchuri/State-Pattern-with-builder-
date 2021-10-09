
public abstract class PlateBuilder {
	

	
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PlateTypes getPlatetypes() {
		return platetypes;
	}

	public void setPlatetypes(PlateTypes platetypes) {
		this.platetypes = platetypes;
	}

	PlateTypes platetypes;


	
	
	
	public abstract void addPlateType();
	
	public abstract void addColor();

}
