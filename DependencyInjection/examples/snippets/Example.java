// import statements left out

public class MyPart {
	
	@Inject private Logger logger;
	
	// inject class for database access
	@Inject private DatabaseAccessClass dao;
	
	@Inject
	public void createControls(Composite parent) {
		logger.info("UI will start to build");
		Label label = new Label(parent, SWT.NONE);
		label.setText("Eclipse 4");
		Text text = new Text(parent, SWT.NONE);
		text.setText(dao.getNumber());
	}

}