
public class student {
	private String name;
	private double avgBall;
	private boolean isPass=false;
	
	public student(String name){
		this.name=name;
	}
	
	public double getAvg(){
		return avgBall;
	}
	public String getName(){
		return name;
	}
	
	public void setDepartment(department input){
		avgBall=input.getExams(this);
	}
	
	public void registrInArchive(archive input){
		input.addStud(this);
	}
	
	public boolean getResult(){
		return isPass;
	}
	
	public void setResult(boolean a){
		isPass=a;
	}

}
