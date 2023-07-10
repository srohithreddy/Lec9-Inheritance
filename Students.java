package coreJava;

public class Students {

	int rollNo;//Camel casing
	String name;
	public static void main(String[]args)
	{
		Students s1 =new Students();
		Students s2 =new Students();
		Students s3=new Students();
		s1.name="Rohith";
		s1.rollNo =1;
		s2.name="Reddy";
		s2.rollNo=2;
		s3.name="Chinna";
		s3.rollNo=4;
		
		
		System.out.println(s1.name);
		System.out.println(s1.rollNo);
		
		System.out.println(s2.name);
		System.out.println(s2.rollNo);
		
		System.out.println(s3.name);
		System.out.println(s3.rollNo);
	}	
	

}
