package ck.tyut.first.sort;

import java.util.Arrays;

//分类 -------------- 内部比较排序
// 数据结构 ---------- 数组
// 最差时间复杂度 ---- O(n^2)
// 平均时间复杂度 ---- O(n^2)
// 所需辅助空间 ------ O(1)
// 稳定性 ------------ 稳定
/** 冒泡排序 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 4, 2, 3, 5 };
		sort(arr);
		int[] better = {2, 8, 5, 4, 7, 9, 3 , 6, 1};
		betterSort(better);
	}

	/** 冒泡排序 */
	// 最优时间复杂度 ---- 如果能在内部循环第一次运行时,使用一个旗标来表示有无需要交换的可能,可以把最优时间复杂度降低到O(n)
	public static void sort(int[] arr) {
		int length = arr.length;
		int lastExchangeIndex = 0;
		int sortBorder = length - 1;

		for (int j = 0; j < length; j++) {
			boolean isSorted = true;// 是否有序
			for (int i = 0; i < sortBorder; i++) {
				if (arr[i] > arr[i + 1]) {
					Swap(arr, i, i + 1);

					isSorted = false;
					lastExchangeIndex = i;
				}
			}
			sortBorder = lastExchangeIndex;
			if (isSorted) {// 数组已经有序，直接结束循环
				break;
			}
		}

		System.out.println(Arrays.toString(arr));
	}

	/** 冒泡排序的改进：鸡尾酒排序 */
	// 最优时间复杂度 ---- 如果序列在一开始已经大部分排序过的话,会接近O(n)
	public static void betterSort(int[] arr) {
		
		int left = 0;                            // 初始化边界
	    int right = arr.length - 1;
	    int lastExchangeIndex = 0;
	    while (left < right)
	    {
	    	boolean isSorted = true;
	        for (int i = left; i < right; i++)   // 前半轮,将最大元素放到后面
	        {
	            if (arr[i] > arr[i + 1])
	            {
	                Swap(arr, i, i + 1);
	                isSorted = false;
	                lastExchangeIndex = i;
	            }
	        }
	        right = lastExchangeIndex;
	        if(isSorted){
	        	break;
	        }
	        isSorted = true;
	        for (int i = right; i > left; i--)   // 后半轮,将最小元素放到前面
	        {
	            if (arr[i - 1] > arr[i])
	            {
	                Swap(arr, i - 1, i);
	                isSorted = false;
	                lastExchangeIndex = i;
	            }
	        }
	        left = lastExchangeIndex;
	        if(isSorted){
	        	break;
	        }
	    }
	    System.out.println(Arrays.toString(arr));
	}
	
	static void Swap(int A[], int i, int j)
	{
	    int temp = A[i];
	    A[i] = A[j];
	    A[j] = temp;
	}
}
