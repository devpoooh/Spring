package student;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int sci;
	
	Student(){
		
	}
	
	Student(String name, int korean, int english, int math, int science){
		this.name=name;
		this.kor=korean;
		this.eng=english;
		this.mat=math;
		this.sci=science;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getSci() {
		return sci;
	}

	public void setSci(int sci) {
		this.sci = sci;
	}

	public double getAvg(){
		
		return (double)(kor+eng+mat+sci)/4.0;
	}
	
	public String getGrade() {
		double avg = getAvg();
		
		if(avg>=90) {
			return "A";
		}else if(avg>=70) {
			return "B";
		}else if(avg>=50) {
			return "C";
		}else if(avg>=30) {
			return "D";
		}else {
			return "F";
		}
	}

	@Override
	public String toString() {
		return name+" 평균: "+getAvg()+"학점: "+getGrade()+"학점";
	}
	
	
}
