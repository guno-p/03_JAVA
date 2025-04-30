package command.todoexample.command;

import command.todoexample.service.Task;
import command.todoexample.service.TaskManager;

// 할 일 추가 커맨드 객체 - concrete command - 구체 구현 객체
public class AddTaskCommand implements Command {
    private TaskManager taskManager;
    private Task task;

    @Override
    public void execute() {
        taskManager.addTask(task);
        System.out.println("할 일이 추가되었습니다.");
    }

    @Override
    public void undo() {
        taskManager.removeTask(task);
        System.out.println("할 일 추가가 취소되었습니다.");
    }

    public AddTaskCommand(TaskManager taskManager, int priority, String content) {
        this.taskManager = taskManager;
        this.task = new Task(priority, content);
    }
}
