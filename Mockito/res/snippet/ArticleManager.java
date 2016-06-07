// Mockito can construct this class via constructor
public class ArticleManager {
 	ArticleManager(ArticleCalculator calculator, ArticleDatabase database) {
	}
}

// Mockito can also perform  method injection
public class ArticleManager {
	ArticleManager() {  }
	void setDatabase(ArticleDatabase database) { }
	void setCalculator(ArticleCalculator calculator) { }
}

// Mockito can also perform  field injection
public class ArticleManager {

    private ArticleDatabase database;
    private ArticleCalculator calculator;
}

	
 	