import java.util.ArrayList;
public class Palindrome {
	private final int number;
	
	public Palindrome() throws Exception
	{
		this(0);	//for testing initiation
	}
	
	public Palindrome(int number) throws Exception
	{
		this.number=number;
	}

    public ArrayList<Integer> numberIntoArray(int number)			// converts a number into arraylist of integers
    {
	   int len=numberOfDigits(number);
	   ArrayList<Integer> array;
		array = new ArrayList<>();
		for(int j=0;j<len;j++)
		  {
			 array.add(0);
		  }
	   int i=0;
	   while(number>0)
	   {

		  array.set(len-i-1,number%10);
		  number=number/10;
		  i++;
	   }
	   return array;
    }

	public int arrayIntoNumber(ArrayList<Integer> array)			//converts arraylist of integers into number
    {
	   int number=0;
	   while(array.size()!=0)
	   {
		  number=array.get(0)+number*10;
		  array.remove(0);
	   }
	   return number;
    }

	public int numberOfDigits(int number)					// Calculates number of digits in input number
    {
	   int count=0;
	   while(number>0)
	   {
		  number/=10;
		  count++;
	   }

	   return count;
    }

	public int changeDigits(ArrayList<Integer> array)		      // copies digits on left to respective right digits(Mirroring) uses arraylist
	{
		int len=array.size();

		int i=0;
		while(i<=len/2 -1)
		{
			array.set(len-i-1,array.get(i));
			i++;
		}

		return arrayIntoNumber(array);
	}

	public int nextPalindrome (int number) throws Exception {				//main logic
		number=number+1;
		if(number<0)
			throw new Exception("Negative numbers are not palindromic");
		ArrayList<Integer> array=numberIntoArray(number);
		int len=numberOfDigits(number);

		if(len==1)
	   		return number;
	    int mid=len%2==0 ? len/2-1: len/2;
	    int i=mid;
	    while(i>=0)
	    {
			if(array.get(i)==array.get(len-i-1))
				i--;
			else 
			{
				if(array.get(i)<array.get(len-i-1))		//increment of mid
					array.set(mid,array.get(mid)+1);
			
				number= changeDigits(array);
				return number;	
			}
	   }
	return number;
    }
	public int getNumber()
	{
		return number;
	}
	public String toString()
	{
		try {
			return String.valueOf(nextPalindrome(number));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
