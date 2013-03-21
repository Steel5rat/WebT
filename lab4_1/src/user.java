import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class user {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    String input = "";
	    try {
	      input = in.readLine();
	    }
	    catch(Exception e) {
	      System.out.println(" Cryptotext: " + e);
	    }
	    crypt crypObj = new crypt(input);
	    ArrayList<String> posKeys = crypObj.findKeys();
	    for(String out:posKeys){
	    	System.out.println("Keys xor:\n " + out);
	    }
	    System.out.println("Original keys:\n"+crypObj.getRealKeys());
	}

}
