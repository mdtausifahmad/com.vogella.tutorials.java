@RunWith(MockitoJUnitRunner.class)
public class ArticleManagerTest  {

       @Mock ArticleCalculator calculator;
       @Mock ArticleDatabase database;
       @Most User user;
       
       @Spy private UserProvider userProvider = new ConsumerUserProvider();

       @InjectMocks private ArticleManager manager; #<1>

       @Test public void shouldDoSomething() {
    	   // assume that ArticleManager has a method called initialize which calls a method
    	   // addListener with an instance of ArticleListener
    	   manager.initialize();
    	   
           // validate that addListener was called
    	   verify(database).addListener(any(ArticleListener.class));
       }
}