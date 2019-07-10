
public class Calculator {
	
	
	public static void main(String args[])
	{
		System.out.println(new Calculator().action("1",1,2));
		System.out.println(new Calculator().action("2",1,2));
		System.out.println(new Calculator().action("3",1,2));
		System.out.println(new Calculator().action("5",1,2));
	}
	
	private double action(String ch,double n1,double n2)
	{
		if(ch.equals("1"))
		{
			return new Add().evaluate(n1, n2);
		}
		else if(ch.equals("2"))
		{
			return new Subtract().evaluate(n1, n2);
		}
		else if(ch.equals("3"))
		{
			return new Multiply().evaluate(n1, n2);
		}
		else
		{
			return new Divide().evaluate(n1, n2);
		}
	}

}
