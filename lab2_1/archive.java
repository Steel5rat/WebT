import java.util.ArrayList;


public class archive {
	ArrayList<student> arr = new ArrayList<student>();
	
	private void update(){
    	double sumAvgBall=0;
		for(student nowproc : arr){
    		sumAvgBall+=nowproc.getAvg();
    	}
		double needBall=sumAvgBall/arr.size();
		for(student nowproc : arr){
    		if(nowproc.getAvg()>=needBall)
    			nowproc.setResult(true);
    		else
    			nowproc.setResult(false);
    	}
	}
 
	public void addStud(student newelem){
		arr.add(newelem);
		this.update();
	}
	
	public void printInfo(){
		for(student nowproc : arr){
			System.out.println(nowproc.getName()+" "+nowproc.getAvg()+" "+nowproc.getResult());
    	}
	}
}
