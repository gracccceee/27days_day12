package day14_calender;

import java.util.Calendar;

public class calendarDemo2 {
	public static void main(String[] args) {
		//public void add(int field,int amount);
		//根据给定的日历字段和对应的时间，对当前的日历进行操作
		//public final void set(int year,int month,int date);
		//设置当前的日历年月日
		Calendar c = Calendar.getInstance();
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int date= c.get(Calendar.DATE);
		//month从0开始
		System.out.println(year+"-"+(month+1)+"-"+date);
		
		//三年前的今天
		c.add(Calendar.YEAR, -3);
		int year2 = c.get(Calendar.YEAR);
		int month2 = c.get(Calendar.MONTH);
		int date2= c.get(Calendar.DATE);
		
		System.out.println(year2+"-"+(month2+1)+"-"+date2);
		
		//五年后的十天前
		c.add(Calendar.YEAR, 5);
		c.add(Calendar.DATE, -10);
		int year3 = c.get(Calendar.YEAR);
		int month3 = c.get(Calendar.MONTH);
		int date3= c.get(Calendar.DATE);
		
		System.out.println(year3+"-"+(month3+1)+"-"+date3);
		
		//设置年月日
		c.set(2020, 8, 21);
		int year4 = c.get(Calendar.YEAR);
		int month4 = c.get(Calendar.MONTH);
		int date4= c.get(Calendar.DATE);
		
		System.out.println(year4+"-"+(month4+1)+"-"+date4);
	}
}
