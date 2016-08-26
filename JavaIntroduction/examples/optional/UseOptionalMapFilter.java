Todo todo = new Todo(-1);
Optional<Todo> optTodo = Optional.of(todo);

// get the summary (trimmed) of todo if the id is higher than 0
Optional<String> map = optTodo.filter(o -> o.getId() > 0).map(o -> o.getSummary().trim());	

// same as above but print it out
optTodo.filter(o -> o.getId() > 0).map(o -> o.getSummary().trim()).ifPresent(System.out::println);