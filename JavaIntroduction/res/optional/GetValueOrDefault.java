// using a String
String s = "Hello";
Optional<String> maybeS = Optional.of(s);
// get length of the String or -1 as default
int len = maybeS.map(String::length).orElse(-1);

// orElseGet allows to construct an object / value with a Supplier
int calStringlen = maybeS.map(String::length).orElseGet(()-> "Hello".length());