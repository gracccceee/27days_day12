package day14_calender;

import java.util.Calendar;

public class calenderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar rightNow = Calendar.getInstance();
		
		int year = rightNow.get(Calendar.YEAR);
		int month = rightNow.get(Calendar.MONTH);
		int date= rightNow.get(Calendar.DATE);
		//month´Ó0¿ªÊ¼
		System.out.println(year+"-"+(month+1)+"-"+date);
	}

}
