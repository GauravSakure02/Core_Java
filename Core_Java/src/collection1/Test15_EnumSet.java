package collection1;

import java.util.EnumSet;

enum FoodItem {
	IDLY, DOSA, PURI, VADA, PONGAL, CHAPATI, UPMA
}

public class Test15_EnumSet {
	public static void main(String[] args) {
	
		EnumSet<FoodItem> es1 = EnumSet.noneOf(FoodItem.class);
		EnumSet<FoodItem> es2 = EnumSet.of(FoodItem.PONGAL, FoodItem.DOSA, FoodItem.CHAPATI);
		EnumSet<FoodItem> es3 = EnumSet.copyOf(es2);
		EnumSet<FoodItem> es4 = EnumSet.complementOf(es2);
		EnumSet<FoodItem> es5 = EnumSet.allOf(FoodItem.class);
		EnumSet<FoodItem> es6 = EnumSet.range(FoodItem.DOSA, FoodItem.PONGAL);
		
		System.out.println(es1);
		System.out.println(es2);
		System.out.println(es3);
		System.out.println(es4);
		System.out.println(es5);
		System.out.println(es6);
		
		EnumSet<FoodItem> es7 = EnumSet.noneOf(FoodItem.class);
		es7.add(FoodItem.CHAPATI);
		es7.add(FoodItem.DOSA);
		es7.add(FoodItem.IDLY);
		es7.add(FoodItem.PONGAL);
		es7.add(FoodItem.PURI);
		System.out.println(es7);
		
		es7.add(FoodItem.CHAPATI);
		System.out.println(es7);
	}
}