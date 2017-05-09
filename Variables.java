package goal2017;

public class Variables {
	static int a=10;
	static int b=20;
	int c=30;
	int d=40;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		int a=50;
		int c=60;
		int x=70;
		Variables obj= new Variables();
		System.out.println("Static variable a = "+ Variables.a);
		System.out.println("Static variable b = "+ Variables.b);
		System.out.println("Non-static variable c = "+ obj.c);
		System.out.println("Non-static variable d = "+ obj.d);
		System.out.println(a);
		System.out.println(c);
		System.out.println(x);
		
		
	}

}
