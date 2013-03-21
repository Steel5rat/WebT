
public abstract class figure {
	protected int radius,centerX,centerY;
	public void reSize(int radius,int centerX, int centerY){
		this.radius = radius;
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	public void setRad(int rad){
		radius = rad;
	}
	
	public boolean isRight(int x, int y){
		return false;
	}
	
	public String toString(){
		return "R:"+radius+", X:"+ centerX+", Y"+centerY;
	}
}
