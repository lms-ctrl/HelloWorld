import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance ();
		
		 System.out.println( "Datum: " + cal.get( Calendar.DAY_OF_MONTH ) +
                 "." + (cal.get( Calendar.MONTH ) + 1 ) +
                 "." + cal.get( Calendar.YEAR ) );

System.out.println( "Uhrzeit: " + cal.get( Calendar.HOUR_OF_DAY ) + ":" +
                 cal.get( Calendar.MINUTE ) + ":" +
                 cal.get( Calendar.SECOND ));

	

		GregorianCalendar a = new GregorianCalendar(2019, 8,23);
		GregorianCalendar b = new GregorianCalendar(2019, 8,29);
		System.out.println(b.DAY_OF_WEEK);
		if (a.before(b)) {
			System.out.println("a ist älter als b");
			int c = b.get(Calendar.DAY_OF_YEAR)-a.get(Calendar.DAY_OF_YEAR);
			System.out.println(c);
		}
		
		
	}

}
