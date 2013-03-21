import java.util.ArrayList;
import java.util.Random;


public class crypt {
	private String sourceText;
	private String cryptoText;
	private long key1;
	private long key2;
    Random randomGenerator = new Random();
	
	public crypt(String input){
		sourceText=input;
		key1=getRandKey();
		key2=getRandKey();
		cryptoText=cryptText(sourceText, -1);
		System.out.println(" Cryptotext: " + cryptoText);
	}
	
	public String getRealKeys(){
		return ""+key1+", "+key2+"\nxor:"+(key1^key2);
	}
	
	private String cryptText(String input, long key){
		int i=0;
		char[] output= new char[input.length()];
		while(input.length()>(i+2)){ //2, 1, 0
			long block = input.charAt(i)*1000000 + input.charAt(i+1)*1000 + input.charAt(i+2);
			if (key==-1){
				block=cryptBlock1(block);
			}
			else
				block=cryptBlock2(block,key);
			output[i] = (char)((block - block%1000000)/1000000);
			output[i+1] = (char)((block%1000000 - block%1000)/1000);
			output[i+2] = (char)(block%1000);
			i+=3;
		}
		if (input.length()==i+2){
			/*long temp = input.charAt(i)*1000;
			temp = cryptBlock(temp);
			output[i] = (char)((temp%1000000 - temp%1000)/1000);*/
			output[i]=(char)input.charAt(i);
			i++;
		}
		if( input.length()==i+1){
			/*long temp = input.charAt(i);
			temp = cryptBlock(temp);
			output[i] = (char)(temp%1000);*/
			output[i]=(char)input.charAt(i);
		}	
		String out="";
		for (char elem:output){
			out+=elem;
		}
		return out;
	}
	
	private long cryptBlock1(long input){
		input = input ^ key1;
		input = input ^ key2;
		return input;
	}
	
	private long cryptBlock2(long input, long key){
		input = input ^ key;
		return input;
	}
	
	private long getRandKey(){
		
	      return randomGenerator.nextInt(1048576);
	}
	
	public ArrayList<String> findKeys(){
		ArrayList<String> resSource=new ArrayList<String>();
		ArrayList<String> resFinal=new ArrayList<String>();
		for(long i=0;i<1048576;i++){
			resSource.add(cryptText(sourceText, i));
			resFinal.add(cryptText(cryptoText, i));
		}
		long newKey1=0;
		ArrayList<String> result = new ArrayList<>();
		for(String elemS:resSource){
			long newKey2=0;
			for(String elemF:resFinal){
				if (elemS.compareTo(elemF)==0){
					//result.add(newKey1+" "+newKey2);
					long temp = newKey1 ^ newKey2;
					result.add(""+temp);
				}
				if (result.size()!=0) break;
				newKey2++;
			}
			if (result.size()!=0) break;
			newKey1++;
		}
		return result;
	}
}
