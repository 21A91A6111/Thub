import java.util.*;
class Buffer
{
	public static void main(String args[])
	{
		StringBuffer name=new StringBuffer("Abhiram");
		System.out.println("StringBuffer="+name);
		name.delete(2,4);
		System.out.println("After deleting the StringBuffer is"+name);
	}
}