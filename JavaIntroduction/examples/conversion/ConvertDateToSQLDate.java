
package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ConvertDateToSQLDate {

private void convertDateToSQL(){
	 SimpleDateFormat template = 
			new SimpleDateFormat("yyyy-MM-dd"); 
		  java.util.Date enddate = 
			new java.util.Date("10/31/99"); 
		  java.sql.Date sqlDate = 
			java.sql.Date.valueOf(
			                template.format(enddate)); 
	 
}
	public static void main(String[] args) {
		ConvertDateToSQLDate date = new ConvertDateToSQLDate();
		date.convertDateToSQL();
	}	 

}
