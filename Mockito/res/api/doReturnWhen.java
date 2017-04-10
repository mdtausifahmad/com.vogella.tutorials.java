Properties properties = new Properties();

Properties spyProperties = spy(properties);

doReturn(“42”).when(spyProperties).get(”shoeSize”);

String value = spyProperties.get(”shoeSize”);

assertEquals(”42”, value);