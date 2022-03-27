package com.tjoeun.vo;

//제조사 :
//상품명 :
//가격 :
//중량 :
//제조일 :
public class ProductVO {
	
	private static final String company = "Samsung";
	private String name;
	private String price;
	private String weight;
	private String dom;
	
	public ProductVO() {
		
	}
	
	public ProductVO(String name, String price, String weight, String dom) {
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.dom = dom;
	}

	public static String getCompany() {
		return company;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getDom() {
		return dom;
	}

	public void setDom(String dom) {
		this.dom = dom;
	}
	
}
