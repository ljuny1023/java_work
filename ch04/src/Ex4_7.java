class Ex4_7 {
	public static void main(String args[]) {
		int num = 0;
		
		//괄호{} 안의 내용을 5번 반복한다.
		//퀴즈. 1~10사이의 난수를 20개 출력하시오.
		//1,2,3,4,5,6,7,8,9,10
		//퀴즈2. -5~5사이의 난수를 20개 출력하시오.
		//-5~5 = 11개
		for(int i = 1; i <= 20; i++) {
//			System.out.println(Math.random());	//0.0<=x<1.0
//			System.out.println(Math.random()*10);	//0.0<=x<10.0
//			System.out.println((int)(Math.random()*10));//0<=x<10, 0~9
//			System.out.println((int)(Math.random()*10)+1);//1<=x<11, 0~10
			System.out.println((int)(Math.random()*11)-5);//-5<=x<6, 5~-5
		}
	}
}