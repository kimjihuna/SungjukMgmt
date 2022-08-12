/*
 * 객체 정령하기 
 * 1. 배열 정령하기
 * 		Arrays.sort() 
 * 		Comparable interface를 재정의해야
 * 2. Collection 정령하기
 * 		Collections.sort()
 * 		Comparator interface를 재정의해야
 * 		Compare() 	
 * 
 * 
 */

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Sort {
	private List<Student> list;

	public void sort() {
		Collections.sort(this.list, new Comparator<Student>() {
			@Override
			public int compare(Student front, Student back) {
				
				return front.getName().compareTo(back.getName());
			}
		});
	}
	
	
	
	
	
	
	
	
//
	public Sort(List<Student> list) {
		this.list = list;
	}
//
//	public void sort() {
//		Collections.sort(this.list, new MyComparator());
//	}
//	
//	class MyComparator implements Comparator<Student>{
//
//		@Override
//		public int compare(Student front, Student back) {
//			
//			return back.getTot() - front.getTot();
//		}
//		
//	}
}
