import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@Rule
public final ExpectedException exceptionRule = ExpectedException.none();

//this test demonstrates how use doThrow

@Test
public void testForIOException() throws IOException {
        // create an configure mock
        OutputStream mockStream = mock(OutputStream.class);
        doThrow(new IOException()).when(mockStream).close();

        // use mock
        OutputStreamWriter streamWriter= new OutputStreamWriter(mockStream);
        exceptionRule.expect(IOException.class);
        streamWriter.close();
}