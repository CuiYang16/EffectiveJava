package com.yang.cui.builder;

/**
 * @Package com.yang.cui.builder
 * @ClassName: NutritionFacts
 * @Description: 建造者模式创建对象赋值
 * @author cuiyang
 * @date 2019年6月4日
 */
public class NutritionFacts {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sidium;
	private final Integer carbohydrate;

	// 静态内部类，只能访问外部静态变量和方法
	// 内部类 可无限制访问外部类
	public static class Builder {
		private final int servingSize;
		private final int servings;

		private int calories = 0;
		private int fat = 0;
		private int sidium = 0;
		private Integer carbohydrate = 0;

		public Builder(int servingSize, int servings) {

			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(int val) {
			// 赋值，类似set方法，this可加可不加
			this.calories = val;
			// 返回builder对象
			return this;
		}

		public Builder fat(int val) {
			fat = val;
			return this;
		}

		public Builder sidium(int val) {
			sidium = val;
			return this;
		}

		public Builder carbohydrate(Integer val) {
			carbohydrate = val;
			return this;
		}

		// 返回外部类实例
		public NutritionFacts build() {
			// 此处this指代Builder对象，相对于调用外部构造方法
			return new NutritionFacts(this);
		}
	}

	public NutritionFacts(Builder builder) {
		this.servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sidium = builder.sidium;
		carbohydrate = builder.carbohydrate;
	}

	public int getServingSize() {
		return servingSize;
	}

	public int getServings() {
		return servings;
	}

	public int getCalories() {
		return calories;
	}

	public int getFat() {
		return fat;
	}

	public int getSidium() {
		return sidium;
	}

	public int getCarbohydrate() {
		return carbohydrate;
	}

	@Override
	public String toString() {
		return "NutritionFacts [servingSize=" + servingSize + ", servings=" + servings + ", calories=" + calories
				+ ", fat=" + fat + ", sidium=" + sidium + ", carbohydrate=" + carbohydrate + "]";
	}

}
