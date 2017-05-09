package goal2017;

public class Abc_Swap {
static int i=100;
int j=200;
int z;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=10;
int y=20;
Abc_Swap obj= new Abc_Swap();
obj.z=x+y+Abc_Swap.i+obj.j;
System.out.println(x);
System.out.println(y);
System.out.println(Abc_Swap.i);
System.out.println(obj.j);
System.out.println(obj.z);

int k=x;
x=y;
y=k;
System.out.println("New value of x is "+x);
System.out.println("New value of y is "+y);

	}

}
