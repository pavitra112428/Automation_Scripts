package day27;

public class implicitweight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="pavithra yadav";
		
		String[] ch=s.split(" ");
		
		int i=0;
		
		for(String s1:ch) {
			
			System.out.println(s1+" "+i++);
			
			
		}
		
		
		/*
		 * for(int i=0;i<ch.length;i++) {
		 * 
		 * System.out.println(ch[i]+"->"+i); }
		 */
	}

}
