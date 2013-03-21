import java.util.ArrayList;
import java.util.Collections;


public class listBlackBox {
	private ArrayList<Integer> data = new ArrayList<Integer>();
	private int k=0;
	
	public listBlackBox(ArrayList<Integer> neww){
		data.addAll(new ArrayList<Integer>(neww));
	}
	
	public listBlackBox(){
	}
	
	public void setK(int newK){
		k=newK;
	}	
	
	public void add(int toAdd){
		data.add(toAdd);
	}
	
	public int getKElem(){
		Collections.sort(data);
		return data.get(k-1);
	}
	
	public String toString(){
		String result="";
		for(int i:data){
			result+=String.valueOf(i) +" ";
		}
		return result;
	}
}
