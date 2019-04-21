class MyTool{
	 public static int Parseint(String str) {
		 int result = 0;
		 int i;
		 for(i=0;i<str.length();i++) {
			 char ch = str.charAt(i);
			 result = result*10+ch-'0';
	   
	     }
		 return result;
	 }
}
public class test_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println(MyTool.Parseint("345"));
		
		
	}
}
