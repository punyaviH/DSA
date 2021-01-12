import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String str;
		for(int i = 0; i < n; i++)
		{
			str = s.next();
			System.out.println(compression(str));
		}
	}
	static String compression(String s)
	{
		int len = s.length();
		
		int counter = 1;
		String compressed = "";
		char x ;
		//compressed = ""+s.charAt(0);
		int i;
		for(i = 1; i < len; i++)
		{
			x = s.charAt(i-1);		
			if((s.charAt(i)+"").equals(s.charAt(i-1)+""))
			{
				counter++;
				if(i == len-1)
					compressed = compressed + x + counter;
				
			}
			else
			{
				compressed = compressed + x + counter;
				counter = 1;
			}
		}
		System.out.println(compressed);
		if(len > compressed.length())
			return compressed;
		else
			return s;
	}

}
