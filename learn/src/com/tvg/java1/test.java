package com.tvg.java1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
//		System.out.println("test success");
		Scanner scanner = new Scanner(System.in);
		List<Map> stuList = new ArrayList<Map>();
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入学生姓名：");
			String stu = scanner.next();
			System.out.println("请输入学生分数：");
			double score = scanner.nextDouble();
			
			Map<String, Object> stu1 = new HashMap<String, Object>();
			stu1.put("name", stu);
			stu1.put("score",score);
			stuList.add(stu1);
		}
		System.out.println(stuList);
//		scanner.close();
		//计算平均分
		double aver = 0;
		double sum = 0;
		for(Map m:stuList) {
			sum = sum +(double)m.get("score");
		}
		aver = sum/stuList.size();
		System.out.println("平均分是："+aver);
		
		//得出最高分
		double tmp =0;
		for (int i = 0; i < stuList.size(); i++) {
			double score1 = (double)stuList.get(i).get("score");
			tmp = Math.max(tmp, score1);
		}
		//最高分获得者姓名
		for (Map m:stuList) {
			double score2 = (double) m.get("score");
			if (score2==tmp) {
				
				System.out.println("第一名姓名："+m.get("name")+"分数是："+tmp);
				
			}
		}
		
		
		
		
	}

}
