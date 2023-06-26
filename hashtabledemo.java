package hashmapdemo;
import java.util.Vector;
import java.util.Enumeration;

public class hashtabledemo {

	   public static void main(String args[]) {
	      Enumeration days;
	      Vector dayNames = new Vector();
	      
	      dayNames.add("Sunday");
	      dayNames.add("Monday");
	      dayNames.add("Tuesday");
	      dayNames.add("Wednesday");
	      dayNames.add("Thursday");
	      dayNames.add("Friday");
	      dayNames.add("Saturday");
	      days = dayNames.elements(); // click 'show Declaration' //Returns an enumeration of the components of this vector. 
	                                         //The returned Enumeration object will generate all items inthis vector.
	      while (days.hasMoreElements()) {
	         System.out.println(days.nextElement()); 
	        
	      }
	   }
	}
