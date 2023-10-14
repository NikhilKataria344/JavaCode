package fall2023;

public class Construct {
	int marks;
	String course;

	Construct()
	{
		System.out.println("Example for constructor");
		
	}
	Construct(int a,String b)
	{
System.out.println("age os "+ a);
System.out.println("name is "+b);

	}
	Construct(String a)
	{
		course=a;
		System.out.println("course is "+course);
		
	}
	Construct(String a , int marks)
	{
		course=a;
		System.out.println("Course is "+ course);
		System.out.println("marks are "+ marks);
		
	}
	public static void main(String[] args) {
		Construct r=new Construct();
		Construct z=new Construct(20,"Joe");
		Construct y=new Construct("java");
		Construct t=new Construct("java",50);

			}

}
