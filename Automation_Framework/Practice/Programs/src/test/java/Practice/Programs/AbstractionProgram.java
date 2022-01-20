package Practice.Programs;

public abstract class AbstractionProgram {
	
	// Hiding the implementation and we only see the external features.
	
	// Abstract method that should be in Abstract class only
	// Abstrct class contains normal methods and abstract method.
	abstract void method1();
	
	
	void method2()
	{
		System.out.println("I am a normL method");
	}

}
