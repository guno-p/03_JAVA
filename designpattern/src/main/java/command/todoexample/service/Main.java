package command.todoexample.service;

import command.todoexample.command.AddTaskCommand;
import command.todoexample.command.Command;
import command.todoexample.command.CommandInvoker;
import command.todoexample.command.DeleteTaskCommand;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.regex.Pattern;

import static java.lang.System.exit;

public class Main {
    /*
    * 왜 static 으로 전역에 만들었을까요.
    * main 메서드는 static 이고, static 은 static 멤버만 호출이 가능하기 때문.
    * */

    private static Scanner sc = new Scanner(System.in);

    // Receiver : 실제 작업 수행 객체
    private static TaskManager taskManager = new TaskManager();

    // Invoker : 명령 실행 요청 객체
    private static CommandInvoker invoker = new CommandInvoker();

    // 명령어와 실행 로직을 매핑하는 Map
    // Pattern: 정규표현식을 위한 유틸리티
    // Consumer<String>: 컨슈머 사용을 위한 유틸리티이며, String 으로 타입 제한
    private static final Map<Pattern, Consumer<String>> commandHandlers = new HashMap<>();

    // 스태틱 초기화 블럭: 프로그램 실행 시 static 필드를 초기화 하는 블럭
    // 생성자에서 초기화하지 말고 여기서 하는게 바람직하다.
    static {
        // 정규표현식 : 입력된 값이 exit 와 일치한다면 ("^은 시작 $은 종료")
        commandHandlers.put(Pattern.compile("^exit$"), (input) -> {
            System.out.println("프로그램 종료.");
            sc.close();
            exit(0);
        });

        // 정규표현식 : todo list
        commandHandlers.put(Pattern.compile("^todo list$"), (input) -> {
            taskManager.listTasks();
        });

        // 정규표현식 : todo undo
        commandHandlers.put(Pattern.compile("^todo undo$"), (input) -> {
            invoker.undoLastCommand();
        });

        // 정규표현식 : todo add ...
        commandHandlers.put(Pattern.compile("^todo add .*"), (input) -> {
            // 실행 명령어 호출
            processAddCommand(input);
        });

        // 정규표현식 : todo del ...
        commandHandlers.put(Pattern.compile("^todo del .*"), (input) -> {
            // 실행 명령어 호출
            processDeleteCommand(input);
        });
    }

    private static void processAddCommand(String input) {
        // "todo add <우선순위> <할일내용>" 파싱
        String[] parts = input.split(" ", 4);
        if (parts.length < 4) {
            System.out.println("명령어 형식이 잘못되었습니다. 사용법: todo add <우선순위(1-5)> <할일내용>");
            return;
        }

        try {
            int priority = Integer.parseInt(parts[2]);
            if (priority < 1 || priority > 5) {
                System.out.println("우선순위는 1부터 5까지의 숫자여야 합니다.");
                return;
            }

            String content = parts[3];
            Command addCommand = new AddTaskCommand(taskManager, priority, content);
            invoker.executeCommand(addCommand);
        } catch (NumberFormatException e) {
            System.out.println("우선순위는 숫자여야 합니다.");
        }
    }

    private static void processDeleteCommand(String input) {
        // "todo del <번호>" 파싱
        String[] parts = input.split(" ", 3);
        if (parts.length < 3) {
            System.out.println("명령어 형식이 잘못되었습니다. 사용법: todo del <번호>");
            return;
        }

        try {
            int index = Integer.parseInt(parts[2]) - 1; // 1부터 시작하는 번호를 0부터 시작하는 인덱스로 변환
            Command deleteCommand = new DeleteTaskCommand(taskManager, index);
            invoker.executeCommand(deleteCommand);
        } catch (NumberFormatException e) {
            System.out.println("삭제할 항목 번호는 숫자여야 합니다.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("===== 할 일 관리 시스템(CMD) =====");
        System.out.println("1. 추가");
        System.out.println("todo add <우선순위(1~5)> <할 일 내용>");
        System.out.println("2. 삭제");
        System.out.println("todo del <번호>");
        System.out.println("3. 목록");
        System.out.println("todo list");
        System.out.println("4. 실행 취소");
        System.out.println("todo undo");
        System.out.println("5. 종료");
        System.out.println("exit");

        while (true) {
            System.out.print(">>");
            String input = sc.nextLine().trim();

            try {
                boolean commandFound = false;
                // 명령어 맵에서 입력된 명령어와 일치하는 명령을 수행합니다.
                for (Map.Entry<Pattern, Consumer<String>> entry : commandHandlers.entrySet()) {
                    // 입력된 명령어 input이 Map의 Key(정규식) 과 매칭되면
                    if (entry.getKey().matcher(input).matches()) {
                        entry.getValue().accept(input); // 람다식 호출하는 accept
                        commandFound = true; // 일치하는 명령어 있었음
                        break; // 추가 검색 하지 않음
                    }
                }

                if (!commandFound) { // 일치하는 명령어 없었던 경우
                    System.out.println("알 수 없는 명령어 -> 지원되는 명령어를 작성하세요.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
