
public class Output {
	public void print(Student[] array, int count) {
		this.printLabel();
		for (int i = 0; i < count; i++) {
			System.out.println(array[i]);  // array[i].toString();
		}
	}
	private void printLabel() {
		System.out.println("<<<<센텀대학교 성적관리프로그램>>>>");
		System.out.println("학번\t 이름\t 국어\t 영어\t 수학\t 전산\t 총점\t 평균\t 평점\t");
		System.out.println("----------------------------------------------------------------------------");
	}
	
}