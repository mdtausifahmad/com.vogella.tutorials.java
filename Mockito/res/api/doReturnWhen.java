import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

// this test demonstrates how use doThrow

@Test(expected=IOException.class)
public void testForIOException() {
	// create an configure mock
	OutputStream mockStream = mock(OutputStream.class);
	doThrow(new IOException()).when(mockStream).close();
	
	// use mock
	OutputStreamWriter streamWriter= new OutputStreamWriter(mockStream);
	streamWriter.close();
}