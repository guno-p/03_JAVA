package command.todoexample.command;

import java.util.ArrayDeque;
import java.util.Deque;

public class CommandInvoker {
    private Deque<Command> stack = new ArrayDeque<>();

    // 명령어 입력받고 실행, 스택에 기록 저장
    public void executeCommand(Command command) {
        command.execute();
        stack.push(command); // 실행된 명령어 객체를 Stack에 저장
    }

    // 마지막 명령어 되돌리기
    public void undoLastCommand() {
        if (stack.isEmpty()) {
            System.out.println("취소할 명령어가 없습니다.");
            return; // early return
        }

        Command command = stack.pop();
        command.undo();
    }
}
