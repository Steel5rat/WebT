import java.util.ArrayList;


public class archive {
	private ArrayList<student> arr = new ArrayList<student>();
	public void add(student input){
		arr.add(input);
	}
	
	public void printInfo(){
    	for(student nowproc : arr){
    		System.out.println(nowproc.name+" "+nowproc.mark);	
    	}
	}
}
