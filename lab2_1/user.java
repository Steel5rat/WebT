
public class user {

	/*Система  Вступительные экзамены.  Абитуриент  регистрируется на Факультет, сдает Экзамены. 
	 * Преподаватель выставляет Оценку. Система подсчитывает средний балл и определяет Абитуриентов, 
	 * зачисленных в учебное заведение. 
	 */
	public static void main(String[] args) {
		/*department temp = new depart1();
		student aa=new student("sfsf");
		System.out.println(String.valueOf(temp.getExams(aa)));*/
		archive library = new archive();
		department temp = new depart1();
		student n1=new student("Zzdknfdj");
		n1.setDepartment(temp);
		n1.registrInArchive(library);
		
		temp = new depart1();
		student n2=new student("Kskdnf");
		n2.setDepartment(temp);
		n2.registrInArchive(library);
		
		temp = new depart2();
		student n3=new student("Nksdb");
		n3.setDepartment(temp);
		n3.registrInArchive(library);
		
		temp = new depart2();
		student n4=new student("Zzvbud");
		n4.setDepartment(temp);
		n4.registrInArchive(library);
		
		temp = new depart1();
		student n5=new student("Zavbud");
		n5.setDepartment(temp);
		n5.registrInArchive(library);
		
		temp = new depart1();
		student n6=new student("Zzvbud");
		n6.setDepartment(temp);
		n6.registrInArchive(library);
		
		library.printInfo();
	}

}
