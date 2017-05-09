package goal2017;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods obj= new Methods();
		Methods.method1();
		obj.method2();
		int b=Methods.method3();
		System.out.println(b);
		double d=obj.method4();
		System.out.println(d);
	}
	static void method1()
	{
		int a=10;
		System.out.println(a);
	}
	
	void method2()
	{
		String s="Ravi";
		System.out.println(s);
	}
	
	static int method3()
	{
		return 20;
	}
	
	double method4()
	{
		return 36.98;
	}

}

