package viator.model;

public class ModelWorld {
	
	private long totalLatitude, totalLongitude;
	private static double mediumRatio=2, smallRatio=3, tinyRatio=4;
	private static double largK=4.0,medK=3.0,smallK=2.0,tinyK=1.0;
	public int X;
	private static double reserve=0.2;
	
	public ModelWorld(long nKilometers, double density){
		this.totalLatitude=nKilometers*1000;
		this.totalLongitude=nKilometers*1000;		
		generateX(density);
	}
	
	private void generateX(double density){
		this.X=(int)((density*(1.0-reserve)*totalLatitude/1000*totalLongitude/1000)/
				((largK*largK)+mediumRatio*(medK*medK)+smallRatio*(smallK*smallK)+tinyRatio*(tinyK*tinyK)));
	}
	
	private void generateCities(){
		
	}

}
