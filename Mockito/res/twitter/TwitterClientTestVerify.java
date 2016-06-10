@Test
public void testSendingTweet() {
	TwitterClient twitterClient = new TwitterClient();

	ITweet iTweet = mock(ITweet.class);

	when(iTweet.getMessage()).thenReturn("Using mockito is great");

	twitterClient.sendTweet(iTweet);

	verify(iTweet, atLeastOnce()).getMessage();
}