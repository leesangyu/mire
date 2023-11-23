package java_basic;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] label = {"순번","이름","국어","영어","수학","과학","총점","평균"};
		
		String[] name = {"이민호", "이상재", "나재길", "탁재훈"};
		int[] kor = {71,81,91,61};
		int[] eng = {72,82,92,62};
		int[] math = {73,83,93,63};
		int[] scien = {74,84,94,64};
		int[] total = new int[4];
		float[] evg = new float[4];
		
		for (int stuNum=0; stuNum<kor.length; stuNum++) {
			total[stuNum] = kor[stuNum] + eng[stuNum] + math[stuNum] + scien[stuNum];
			evg[stuNum] = (int)((total[stuNum]/4f)*100+0.5f)/100f;
		}
		//출력
		for(int i=0;i<label.length;i++) {
			System.out.print(label[i]+"\t");
		}
		System.out.println();
		for(int stuNum=0; stuNum<kor.length; stuNum++) {
			
			System.out.println(stuNum+"\t"+name[stuNum]+"\t"+kor[stuNum]+"\t"+eng[stuNum]+"\t"+math[stuNum]+"\t"+scien[stuNum]+"\t"+total[stuNum]+"\t"+evg[stuNum]+"\t");
		}
		System.out.println(label[0]+":"+kor[0]); 
		System.out.println(label[1]+":"+eng[0]); 
		System.out.println(label[2]+":"+math[0]); 
		System.out.println(label[3]+":"+scien[0]); 
		System.out.println(label[4]+":"+total[0]); 
		System.out.println(label[5]+":"+evg[0]); 
	 

		
	}

}
