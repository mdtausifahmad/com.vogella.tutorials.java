@RunWith(MockitoJUnitRunner.class)
public class ArticleManagerTest  {

       @Mock ArticleCalculator calculator;
       @Mock ArticleDatabase database;
       @Mock User user;
       
       @Spy private UserProvider userProvider = new ConsumerUserProvider();

       @InjectMocks private ArticleManager manager; #<1>

       @Test public void shouldDoSomething() {
    	   // calls addListener with an instance of ArticleListener
    	   manager.initialize();
    	   
           // validate that addListener was called
    	   verify(database).addListener(any(ArticleListener.class));
       }
}