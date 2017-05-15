package cmps;

public class bus extends car{
	public void grandson(int speed)
	{
	   super.father();
		System.out.println("subcalss 1");
	}
	public void gson()
	{
		this.grandson(10);
		System.out.println("subclass 2");
	}
	public static void main(String args[])
	{
	     bus b=new bus();
	     b.gson();
		
	}

}
