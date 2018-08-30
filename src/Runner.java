
public class Runner {

	public static void main(String[] args) {
		
		String target = "call llama man zxcz";
		String[] targetArray = target.split(" ");
		String output = targetArray[0];
		for(int i = 0; i < targetArray.length-1; i++) {
			for(int j=0;j<=getLength(targetArray[i],targetArray[i+1])-1;j++) {
				if(targetArray[i].substring(targetArray[i].length()-(j+1)).equals((targetArray[i+1].substring(0,j+1)))) {
					output+= targetArray[i+1].substring(j+1, targetArray[i+1].length());
					i++;
					break;
					
				}
			
			}
			output += " "+targetArray[i+1];
		}
		System.out.println(output);
		

	}
	public static int getLength(String a, String b) {
		if(a.length() < b.length()) {
			return a.length();
		}
		else {
			return b.length();
		}
	}

}
