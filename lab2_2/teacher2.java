
public class teacher2 extends teacher{
	private archive toSave;
	
	public teacher2(archive a){
		toSave=a;
	}
	
	public void setMark(String nameOfCourse, student man){
    	for(course nowproc : toLead)
    	{
    		if(nameOfCourse.compareTo(nowproc.name)==0){
    			man.mark=(int)man.name.charAt(1)+(int)nowproc.name.charAt(1);
    		}	
    	}
    	toSave.add(man);
	}
}
