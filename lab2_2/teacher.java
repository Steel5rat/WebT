import java.util.ArrayList;


public abstract class teacher {
	protected ArrayList<course> toLead = new ArrayList<course>();
	
	public void addCourse(String name){
		toLead.add(new course(this,name));
	}
	public void setMark(String nameOfCourse, student man){
		
	}
}
