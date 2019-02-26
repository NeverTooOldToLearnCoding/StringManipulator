//Create a StringManipulator class that implements the following methods.

public class StringManipulator{

	public String trimAndConcat(String word,String wordtwo){
		String a = word.trim();
		String b = wordtwo.trim();
		return (a+b);
	}

	public Integer getIndexOrNull(String sentence,char character){
		// String a = word;
		int a = sentence.indexOf(character);
		if (a < 0){
			return null;
		} else {
			return a;
		}


	}
	public Integer getIndexOrNull(String word, String wordtwo){
		int a = word.indexOf(wordtwo);
		if (a < 0){
			return null;
		} else {
			return a;
		}
	}

	public String concatSubstring(String word,int number,int numbertwo,String wordtwo){
		return word.substring(number,numbertwo).concat(wordtwo);

	}

//pass coding and o
}