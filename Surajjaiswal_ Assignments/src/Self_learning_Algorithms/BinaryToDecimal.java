package Self_learning_Algorithms;

public class BinaryToDecimal
{
	public int ConvertToDecimal(String b)
	{
		int conversion =1;
		int result =0;
		
		for(int i=1;i<=b.length();i++)
		{
			if(b.charAt(b.length()-i)=='1')
				result +=conversion;
			conversion *=2;
		}
		return result;
	}

	public static void main(String[] args) 
	{
		BinaryToDecimal bd = new BinaryToDecimal();
		
		System.out.println("cONVERT Binary to decimal :"+bd.ConvertToDecimal("10110"));

	}

}
