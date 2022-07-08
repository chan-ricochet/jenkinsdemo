public class Calculator
{
	public void add(int a, int b)
	{
	System.out.println("Addition:"+(a+b));
	}

	public void sub(int a, int b)
	{
	System.out.println("Subtraction:"+(a-b));
	}

	public void mul(int a, int b)
	{
	System.out.println("Multiplication:"+(a*b));
	}

	public void div(int a,int b)
	{
	System.out.println("Division:"+(a/b));
	}

	public static void main(String[] args)
	{
	Calculator c1=new Calculator();
	c1.add(12,16);
	c1.add(20,43);
	c1.sub(13,34);
	c1.mul(34,12);
	c1.div(12,4);
	c1.div(34,10);
	}

}

