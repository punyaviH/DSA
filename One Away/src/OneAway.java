import java.util.Scanner;

public class OneAway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		outer:for(int i = 0 ; i < n; i++)
		{
			String str1 = s.next();
			String str2 = s.next();
			
			int s1Len = str1.length();
			int s2Len = str2.length();
			String  max,min;
			int counter = 0;
			int j = 0;
			
			if(s1Len > s2Len)
			{
				max = str1;
				min = str2;
			}
			else
			{
				max = str2;
				min = str1;
			}
			
			if(s1Len != s2Len)
			{
				if(max.length()-min.length()==1) {
					for(char c:max.toCharArray()) {
						String ne = max.replaceFirst(c+"","");
						if(ne.equals(min)) {
							System.out.println("TRUE");
							continue outer;
						}
					}
				}
			System.out.println("FALSE");
			
			}
			else
			{
				for(char c : max.toCharArray())
				{
					if(min.charAt(j)!= c)
					{
						counter++;
					}
					j++;
				}
				if(counter > 1)
					System.out.println("FALSE");
				else
					System.out.println("TRUE");
			}
		}
	}

}
