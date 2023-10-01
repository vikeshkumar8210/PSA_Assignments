package day16;

public class PlantinumAccount extends GoldAccount{
	@Override
	public void RateOfIntrest() {
		System.out.println("6% PA");
	}
	public static void main(String[] args) {
		GoldAccount g = new GoldAccount ();
		g.OnlineBanking();
		g.RateOfIntrest();
		
		PlantinumAccount p = new PlantinumAccount(); 
		p.OnlineBanking ();
		p.RateOfIntrest ();
	}

}
