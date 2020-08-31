import java.util.Calendar;

import javax.swing.JOptionPane;

public class DatumTest {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance ();
		ausgeben(cal);
		
		String s = JOptionPane.showInputDialog("Bitte Zahl der Tage eingeben, die noch zum Datum dazugerechnet werden sollen");
		int i = Integer.parseInt(s);

		cal.add(cal.DATE, i);
		ausgeben(cal);
		
	
	}
		
		private static void ausgeben(Calendar cal) {
			System.out.println( cal.get( Calendar.DAY_OF_MONTH ) +
	                "." + (cal.get( Calendar.MONTH ) + 1 ) +
	                "." + cal.get( Calendar.YEAR ) );
			int e = cal.get(Calendar.DAY_OF_WEEK);
			
			switch (e) {
			case 1:
				System.out.println("Sonntag ist Frei  ");
				break;
			case 2:
				System.out.println("Montag");
				break;
			case 3:
				System.out.println("Dienstag");
				break;
			case 4:
				System.out.println("Mittwoch");
				break;
			case 5:
				System.out.println("Donnerstag");
				break;
			case 6:
				System.out.println("Freitag");
				break;
			case 7:
				System.out.println("Samstag");
				break;
		}
			
		}
		
			
		

}