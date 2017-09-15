import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {

	public static void main(String[] args) throws ParseException {
		String doj="1996-02-01";
		Date d1=new SimpleDateFormat("YYYY/MM/DD").parse(doj);
		Student studentOne = new Student(1,"David Warnor",d1,50.1);
		System.out.println(studentOne);
		String doj2="1996-08-03";
		Date d2=new SimpleDateFormat("YYYY/MM/DD").parse(doj2);
		Student studentTwo = new Student(1,"David Warnor",d1,50.1);
		System.out.println(studentTwo);
		
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
	}

}
