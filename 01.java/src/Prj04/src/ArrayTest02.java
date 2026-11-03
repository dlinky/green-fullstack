
public class ArrayTest02 {
	public static void main() {
		double [][] salesTot = new double[][] {
			{100, 101, 90, 80}, // 2022
			{120, 101, 90, 180}, // 2023
			{100, 130, 190, 280}, // 2024
			{100, 101, 290, 80}, // 2025
			{100, 101, 390, 180} // 2026
		};
		
		// 2024년 매출수량의 합
		int sum = 0;
		for (int i=0; i<salesTot[0].length; i++) {
			sum += salesTot[2][i];
		}
		System.out.println(sum);
	}
}
