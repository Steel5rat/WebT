import java.util.ArrayList;
import java.util.Collections;

public class customer implements Comparable{
    private int id;
    private String fam;
    private String name;
    private String secname;
    private long cardnumber;
    private long banknumber;
    
    public customer(int tid,String tfam,String tname,String tsecname,long tcardnumber,long tbanknumber){
    	id=tid;
    	fam=tfam;
    	name=tname;
    	secname=tsecname;
    	cardnumber=tcardnumber;
    	banknumber=tbanknumber;
    }  
    public customer(customer input){
    	id=input.id;
    	fam=input.fam;
    	name=input.name;
    	secname=input.secname;
    	cardnumber=input.cardnumber;
    	banknumber=input.banknumber;
    }
    public customer(){
    	id=0;
    	fam="";
    	name="";
    	secname="";
    	cardnumber=0;
    	banknumber=0;
    }
    
    //SET'S:
    public void setId(int tId){
    	this.id=tId;
    }
    public void setName(String tFam,String tName,String tSecname){
    	this.fam=tFam;
    	this.name=tName;
    	this.secname=tSecname;
    }
    public void setCard(long tcard){
    	this.cardnumber=tcard;
    }
    public void setBank(long tbank){
    	this.banknumber=tbank;
    }
    
    public String getCustomer(){
    	String result="";
    	result+=Integer.toString(id)+" "+fam+" "+name+" "+secname+" ";
    	result+=Long.toString(cardnumber)+" "+Long.toString(banknumber);
    	return result;
    }
    
    public String toString(){
    	String result="";
    	result+=Integer.toString(id)+" "+fam+" "+name+" "+secname+" ";
    	result+=Long.toString(cardnumber)+" "+Long.toString(banknumber);
    	return result;
    }
    
    public static ArrayList<customer> listCreditCard(int min, int max,ArrayList<customer> input){
    	ArrayList<customer> result=new ArrayList<customer>();
    	for(customer nowproc : input)
    	{
    	  if((nowproc.cardnumber<=max)&&(nowproc.cardnumber>=min))
    		  result.add(new customer(nowproc));
    	}
    	return result;
    }
    
    public int compareTo(Object otherPers){      
        customer tempPerson = (customer)otherPers;      
        if( this.fam.compareTo(tempPerson.fam)!=0)
        	return this.fam.compareTo(tempPerson.fam);
        else
        {	
        	if( this.name.compareTo(tempPerson.name)!=0)
        		return this.name.compareTo(tempPerson.name);
        	else
        	{
        		return this.secname.compareTo(tempPerson.secname);
        	}
        }
               /*
		if(this.getPrice() > tempCar.getPrice()){
            return 1;
        }else if(this.getPrice() < tempCar.getPrice()){
            return -1;
        }else{
            return 0;
        }
         */
    }
    
    public static ArrayList<customer> listBuyerAlph(ArrayList<customer> input){ 
    	ArrayList<customer> result=new ArrayList<customer>(input);
    	Collections.sort(result);
    	return result;
    }
}
