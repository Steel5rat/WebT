
public class user {

	public static void main(String[] args) {
		archive save = new archive();
		teacher t1 = new teacher1(save);
		teacher t2 = new teacher2(save);
		t1.addCourse("asd");
		t1.addCourse("zxc");
		t1.addCourse("qwe");
		t2.addCourse("asd");
		t2.addCourse("lkj");
		student st1 = new student("theBest");
		student st2 = new student("koshi"); 
		student st3 = new student("newton");
		student st4 = new student("einshtein");
		student st5 = new student("themin");
		st1.setCourse("asd", t1);
		st2.setCourse("qwe", t1);
		st3.setCourse("zxc", t1);
		st4.setCourse("lkj", t2);
		st5.setCourse("asd", t2);
		save.printInfo();
	}

}
