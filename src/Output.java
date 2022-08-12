import java.util.List;

public class Output {
	private List<Student> list;
	public void print(List<Student> list) {
		this.printLabel();
		for (Student student : list) {
			System.out.println(student);
		}
	}
	private void printLabel() {
		System.out.println("<<<<센텀대학교 성적관리프로그램>>>>");
		System.out.println("학번\t  이름\t국어\t영어\t수학\t전산\t총점\t평균\t평점\t");
		System.out.println("----------------------------------------------------------------------------");
	}
	
}