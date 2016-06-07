try {
   mustThrowException(); 
   fail();
} catch (Exception e) {
   // expected
   // could also check for message of exception, etc.
}