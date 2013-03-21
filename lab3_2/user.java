import java.io.BufferedReader;
import java.io.InputStreamReader;


public class user {
	public static void main(String[] args) {
		System.out.println("Enter radius, X and Y for center of circle:");
	    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	    String rad="";
	    try {
	      rad = in.readLine();
	    }
	    catch(Exception e) {
	      System.out.println(">" + e);
	    }
	    int radius=0;
	    try{
	    	radius = Integer.decode(rad);
	    }
	    catch(Exception e){
	    	System.out.println("> " + e);
	    }
	    
	    try {
		      rad = in.readLine();
		    }
		    catch(Exception e) {
		      System.out.println(">" + e);
		    }
		    int x=0;
		    try{
		    	x = Integer.decode(rad);
		    }
		    catch(Exception e){
		    	System.out.println("> " + e);
		    }
		try {
			      rad = in.readLine();
			    }
		catch(Exception e) {
			      System.out.println(">" + e);
			    }
		int y=0;
		try{
			    	y = Integer.decode(rad);
			    }
		catch(Exception e){
			    	System.out.println("> " + e);
			    }	
		circle newCircle=null;
		try{
			newCircle = new circle(radius, x, y);
		}
		catch(Exception e){
	    	System.out.println("> " + e);
	    }//init end
		
		String choice=""; //GO
		while (choice.compareTo("exit")!=0){
			System.out.println("Enter 's' to resize, 'r' to set new radius, 'p' to validate point, 'exit'");
			System.out.println(newCircle);
		    try {
			      choice = in.readLine();
			    }
			catch(Exception e) {
			      System.out.println(">" + e);
			    }
		    try{
			    switch (choice){
		    	case "s":
		    		reS(newCircle);
		    		break;
		    	case "r":
		    		rad(newCircle);
		    		break;
		    	case "p":
		    		point(newCircle);
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
	
	private static void reS(circle c){
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String hx="",hy="",bx="",by="";
		System.out.println("Enter top x, y. Enter bot x, y.");
	    try {
	      hx = in.readLine();
	      hy = in.readLine();
	      bx = in.readLine();
	      by = in.readLine();
	    }
	    catch(Exception e) {
	      System.out.println(">" + e);
	    }
	    int a=0,b=0, cc=0,d=0;
	    try{
	    	a = Integer.decode(hx);
	    	b = Integer.decode(hy);
	    	cc = Integer.decode(bx);
	    	d = Integer.decode(by);
	    }
		catch(Exception e){
	    	System.out.println("> " + e);
	    }
	    try{
	    	c.setSize(a, b, cc, d);
	    }
	    catch(Exception e){
	    	System.out.println("> " + e);
	    }
	}
	
	private static void rad(circle c){
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String rad="";
		System.out.println("Enter new radius:");
	    try {
	      rad = in.readLine();
	    }
	    catch(Exception e) {
	      System.out.println(">" + e);
	    }
	    int ra=0;
	    try{
	    	ra = Integer.decode(rad);
	    }
		catch(Exception e){
	    	System.out.println("> " + e);
	    }
	    try{
	    	c.setRadius(ra);
	    }
	    catch(Exception e){
	    	System.out.println("> " + e);
	    }
	}
	
	private static void point(circle c){
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String rad="",bad="";
		System.out.println("Enter x & y:");
	    try {
	      rad = in.readLine();
	    }
	    catch(Exception e) {
	      System.out.println(">" + e);
	    }
	    try {
		      bad = in.readLine();
		    }
		    catch(Exception e) {
		      System.out.println(">" + e);
		    }
		int x=0,y=0;
		try{
	    	x = Integer.decode(rad);
	    	y = Integer.decode(bad);
	    }
		catch(Exception e){
	    	System.out.println("> " + e);
	    }
		if(c.isRightPoint(x, y))
			System.out.println("belong");
		else
			System.out.println("not belong");
	}

}
