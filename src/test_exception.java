class MyException extends Exception{

}
class MyTool{
	 public static int Parseint(String str) throws MyException{
		 int result = 0;
		 int i;
		 for(i=0;i<str.length();i++) {
			 char ch = str.charAt(i);
			 if(ch>='0'&&ch<='9')
			    result = result*10+ch-'0';
			 else throw new MyException();
	   
	     }
		 return result;
	 }
}
public class test_exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			System.out.println(MyTool.Parseint("345s"));
		 }
		 catch(MyException e){
			  System.out.println("×Ö·û´®×ª»»Òì³£");
			 
			 
		 }
		
	}
}
