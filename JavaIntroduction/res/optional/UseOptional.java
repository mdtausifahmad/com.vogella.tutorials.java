Todo todo = new Todo(-1);
Optional<Todo> optTodo = Optional.of(todo);
// get the id of the todo or a default value 
optTodo.ifPresent(t-> System.out.println(t.getId()));