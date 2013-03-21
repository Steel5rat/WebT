import java.util.ArrayList;


public class planet {
	private String name;
	ArrayList<continent> continents = new ArrayList<>();
	public planet(String name){
		this.name = name;
	}
	
	public void addContinent(String contName) throws Exception{
		for (continent elem: continents){
			if (elem.name.compareTo(contName)==0)
				throw new Exception("This continent already exists.");
		}
		continents.add(new continent(contName));
	}
	
	public String toString(){
		return name;
	}
	
	public int getNumbContinents(){
		return continents.size();
	}
	
	public ArrayList<continent> getConts(){
		return continents;
	}
}
