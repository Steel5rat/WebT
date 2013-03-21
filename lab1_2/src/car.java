import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class car {
	private int id;
	private String mark;
	private String model;
	private int madeYear;
	private String color;
	private int price;
	private long regNumber;
	
	public car(int tid,String a,String b,int made,String c,int p, long n){
		id=tid;
		mark=a;
		model=b;
		madeYear=made;
		color=c;
		price=p;
		regNumber=n;
	}
	public car(car input){
		id=input.id;
		mark=input.mark;
		model=input.model;
		madeYear=input.madeYear;
		color=input.color;
		price=input.price;
		regNumber=input.regNumber;
	}
	
	public void setId(int tid){
		this.id=tid;
	}
	public void setMark(String m){
		mark=m;
	}
	public void setModel(String m){
		model=m;
	}
	public void setYear(int y){
		madeYear=y;
	}
	public void setColor(String c){
		color=c;
	}
	public void setPrice(int m){
		price=m;
	}
	
	public String getCar(){
    	String result="";
    	result+=Integer.toString(id)+" "+mark+" "+model+" "+Integer.toString(madeYear)+" ";
    	result+=color+" "+Integer.toString(price)+" "+Long.toString(regNumber);
    	return result;
	}
	
	public String toString(){
    	String result="";
    	result+=Integer.toString(id)+" "+mark+" "+model+" "+Integer.toString(madeYear)+" ";
    	result+=color+" "+Integer.toString(price)+" "+Long.toString(regNumber);
    	return result;
	}
	
	public static ArrayList<car> getAllCarsOfMark(String needModel, ArrayList<car> input){
		ArrayList<car> res = new ArrayList<car>();//список автомобилей заданной марки
    	for(car nowproc : input)
    	{
    		if(nowproc.mark.compareTo(needModel)==0)
    				res.add(new car(nowproc));
    	}
		return res;
	}
	
	public static ArrayList<car> getCarsOfAge(String needModel,int age,ArrayList<car> input){
		ArrayList<car> res = new ArrayList<car>();//список автомобилей заданной модели, которые эксплуатируются больше n лет
        DateFormat dateFormat = new SimpleDateFormat("yyyy");
        Date date = new Date();
        int nowyear=Integer.decode(dateFormat.format(date));
		for(car nowproc : input){
    		if((nowproc.model.compareTo(needModel)==0)&&((nowyear-nowproc.madeYear)>age)){
    			res.add(new car(nowproc));
    		}
    	}
		return res;
	}
	
	public static ArrayList<car> getCarsOfPrice(int needYear, int minPrice, ArrayList<car> input){
		ArrayList<car> res = new ArrayList<car>();//список автомобилей заданного года выпуска, цена которых больше указанной
		for(car nowproc : input){
    		if((nowproc.madeYear==needYear)&&(nowproc.price>minPrice))
    				res.add(new car(nowproc));
    	}
		return res;
	}
}
