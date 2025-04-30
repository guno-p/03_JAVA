package command.todoexample.command;

import command.todoexample.service.Task;
import command.todoexample.service.TaskManager;

import java.util.List;

public class DeleteTaskCommand implements Command{
    private TaskManager taskManager;
    private Task task;

    /**
     * 삭제 커맨드 생성자
     * @param taskManager : 리시버
     * @param index : 삭제 될 일의 인덱스
     */
    public DeleteTaskCommand(TaskManager taskManager, int index) {
        this.taskManager = taskManager;
        
        // 할일 목록 List형태로 얻어오기
        List<Task> tasks = taskManager.getTasksAsList();
        if (index >= 0 && index < tasks.size()) {
            this.task = tasks.get(index);
        }
        else {
            throw new IndexOutOfBoundsException("유효하지 않은 할 일 Index: " + index);
            // catch 안해도 되는 예외
        }
    }

    @Override
    public void execute() {
        taskManager.removeTask(task);
        System.out.println("할 일이 삭제되었습니다.");
    }

    @Override
    public void undo() {
        taskManager.addTask(task);
        System.out.println("할 일 삭제가 취소되었습니다.");

    }
}
