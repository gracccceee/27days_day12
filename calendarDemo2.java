package day14_calender;

import java.util.Calendar;

public class calendarDemo2 {
	public static void main(String[] args) {
		//public void add(int field,int amount);
		//���ݸ����������ֶκͶ�Ӧ��ʱ�䣬�Ե�ǰ���������в���
		//public final void set(int year,int month,int date);
		//���õ�ǰ������������
		Calendar c = Calendar.getInstance();
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int date= c.get(Calendar.DATE);
		//month��0��ʼ
		System.out.println(year+"-"+(month+1)+"-"+date);
		
		//����ǰ�Ľ���
		c.add(Calendar.YEAR, -3);
		int year2 = c.get(Calendar.YEAR);
		int month2 = c.get(Calendar.MONTH);
		int date2= c.get(Calendar.DATE);
		
		System.out.println(year2+"-"+(month2+1)+"-"+date2);
		
		//������ʮ��ǰ
		c.add(Calendar.YEAR, 5);
		c.add(Calendar.DATE, -10);
		int year3 = c.get(Calendar.YEAR);
		int month3 = c.get(Calendar.MONTH);
		int date3= c.get(Calendar.DATE);
		
		System.out.println(year3+"-"+(month3+1)+"-"+date3);
		
		//����������
		c.set(2020, 8, 21);
		int year4 = c.get(Calendar.YEAR);
		int month4 = c.get(Calendar.MONTH);
		int date4= c.get(Calendar.DATE);
		
		System.out.println(year4+"-"+(month4+1)+"-"+date4);
	}
}
