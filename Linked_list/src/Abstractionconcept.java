
public class Abstractionconcept {
	public static void main(String[] args) {
	    C obj2=new C();
	    obj2.method1();
	    obj2.method2();
	    obj2.temp(12, 14);
		}

	}
	
	abstract class A
	{
		public void method1()
		{
			System.out.println("Method1");
		}
		public abstract void method2();
		public abstract int temp(int a,int b);
		
	}
      class B extends A
      {
    	  public  void method2()
    	  {
    		  System.out.println("Child class");
    	  }
    	  public int temp(int a,int b)
    	  {
    		  return a+b;
    	  }
    	  public  int sum(int c)
    	  {
    		  return c;
    	  }
    	  
    	  
      }
      class C extends A
      {
    	  public  void method2()
    	  {
    		  System.out.println("Child class C");
    	  }
    	  public int temp(int c,int d)
    	  {
    		  return c+d;
    	  }
      }
	
