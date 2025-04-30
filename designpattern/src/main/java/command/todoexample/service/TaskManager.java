package command.todoexample.service;

import java.util.*;

// 할 일을 관리하는 receiver
public class TaskManager {
    // 추가된 할 일을 우선순위에 따라서 오름차순 정리할 TreeSet 객체
    private TreeSet<Task> tasks = new TreeSet<>();

    /**
     * 할 일 추가
     * @param task
     */
    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("할 일이 추가 되었습니다." + task);
    }

    /**
     * 할 일 삭제
     * @param task
     */
    public void removeTask(Task task) {
        tasks.remove(task);
        System.out.println("할 일이 삭제 되었습니다." + task);
    }

    /**
    * 할 일 목록 출력
    * */
    public void listTasks() {
        System.out.println("\n===== 할 일 목록 =====\n");
        if (tasks.isEmpty()) {
            System.out.println("등록된 할 일이 없습니다.");
            return; // early return
        }

        int idx = 1;
        for (Task task : tasks) {
            System.out.println(idx++ + task.toString());
        }
    }

    /**
     * TreeSet -> ArrayList 로 변환
     * @return 전환된 ArrayList
     */
    public List<Task> getTasksAsList() {
        return new ArrayList<>(tasks);
    }

}
