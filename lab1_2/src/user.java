import java.io.IOException;
import java.util.ArrayList;

public class user {


	public static void main(String[] args) {		
		ArrayList<car> arr = new ArrayList<car>();
		arr.add(new car(10,"volvo","sedan",1989,"black",2300,1234124));
		arr.add(new car(31,"toyota","sedan",1989,"red",4555,1242144));
		arr.add(new car(123,"toyota","universal",2009,"black",11900,35252235));
		arr.add(new car(521,"lada","sedan",1977,"purple",9999,733262));
		arr.add(new car(51,"samand","universal",2011,"white",2200,23622));
		arr.add(new car(28,"volvo","sedan",1995,"black",7200,6235253));
		String mark="";
		System.out.println("Vvedite marky:");
		try{
			int buf=0;
			while((char)buf!='\n') {
				buf=System.in.read();
				if((buf<=(int)'z')&&(buf>=(int)'a')) mark+=(char)buf;
			}
			//System.out.println(mark);
		}
		catch (IOException e){
	        System.out.println("Error reading from user");
	    }
		ArrayList<car> res = new ArrayList<car>();
		res = car.getAllCarsOfMark(mark, arr);
		for(car nowproc : res){
			System.out.println(nowproc.getCar());
			
    	}
		System.out.println("done");
		System.out.println("Vvedite model i minimalnyi srok ecsplyatacii:");
		String model="";
		int age=0;
		try{
			int buf=0;
			while((char)buf!=' ') {
				buf=System.in.read();
				if((buf<=(int)'z')&&(buf>=(int)'a')) model+=(char)buf;
			}
			String temp="";
			while((char)buf!='\n'){
				buf=System.in.read();
				if((buf<=(int)'9')&&(buf>=(int)'0')) temp+=(char)buf;
			}
			age=Integer.decode(temp);
		}
		catch (IOException e){
	        System.out.println("Error reading from user");
	    }
		res = car.getCarsOfAge(model, age, arr);
		for(car nowproc : res){
			System.out.println(nowproc.getCar());
			
    	}
		System.out.println("done");
		System.out.println("Vvedite god vypyska i minimalnyu ceny:");
		int year=0;
		int price=0;
		try{
			int buf=0;
			String temp="";
			while((char)buf!=' ') {
				buf=System.in.read();
				if((buf<=(int)'9')&&(buf>=(int)'0')) temp+=(char)buf;
			}
			year=Integer.decode(temp);
			temp="";
			while((char)buf!='\n'){
				buf=System.in.read();
				if((buf<=(int)'9')&&(buf>=(int)'0')) temp+=(char)buf;
			}
			price=Integer.decode(temp);
		}
		catch (IOException e){
	        System.out.println("Error reading from user");
	    }
		res = car.getCarsOfPrice(year, price, arr);
		for(car nowproc : res){
			System.out.println(nowproc.getCar());
    	}
		System.out.println("done");

	}

}
