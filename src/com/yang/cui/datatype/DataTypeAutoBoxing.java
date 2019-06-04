package com.yang.cui.datatype;

/**  
 * @Package com.yang.cui.datatype
 * @ClassName: DataTypeDemo
 * @Description: 包装类与基本类型性能比较
 * @author cuiyang 
 * @date 2019年6月4日  
 */
public class DataTypeAutoBoxing {

	/*
	 * 使用Long包装类事时间为8500左右，使用long基本类型时间为880左右
	 * 因为每循环一次都需要创建一个Long实例
	 */
	public static void main(String[] args) {
		Long sum =0L;
		long start = System.currentTimeMillis();
		for (long i = 0; i < Integer.MAX_VALUE; i++) {
			sum += i;
		}
		long end  = System.currentTimeMillis();
		System.out.println(sum);
		System.out.println("包装类型用时："+(end-start));
		long sum2 =0L;
		long start2 = System.currentTimeMillis();
		for (long j = 0; j < Integer.MAX_VALUE; j++) {
			sum2 += j;
		}
		long end2  = System.currentTimeMillis();
		System.out.println(sum2);
		System.out.println("基本类型用时："+(end2-start2));
	}
}
