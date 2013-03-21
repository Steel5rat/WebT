
public class point extends figure{
	public point(int radius,int centerX, int centerY){
		this.radius = radius;
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	public boolean isRight(int x, int y){
		x-=centerX;
		y-=centerY;
		if ((x*x+y*y)<(radius*radius))
			return true;
		else
			return false;
	}
}
