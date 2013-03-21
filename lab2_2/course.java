
public class course {
	private teacher master;
	public String name;
	public course(teacher master, String name){
		this.master=master;
		this.name=name;
	}	
	
	public teacher getMaster(){
		return master;
	}
}
