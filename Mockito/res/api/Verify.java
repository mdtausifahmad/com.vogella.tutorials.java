import static org.mockito.Mockito.*;

@Test
public void testVerify()  {
	// create and configure mock
	MyClass test = Mockito.mock(MyClass.class);
	when(test.getUniqueId()).thenReturn(43);
	
	
	// call method testing on the mock with parameter 12
	test.testing(12);
	test.getUniqueId();
	test.getUniqueId();
	
	
	// now check if method testing was called with the parameter 12 
	verify(test).testing(Matchers.eq(12));
	
	// was the method called twice?
	verify(test, times(2)).getUniqueId();
	
	// other alternatives for verifiying the number of method calls for a method
	verify(mock, never()).someMethod("never called");
	verify(mock, atLeastOnce()).someMethod("called at least once");
	verify(mock, atLeast(2)).someMethod("called at least twice");
	verify(mock, times(5)).someMethod("called five times");
	verify(mock, atMost(3)).someMethod("called at most 3 times");
}


