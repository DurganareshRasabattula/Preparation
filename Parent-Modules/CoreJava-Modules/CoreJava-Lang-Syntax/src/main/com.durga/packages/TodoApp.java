package packages;

import domain.TodoItem;

import java.time.LocalDate;

/**
 * @author durga on 8/12/2021
 */
public class TodoApp {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        for (int i = 0; i < 3; i++) {
            TodoItem item = new TodoItem();
            item.setId(Long.valueOf(i));
            item.setDescription("Todo item " + (i + 1));
            item.setDueDate(LocalDate.now().plusDays(i + 1));
            todoList.addTodoItem(item);
        }

        todoList.getTodoItems().forEach((TodoItem todoItem) -> System.out.println(todoItem.toString()));
    }
}
