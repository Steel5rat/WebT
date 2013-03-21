import java.io.BufferedReader;
import java.io.InputStreamReader;


public class user {

	public static void main(String[] args) {
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Creating Planet...\nEnter name:");
	    String name="";
	    try {
	      name = in.readLine();
	    }
	    catch(Exception e) {
	      System.out.println(">" + e);
	    }
	    System.out.println("Enter number of continents:");
	    String number="";
	    try {
		      number = in.readLine();
		    }
		    catch(Exception e) {
		      System.out.println(">" + e);
		    }
	    int numb=0;
	    try{
	    	numb = Integer.decode(number);
	    }
	    catch(Exception e){
	    	System.out.println("> " + e);
	    }
	    String nameNewCont;
	    planet plan = new planet(name);
	    for(int i=0;i<numb;i++){
		    System.out.println("Enter continent number "+(i+1)+":");
		    nameNewCont="";
		    try {
			      nameNewCont = in.readLine();
			    }
			catch(Exception e) {
			      System.out.println(">" + e);
			    }
		    try{
		    	plan.addContinent(nameNewCont);
		    }
		    catch(Exception e){
		    	  i--;
			      System.out.println(">" + e);
			}
	    }
	    String input = "";
	    while (input.compareTo("exit")!=0){
	    	System.out.println("Enter 'n' to show number of continents, 'name' to name planet, 'con' to show continents, 'exit' to quit");
		    try {
			      input = in.readLine();
			    }
			catch(Exception e) {
			      System.out.println(">" + e);
			    }
		    try{
		    	switch (input){
		    	case "n":
		    		System.out.println(plan.getNumbContinents());
		    		break;
		    	case "name":
		    		System.out.println(plan);
		    		break;
		    	case "con":
		    		for(continent elem: plan.getConts()){
		    			System.out.println(elem);
		    		}
		    		break;
		    	case "exit": break;
		    	default: throw new Exception("Bad input.");	    		
		    	}
		    }
		    catch(Exception e) {
			      System.out.println(">" + e);
			    }
	    }
	}

}
