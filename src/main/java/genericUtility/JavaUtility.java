package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * This is a utility class which contains all Java related generic functions
 * @author rajat burnwal
 * @version 8.28.24
 */
public class JavaUtility {

	/**
	 * This is a generic method to generate random number
	 * @param bound
	 * @return
	 */
	public int generateRandomNumber(int bound)
	{
		Random r=new Random();
		int num=r.nextInt(bound);
		return num;
	}
	
	/**
	 * This is a generic method to handle calendar
	 * @param formatType
	 * @return
	 */
	public String getDateAndTime(String formatType)
	{
		Calendar cal=Calendar.getInstance();
		Date d=cal.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat(formatType);
		String dateTimeStamp=sdf.format(d);
		return dateTimeStamp;
	}
}
