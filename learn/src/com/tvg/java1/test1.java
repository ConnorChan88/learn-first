package com.tvg.java1;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//输入年月日
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year= scanner.nextInt();
		System.out.println("请输入月份：");
		int month = scanner.nextInt();
		System.out.println("请输入日期：");
		int day = scanner.nextInt();
		scanner.close();
		//判断输入是否正确
		int sumDays =0;
		if (year>0&&month>0&&month<=12&&day>0&&day<=31) {
			if (((month==1||month==3||month==5||month==7||month==8||month==10||month==12)&&day>31)||
					((month==4||month==6||month==9||month==11)&&day>30)||
					(month==2&&(((year%400==0||(year%4==0&&year%100!=0))&&day>29)||
							((!(year%400==0||(year%4==0&&year%100!=0)))&&day>28)))) {
					System.out.println("您输入的日期超出当月日期");
			}else{
				//循环计算天数
				for (int i = 1; i < month; i++) {
					if (i==1||i==3||i==5||i==7||i==8||i==10||i==12) {
						//31天
						sumDays=sumDays+31;
					}else if (i==4||i==6||i==9||i==11) {
						//30天
						sumDays=sumDays+30;
					}else if (year%400==0||(year%4==0&&year%100!=0)) {
						//闰年，29天
						sumDays=sumDays+29;
					}else {
						//平年，28天
						sumDays=sumDays+28;
					}
				}
				sumDays=sumDays+day;
				System.out.println(year+"年"+month+"月"+day+"日是"+year+"年的第"+sumDays+"天");
			}
		}else if (year<=0) {
			System.out.println("您输入的年份有误");
		}else if (month<0||month>12) {
			System.out.println("您输入的月份有误");
		}else if (day<0||day>31) {
			System.out.println("您输入的日期有误");
		}else {
			System.out.println("您输入的年月日不符合要求！！！");
		}
		
	}

}
