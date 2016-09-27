// subscribe for string messages

@Subscribe
public void getMessage(String s) {
	Toast.makeText(this, s, Toast.LENGTH_LONG).show();
}

//subscribe for TestData messages

@Subscribe
public void getMessage(TestData data) {
	Toast.makeText(getActivity(), data.message, Toast.LENGTH_LONG).show();
}

//requires a registration e.g. in the onCreate method
bus.register(this);