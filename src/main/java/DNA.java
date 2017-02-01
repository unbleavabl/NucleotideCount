import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

public class DNA {
	String dna;
	String validn="ACGT";
	public DNA(String str){
		dna=str;
	}
	public int count(char c){
		int count=0;
		if(validn.indexOf(c)<0){
			throw new IllegalArgumentException();
		}

		for(int i=0;i<dna.length();i++){
			if(dna.charAt(i)==c)
				count++;
		}
		return count;
	}

	public Map<Character,Integer> nucleotideCounts(){
		Map<Character,Integer> newMap = new HashMap<Character,Integer>();
		newMap.put('A',count('A'));
		newMap.put('C',count('C'));
		newMap.put('G',count('G'));
		newMap.put('T',count('T'));

		return newMap;
	}
}

