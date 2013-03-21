
public class teacher1 extends teacher{
	private archive toSave;
	
	public teacher1(archive a){
		toSave=a;
	}
	
	public void setMark(String nameOfCourse, student man){
    	for(course nowproc : toLead)
    	{
    		if(nameOfCourse.compareTo(nowproc.name)==0){
    			man.mark=(int)man.name.charAt(0)+(int)nowproc.name.charAt(0);
    		}	
    	}
    	toSave.add(man);
	}
	
	
}
