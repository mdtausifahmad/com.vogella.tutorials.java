
switch (expression) {
	case constant1:
		command;
		break; // will prevent that the other cases or also executed
	case constant2:
		command;
		break;
		...
	default:
}

// Example:

switch (cat.getLevel()) {
	case 0:
		return true;
	case 1:
		if (cat.getLevel() == 1) {
			if (cat.getName().equalsIgnoreCase(req.getCategory())) {
				return true;
			}
		}
	case 2:
		if (cat.getName().equalsIgnoreCase(req.getSubCategory())) {
			return true;
		}
}

// you can also use the same logic for different constants

	public static void main(String[] args) {
		for (int i = 0; i < 6; i++) {
			switch (i) {
			case 1:
			case 5:
				System.out.println("Hello");
				break;
			default:
				System.out.println("Default");
				break;
			}
		}
	}

}
