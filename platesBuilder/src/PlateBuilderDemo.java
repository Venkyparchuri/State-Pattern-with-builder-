
public class PlateBuilderDemo {

	public static void main(String[] args) {
		 
		
		State builderState = new  PlatesState();
		
		builderState.build();
		
		builderState.backExposer();
		
		builderState.laserAblation();
		
		builderState.mainExposure();
		
		builderState.washOut();
		
		builderState.drying();

	}

}
