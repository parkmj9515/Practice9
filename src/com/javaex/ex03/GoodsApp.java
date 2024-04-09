package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	//	리스트선언
    	List<Goods> lGoods = new ArrayList<>();
    	
    	Scanner sc = new Scanner(System.in);
    	int countOfGoods = 0;
    	System.out.println("상품을 입력해 주세요(종료q)");
    		// 	스캐너로부터 상품정보 입력
    	while(true) {
    		String line = sc.nextLine();	//	한줄입력
  
    		//	q면 종료,
    		if(line.equals("q")) {
    			System.out.println("[입력 완료]");
    			System.out.println("-----------------------------");
    			break;
    		}
    		//	상품명(String),가격(int),갯수(int)
   		 	//	콤마(,)를 기준으로 분할하여 Goods 객체 생성
    		 String[] data = line.split(",");
    		 String name = data[0].trim();	//	공백제거 상품명
    		 int price = Integer.parseInt(data[1].trim());
    		 int count = Integer.parseInt(data[2].trim());
    		 
    		 //	Goods 객체 생성
    		 Goods goods = new Goods(name,price,count);
    		//	리스트에 저장
    		 lGoods.add(goods);
    	}
    	
    	//	결과 출력(상품리스트 전부 출력, 상품의 갯수를 집계하여 출력)
    	//	상품 리스트
    	Iterator<Goods> it = lGoods.iterator();
    	while(it.hasNext()) {
    		Goods itm = it.next();
    		countOfGoods += itm.getCount();	//	상품 갯수홥산
    		itm.showInfo();	//	정보출력
    	}
    	System.out.println("모든 상품의 개수는: "+countOfGoods);
    	
    	sc.close();
    	
    }
}