
public interface InterfaceConcept {
	public static void main(String [] ar)
	 {
	System.out.println(One.s);
	Three obj = new Three();
	System.out.println(obj.str);

}
}
	
	interface One
	 {
	String s = "#ZERO#";
	 String methodONE();
	 }
	
	 interface Two
	 {
	 String methodTWO();
	 }
	
	 class Three implements One, Two
	 {
	 String str;
	
	 Three()
	 {
	 str = s + methodONE() + methodTWO();
	 }
	
	 public String methodONE()
	 {
	 return "#ONE#";
	 }
	
	 public String methodTWO()
	 {
 return "#TWO#";
	 }
	 }
	 
