
public class PlasticPlateBuilder extends PlateBuilder {
	

	
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



	@Override
	public void addPlateType() {
		
		System.out.println("set the plate type ");
		
	}

	@Override
	public void addColor() {
		System.out.println("Add color to the plastc plates  ");
		
	}

}
