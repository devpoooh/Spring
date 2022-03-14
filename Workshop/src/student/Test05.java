package student;

public class Test05 {
	public static void main(String[] args) {
		Student st1 = new Student("Kim",100,90,95,89);
		Student st2 = new Student("Lee",60,70,99,98);
		Student st3 = new Student("Park",68,86,60,40);
		
		System.out.println(st1.getEng());
		System.out.printf("%s 평균: %.1f 학점: %s학점\n",st1.getName(),st1.getAvg(),st1.getGrade());
		System.out.printf("%s 평균: %.1f 학점: %s학점\n",st2.getName(),st2.getAvg(),st2.getGrade());
		System.out.printf("%s 평균: %.1f 학점: %s학점\n",st3.getName(),st3.getAvg(),st3.getGrade());
	}
}
