package viator.model;

public class City {
	
	public long x,y;
	public double nKilometers;
	public long id;
	
	public City(long id, long x, long y, double nK){
		this.x=x;
		this.y=y;
		this.id=id;
		this.nKilometers=nK;
	}
	
	public boolean collidesWith(City check){
		//check left edge
		if(check.x > this.x && check.x < this.x+(nKilometers*1000)){
			return true;
		}
		//check right edge
		else if(check.x+(check.nKilometers*1000)>this.x && check.x+(check.nKilometers*1000) < this.x+(nKilometers*1000)){
			return true;
		}
		//check top
		if(check.y > this.y && check.y < this.y+(nKilometers*1000)){
			return true;
		}
		//check bottom
		else if(check.y+(check.nKilometers*1000)>this.y && check.y+(check.nKilometers*1000) < this.y+(nKilometers*1000)){
			return true;
		}
		return false;
	}
	
	public void moveTo(long x,long y){
		this.x=x;
		this.y=y;
	}

}
