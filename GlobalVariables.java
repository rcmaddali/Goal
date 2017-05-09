package goal2017;

public class GlobalVariables {
int a=100;
String s="Ravi";
static int b=200;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
GlobalVariables obj= new GlobalVariables();
System.out.println("This program executes global variables");
System.out.println("Non static global variable a is "+ obj.a);
System.out.println("Non static global variable s is "+ obj.s);
System.out.println("Static global variable b is "+ GlobalVariables.b);
	}

}
