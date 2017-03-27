package palindromy;

public class main {
public static void main(String[] args){
	String[] temp = new String[5];
	temp[0] = "k";
	temp[1] = "a";
	temp[2] = "j"; 
	temp[3] = "a";
	temp[4] = "a";
	
	boolean flaga=true;
	
		for(int i =0;i<temp.length;i++ )
		{
			if(temp[i].equals(temp[(temp.length-1)-i]))
			{
				
			}	
			else
			{
				flaga=false;
				break;
			}
			
		}
	


		if(flaga)
		{
			System.out.println("Wyraz jest palindromem.");
		}
		else
		{
			System.out.println("wyraz nie jest palindromem.");
		}
	
	
	
	
	
	
}
}
