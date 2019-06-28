package day14_calender;

import java.util.Calendar;
import java.util.Scanner;

public class calendarDemo3 {
	public static void main(String[] args) {
		//获取每一年的二月份有多少天
		/*键盘录入任意年份
		 * 设置日历对应的年月日
		 * 年为键盘录入
		 * 月份为2，日期为1（3月1日）
		 * 把日期往前推一天 
		 * 输出这一天的日期
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个年份");
		int year = sc.nextInt();
		
		Calendar c = Calendar.getInstance();
		c.set(year, 2, 1);
		
		//往前推一天
		c.add(Calendar.DATE, -1);
		
		System.out.println(year+"年二月有"+c.get(Calendar.DATE)+"天");
	}
}
