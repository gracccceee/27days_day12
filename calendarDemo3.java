package day14_calender;

import java.util.Calendar;
import java.util.Scanner;

public class calendarDemo3 {
	public static void main(String[] args) {
		//��ȡÿһ��Ķ��·��ж�����
		/*����¼���������
		 * ����������Ӧ��������
		 * ��Ϊ����¼��
		 * �·�Ϊ2������Ϊ1��3��1�գ�
		 * ��������ǰ��һ�� 
		 * �����һ�������
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�����");
		int year = sc.nextInt();
		
		Calendar c = Calendar.getInstance();
		c.set(year, 2, 1);
		
		//��ǰ��һ��
		c.add(Calendar.DATE, -1);
		
		System.out.println(year+"�������"+c.get(Calendar.DATE)+"��");
	}
}
