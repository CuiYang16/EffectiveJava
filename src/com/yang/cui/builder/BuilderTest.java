package com.yang.cui.builder;

import java.util.Objects;

/**  
 * @Package com.yang.cui.builder
 * @ClassName: BuilderTest
 * @Description: 调用Builder 
 * @author cuiyang 
 * @date 2019年6月4日  
 */
public class BuilderTest {

	public static void main(String[] args) {
		NutritionFacts build = new NutritionFacts.Builder(100, 2).calories(30).carbohydrate(222).build();
		System.out.println(build.toString());
		Integer requireNonNull = Objects.requireNonNull(build.getCarbohydrate());
		System.out.println(requireNonNull);
	}
}
