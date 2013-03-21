
public class student {
	public String name;
	public int mark;
	
	public student(String name){
		this.name=name;
	}
	
	public void setCourse(String nameOfCourse,teacher master){
		master.setMark(nameOfCourse,this);		
	}
}
