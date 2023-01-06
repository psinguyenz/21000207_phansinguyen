package com.decorator;

import java.util.LinkedList;
import java.util.List;

public class BreadStore {
	private List<Bread> breads;

	public BreadStore() {
		breads = new LinkedList<>();
	}

	/**
	 * Giả sử bánh mỳ được làm không cho một loại gia vị nhiều hơn một lần.
	 * Bắt đầu, tạo ra và cho vào cửa hàng:
	 *  5 bánh mỳ ThickcrustBread chỉ có cheese,
	 *  5 bánh mỳ ThickcrustBread chỉ có olives,
	 *  5 bánh mỳ ThickcrustBread có cả cheese và olives,
	 *  5 bánh mỳ ThincrustBread chỉ có cheese,
	 *  5 bánh mỳ ThincrustBread chỉ có olives,
	 *  5 bánh mỳ ThincrustBread có cả cheese và olives.
	 */
	public void init() {
		 /* TODO */
		Bread thick1 = new ThickcrustBread();
		Bread thick2 = new ThickcrustBread();
		Bread thick3 = new ThickcrustBread();
		Bread thick4 = new ThickcrustBread();
		Bread thick5 = new ThickcrustBread();
		Cheese cheese1 = new Cheese((Bread)thick1);
		Cheese cheese2 = new Cheese((Bread)thick2);
		Cheese cheese3 = new Cheese((Bread)thick3);
		Cheese cheese4 = new Cheese((Bread)thick4);
		Cheese cheese5 = new Cheese((Bread)thick5);
		Bread thick6 = new ThickcrustBread();
		Bread thick7 = new ThickcrustBread();
		Bread thick8 = new ThickcrustBread();
		Bread thick9 = new ThickcrustBread();
		Bread thick10 = new ThickcrustBread();
		Olives olives1 = new Olives((Bread)thick6);
		Olives olives2 = new Olives((Bread)thick7);
		Olives olives3 = new Olives((Bread)thick8);
		Olives olives4 = new Olives((Bread)thick9);
		Olives olives5 = new Olives((Bread)thick10);
		Bread thick11 = new ThickcrustBread();
		Bread thick12 = new ThickcrustBread();
		Bread thick13 = new ThickcrustBread();
		Bread thick14 = new ThickcrustBread();
		Bread thick15 = new ThickcrustBread();
		Cheese cheese11 = new Cheese((Bread)thick11);
		Cheese cheese12 = new Cheese((Bread)thick12);
		Cheese cheese13 = new Cheese((Bread)thick13);
		Cheese cheese14 = new Cheese((Bread)thick14);
		Cheese cheese15 = new Cheese((Bread)thick15);
		Olives olives11 = new Olives((Bread)thick11);
		Olives olives12 = new Olives((Bread)thick12);
		Olives olives13 = new Olives((Bread)thick13);
		Olives olives14 = new Olives((Bread)thick14);
		Olives olives15 = new Olives((Bread)thick15);
	}

	/**
	 * Thêm bánh mỳ vào cửa hàng.
	 */
	public void add(Bread bread) {
		/* TODO */
		breads.add(bread);
	}

	/**
	 * Giả sử cửa hàng bán một cái bánh mỳ nào đó,
	 * Bánh mỳ được lấy ra để bán là bánh mỳ đầu tiên có giá bằng giá
	 *  bánh mỳ yêu cầu.
	 * Nếu còn bánh mỳ để bán thì trả về giá trị true,
	 *  nếu không còn trả về giá trị false.
	 */
	public boolean sell(Bread bread) {
		/* TODO */
		for (int i=0; i<breads.size(); i++) {
			if(breads.get(i).cost() == bread.cost()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * In ra những bánh mỳ còn trong cửa hàng.
	 */
	public void print() {
		/* TODO */
		for (int i=0; i<breads.size(); i++) {
			System.out.println(breads.get(i).toString());
		}
	}

	/**
	 * Sắp xếp các bánh mỳ còn lại theo thứ tự được cho bởi order,
	 * nếu order là true, sắp xếp theo thứ tự tăng dần,
	 * nếu order là false, sắp xếp theo thứ tự giảm dần.
	 * Việc sắp xếp không làm thay đổi thứ tự của bánh mỳ trong cửa hàng.
	 */
	public List<Bread> sort(boolean order) {
		/* TODO */
		List<Bread> bread2 = new LinkedList<>();
		bread2 = breads;
		if(order == true) {
			for(int i=0; i< bread2.size(); i++) {
				for(int j=0; j< bread2.size()-1; j++){
					if(bread2.get(j).cost() > bread2.get(j+1).cost()) {
						Bread temp = bread2.get(j);
						bread2.set(j, bread2.get(j+1));
						bread2.set(j+1, temp);
					}
				}
			}
		} else {
			for(int i=0; i< bread2.size(); i++) {
				for(int j=0; j< bread2.size()-1; j++){
					if(bread2.get(j).cost() < bread2.get(j+1).cost()) {
						Bread temp = bread2.get(j);
						bread2.set(j, bread2.get(j+1));
						bread2.set(j+1, temp);
					}
				}
			}
		}
		return bread2;
	}

	/**
	 * Lọc ra howMany cái bánh mỳ có giá cao nhất hoặc thấp nhất,
	 * nếu order là true thì lọc ra bánh mỳ có giá cao nhất,
	 * nếu order là false thì lọc ra bánh mỳ có giá thấp nhất.
	 */
	public List<Bread> filter(int howMany, boolean order) {
		/* TODO */
		List<Bread> breadout = new LinkedList<>();
		if(order == true){
			BreadStore newbread = new BreadStore();
			List<Bread> breadnew = new LinkedList<>();
			breadnew = newbread.sort(true);
			for (int i=0; i<howMany; i++) {
				breadout.add(breadnew.get(i));
			}
		} else {
			BreadStore newbread = new BreadStore();
			List<Bread> breadnew = new LinkedList<>();
			breadnew = newbread.sort(false);
			for (int i=0; i<howMany; i++) {
				breadout.add(breadnew.get(i));
			}
		}
		return breadout;
	}

	public static void main(String args[]) {
		BreadStore breadStore = new BreadStore();
		breadStore.init();

		/*
		* Sau khi khởi tạo số bánh mỳ cho cửa hàng, viết chương trình demo:
		* - Thêm một số bánh mỳ vào cửa hàng
		* - Bán một số bánh mỳ từ cửa hàng
		* - In ra số bánh mỳ còn lại theo thứ tự giá tăng dần.
		* - In ra nhiều nhất 10 cái bánh mỳ có giá thấp nhất còn trong cửa hàng.
		*/
		/* TODO */

	}
}
