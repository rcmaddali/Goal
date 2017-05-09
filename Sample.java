package goal2017;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample obj= new Sample();
		obj.method1(10);
		double c=obj.method2(0, 35.97);
		System.out.println(c);
		boolean b=obj.method3(25.66, 0);
		System.out.println(b);
		String s=obj.method4("test");
		System.out.println(s);
		
	}
	
	void method1(int a)
	{
		
	}
	
	double method2(int a, double c)
	{
		return 35.97;
	}
	
	boolean method3(double k, int p)
	{
		return false;
		
	}
	
	String method4(String s)
	{
		return "Ravi";
		
	}
}

