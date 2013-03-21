
public class depart1 extends department{
	public double getExams(student nowpr){
		exam ex1=new exam1();
		exam ex2=new exam1();
		exam ex3=new exam2();
		return (ex1.getMark(nowpr)+ex2.getMark(nowpr)+ex3.getMark(nowpr))/3.0;
	}
}
