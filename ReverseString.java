package pkg1;



import java.util.Arrays;

public class ReverseString
{
	public static void main(String[] args) 
	{
		
		String s = new String("ram is very good person");
		String[]a=s.split(" ");
		System.out.println(Arrays.toString(a));
		String RString =" ";
			for(int i=0;i<a.length;i++)
			{
				String W =a[i];
				String R = "";
				for(int j=W.length()-1;j>=0;j--)
				{
					R = R + W.charAt(j);
					
				}
				RString = RString +R +" ";
			}
		
		System.out.println(RString);

	}

}
