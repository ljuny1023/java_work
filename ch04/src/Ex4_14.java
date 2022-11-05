import java.util.*;

class Ex4_14 {
	public static void main(String[] args) { 
		int num = 12345, sum = 0;
		
//		System.out.println(12345%10);
		
//		for(num=12345;num>0;num = num/10) {
//			System.out.println(num%10);
//			sum += num%10;
//		}
//		System.out.println("각 자리수의 합"+sum);
		
		while(num>0) {
			sum += num%10;
			System.out.println("sum="+sum+",num%10="+num%10);
			num = num / 10;
		}
		System.out.println("각 자리수의 합:"+sum);
	}
}