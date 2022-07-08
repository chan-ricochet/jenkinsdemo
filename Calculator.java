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

	public static void main(String[] args)
	{
	Calculator c1=new Calculator();
	c1.add(12,16);
	c1.add(20,43);
	c1.sub(13,34);
	}

}

