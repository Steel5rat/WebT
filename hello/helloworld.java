import java.io.IOException;
import java.util.ArrayList;


public class helloworld {
	public static void main(String[] args) {
		int max=0,min=0;
		String temp="";
		byte[] buf=new byte[15];//();
		System.out.println("Vvedite interval nomerov kreditnoy karty");
		try{
			max=System.in.read(buf);
			/*for(int i=0;i<max-2;i++){
				temp+=(char)buf[i];
			}*/
			int i=0;
			while((char)buf[i]!=' '){
				temp+=(char)buf[i];
				i++;
			}
			min=Integer.decode(temp);
			temp="";
			for(i++;i<max-2;i++){
				temp+=(char)buf[i];
			}
			max=Integer.decode(temp);
		}
		catch (IOException e){
	        System.out.println("Error reading from user");
	    }		
		ArrayList<customer> arr = new ArrayList<customer>();
		arr.add(new customer(1,"Asd","Zzs","Csd",4,90));
		arr.add(new customer(3,"Asd","Lsd","Llsd",14223,986));
		arr.add(new customer(2,"Kkdjn","Hsdlkf","Hsdjb",723,298));
		arr.add(new customer(12,"Hdjfbsd","Mjfs","Djkhfd",28,2178));
		arr.add(new customer(27,"Oskjf","Jskj","Adkjf",214,2179));
		arr.add(new customer(28,"Nskj","Ydns","Idskbhv",971,26422));
		ArrayList<customer> res = new ArrayList<customer>();
		res=customer.listCreditCard(min, max, arr);		
    	for(customer nowproc : res)
    	{
    		System.out.println(nowproc.getCustomer());
    	}	
    	System.out.println();
    	res=customer.listBuyerAlph(arr);
    	for(customer nowproc : res)
    	{
    		System.out.println(nowproc.getCustomer());
    	}
	}
}
