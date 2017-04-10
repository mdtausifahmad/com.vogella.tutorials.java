import static org.mockito.Mockito.*;

@Test
public void testLinkedListSpyWrong() {
    // Lets mock a LinkedList
    List<String> list = new LinkedList<>();
    List<String> spy = spy(list);

    // this does not work
    // real method is called so spy.get(0)
    // throws IndexOutOfBoundsException (list is still empty)
    when(spy.get(0)).thenReturn("foo");
    
    assertEquals("foo", spy.get(0));
}

@Test
public void testLinkedListSpyCorrect() {
    // Lets mock a LinkedList
    List<String> list = new LinkedList<>();
    List<String> spy = spy(list);
    
    // You have to use doReturn() for stubbing
    doReturn("foo").when(spy).get(0);
    
    assertEquals("foo", spy.get(0));
}


