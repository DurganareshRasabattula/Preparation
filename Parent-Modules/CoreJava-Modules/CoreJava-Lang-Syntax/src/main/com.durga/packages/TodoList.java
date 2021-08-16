package packages;

import domain.TodoItem;

import java.util.ArrayList;
import java.util.List;

/**
 * @author durga on 8/12/2021
 */
public class TodoList {
    private List<TodoItem> todoItems;

    public void addTodoItem(TodoItem todoItem) {
        if (todoItems == null) {
            todoItems = new ArrayList<TodoItem>();
        }

        todoItems.add(todoItem);
    }

    public List<TodoItem> getTodoItems() {
        return todoItems;
    }

    public void setTodoItems(List<TodoItem> todoItems) {
        this.todoItems = todoItems;
    }
}
