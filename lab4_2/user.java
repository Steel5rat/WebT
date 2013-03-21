import java.io.IOException;
import java.util.Random;


public class user {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Vvedite kol-vo elementov");
		String mark="";
		try{
			int buf=0;
			while((char)buf!='\n') {
				buf=System.in.read();
				if((buf<=(int)'9')&&(buf>=(int)'0')) mark+=(char)buf;
			}
			//System.out.println(mark);
		}
		catch (IOException e){
	        System.out.println("Error reading from user");
	    }
		int numb = Integer.parseInt(mark);
		listBlackBox arr = new listBlackBox();
		Random randomGenerator = new Random();
		for(int i=0;i<numb;i++){
			arr.add(randomGenerator.nextInt(100));
		}
		System.out.println("Vvedite K");
		mark="";
		try{
			int buf=0;
			while((char)buf!='\n') {
				buf=System.in.read();
				if((buf<=(int)'9')&&(buf>=(int)'0')) mark+=(char)buf;
			}
			//System.out.println(mark);
		}
		catch (IOException e){
	        System.out.println("Error reading from user");
	    }
		int k = Integer.parseInt(mark);
		arr.setK(k);
		System.out.println(arr.getKElem());
		System.out.println(arr.toString());
	}

}
