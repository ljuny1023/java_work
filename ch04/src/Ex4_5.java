import java.util.Scanner;

class Ex4_5 {
	public static void main(String[] args) { 
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.println("점수를 입력해주세요.>");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();	//화면을 통해 입력받은 점수를 score에 저장
		
		System.out.printf("당신의 점수는 %d입니다.%n", score);
		
		if(score >= 90) {			//score가 90점보다 같거나 크면 A학점(grade)
			grade = 'A';
			if(score >= 98) {		//90점 이상 중에서도 98점 이상은 A+
				opt = '+';
			} else if(score < 94) {	//90점 이상 94점 미만은 A-
				opt = '-';
			}
		} else if (score >= 80) {	
			grade = 'B';
			if(score >= 88) {		//80점 이상 중에서도 88점 이상은 B+
				opt = '+';
			} else if (score < 84) {//80점 이상 84점 미만은 B-
				opt = '-';
			}
		}
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
	}
}