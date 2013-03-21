
public class circle {
	private int radius,centerX,centerY;
	private point inside;
	private ring outside;
	public circle(int radius,int centerX, int centerY) throws Exception{
		if (radius<0) throw new Exception("Too small radius");
		this.radius = radius;
		this.centerX = centerX;
		this.centerY = centerY;
		inside = new point(radius,centerX, centerY);
		outside = new ring(radius,centerX, centerY);
	}
	

	public void setSize(int headX, int headY,int botX ,int botY) throws Exception{
		if ((botX<headX)||(botY<headY)) throw new Exception("Wrong arguments");
		if ((botX-headX)!=(botY-headY)) throw new Exception("It isn't a circle");
		radius = (botX-headX)/2;
		centerX = headX+radius;
		centerY = headY+radius;
		inside.reSize(radius, centerX, centerY);
		outside.reSize(radius, centerX, centerY);
	}
	
	public void setRadius(int rad) throws Exception{
		if (rad<0) throw new Exception("Too small radius");
		radius = rad;
		inside.setRad(rad);
		outside.setRad(rad);
	}
	
	public boolean isRightPoint(int x,int y){
		if (inside.isRight(x, y))
			return true;
		else if (outside.isRight(x, y)) {
			return true;
		}
		else
			return false;
	}
		
	public String toString(){
		return "R:"+radius+", X:"+ centerX+", Y:"+centerY;
	}
}
