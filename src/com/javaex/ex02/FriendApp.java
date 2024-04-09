package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		// 스캐너에서 친구정보입력
		// 이름 핸드폰 학교 > ''으로 구분된 데이터
		// 3명 입력 Array.list

		List<Friend> rFri = new ArrayList<Friend>();
		Scanner sc = new Scanner(System.in);

		System.out.println("친구를 3명 등록해 주세요");

		for (int i = 0; i <= 3; i++) {
			String line = sc.nextLine(); // 한줄입력
			String[] data = line.split(" "); // 공백으로부터 분활

			// friend객체 생성
			Friend friend = new Friend(data[0], data[1], data[2]);
			// 리스트 추가
			rFri.add(friend);
		}

		// 친구정보 출력
		Iterator<Friend> it = rFri.iterator();
		while (it.hasNext()) {
			Friend itm = it.next();
			itm.showInfo();
		}
		sc.close();
	}
//    	String f = sc.next();
//    	String h1 = sc.next();
//    	String s1 = sc.next();
//    	Friend f1 = new Friend(f,h1,s1);
//    	
//    	String f2 = sc.next();
//    	String h2 = sc.next();
//    	String s2 = sc.next();
//    	Friend f3 = new Friend(f2,h2,s2);
//    	
//    	String f4 = sc.next();
//    	String h3 = sc.next();
//    	String s3 = sc.next();
//    	Friend f5 = new Friend(f4,h3,s3);

}
