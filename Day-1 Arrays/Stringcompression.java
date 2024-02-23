
public class Stringcompression {
	
	
	public static void compress(StringBuilder sc) {
		StringBuilder newstr=new StringBuilder("");
		for(int i=0;i<sc.length();i++) {
		Integer count=1;
		while(i<sc.length()-1&& sc.charAt(i)== sc.charAt(i+1)) {
			count++;
			i++;
		}
		
		newstr=newstr.append(sc.charAt(i));
		
		if(count >1) {
			newstr.append(count);
		}
		}
		
		
		System.out.println(newstr);
		
	}

	public static void main(String[] args) {
		StringBuilder sc=new StringBuilder("aaabbbbbccd");
		compress(sc);

	}

}
