package sample_pckg;

public class sammm {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="one,three,four,two,nine";
		String[] s=str.split(",");
		
		System.out.println(s.length);
		
		for (int i=0;i<s.length;i++)
		
		
		{
			if(s[i].equals("two"))
			{
				System.out.println(s[i]);
			}
		}

	}


}
