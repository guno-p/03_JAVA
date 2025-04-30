package command.todoexample.service;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task implements Comparable<Task>{
    private int priority;
    private String content;

    @Override
    public String toString() {
        return "[우선순위: " + priority + "]" + content;
    }

    @Override
    public int compareTo(Task other) {
        int priorityCompare = this.priority - other.priority;

        // 양수면 자리바꿈, 음수면 자리 유지
        if (priorityCompare != 0) return priorityCompare;

        // 우선순위 같으면 content 오름 차순으로 정렬
        return this.content.compareTo(other.content);
    }
}
