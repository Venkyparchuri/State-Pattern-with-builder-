

public class PlatesState implements State {

	@Override
	public void build() {
		 
		System.out.println("Building a paper plates process   ");
		
	}

	@Override
	public void backExposer() {
		 
		System.out.println("Step1: back Exposer process");
	}

	@Override
	public void laserAblation() {
		System.out.println("Step2: back Exposer process");
		
	}

	@Override
	public void mainExposure() {
		System.out.println("Step3: back Exposer process");
		
	}
	
	@Override
	public void washOut() {
		System.out.println("Step4: Wash out process");
		
	}

	@Override
	public void drying() {
		System.out.println("Step5: back Exposer process");
		
	}

}
