package AlgoPrograms_Day16_17.AnagramDetection;

public class StringToCharArray {
	
	char[] array;
	
	public StringToCharArray(String str) {
		
		array = new char[str.length()];
		
		for (int i = 0; i < str.length(); i++) 
		{
            array[i] = str.charAt(i);
		}
	}

}
