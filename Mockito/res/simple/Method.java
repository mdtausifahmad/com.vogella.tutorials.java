public static Intent createQuery(Context context, String query, String value) {
	// Reuse MainActivity for simplification
    Intent i = new Intent(context, MainActivity.class);
    i.putExtra("QUERY", query);
    i.putExtra("VALUE", value);
    return i;
}