package AlgoPrograms_Day16_17.AnagramDetection;

public class AnagramCheck {
	
	public void anagramChecker(char[] charArray1, char[] charArray2) {
		
		int a=0;
		int b=1;
		for(int i=0; i<charArray1.length; i++)
		{
			for(int j=0; j<charArray2.length; j++) 
			{
				if(charArray1[i] == charArray2[j]) {
					a=1;
					break;
				}
				else {
					a=0;
				}
			}
			if(a==0) {
				b=0;
				break;
			}
			
		}
		
		if(b==1)
			System.out.println("Yes, its a Anagram");
		else
			System.out.println("No");
	}

}
