package com.tjoeun.main.chap02;

import com.tjoeun.vo.ProductVO;

public class Main04 {

	public static void main(String[] args) {
		
//		한 회사의 상품목록을 화면에 표시하고자 할 때 
//		ProductVO 라는 클래스를 작성한다면,
//		다음 속성을 클래스의 멤버 변수로 선언해보세요.
//		상품정보 3개를 화면에 표시해보세요.
		
//		제조사 :
//		상품명 :
//		가격 :
//		중량 :
//		제조일 :
		
		ProductVO pr = new ProductVO("S22 Ultra","180만원","200g","2022-03-27");
		
		System.out.println("제조사 : " + ProductVO.getCompany());
		System.out.println("상품명 : " + pr.getName());
		System.out.println("가  격 : " + pr.getPrice());
		System.out.println("중  량 : " + pr.getWeight());
		System.out.println("제조일 : " + pr.getDom());
		
		System.out.println();
		
		ProductVO pr1 = new ProductVO("S22+","150만원","180g","2022-03-20");
		
		System.out.println("제조사 : " + ProductVO.getCompany());
		System.out.println("상품명 : " + pr1.getName());
		System.out.println("가  격 : " + pr1.getPrice());
		System.out.println("중  량 : " + pr1.getWeight());
		System.out.println("제조일 : " + pr1.getDom());
		
		System.out.println();
		
		ProductVO pr2 = new ProductVO("S22","100만원","150g","2022-03-01");
		
		System.out.println("제조사 : " + ProductVO.getCompany());
		System.out.println("상품명 : " + pr2.getName());
		System.out.println("가  격 : " + pr2.getPrice());
		System.out.println("중  량 : " + pr2.getWeight());
		System.out.println("제조일 : " + pr2.getDom());
		
		System.out.println();
		
		ProductVO[] p;
		p = new ProductVO[3];
		
		p[0] = new ProductVO();
		p[1] = new ProductVO();
		p[2] = new ProductVO();
		
		p[0].setName("절대 Java");
		p[0].setPrice("23000");
		p[0].setWeight("200g");
		p[0].setDom("2002-10-21");
		
		p[1].setName("더조은 JSP");
		p[1].setPrice("33000");
		p[1].setWeight("300g");
		p[1].setDom("2002-10-22");
		
		p[2].setName("더조은 스프링");
		p[2].setPrice("43000");
		p[2].setWeight("400g");
		p[2].setDom("2002-10-19");
		
		for(int i=0; i<p.length; i++) {
			System.out.printf("%s %s %s %s %s\n", ProductVO.getCompany(), p[i].getName(), p[i].getPrice(), p[i].getWeight(), p[i].getDom());
		}
		
	}

}
