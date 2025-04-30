package ch15.sec06.exam03;

import ch15.sec06.exam03.command.Command;
import ch15.sec06.exam03.command.FaxCommand;
import ch15.sec06.exam03.command.KakaoCommand;
import ch15.sec06.exam03.command.SendCommand;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        /*
        * 순번이 아닌 다른 정보로 command 선택은 Map 으로 구현
        * */
        Map<String, Command> commands = new HashMap<>();
        commands.put("sendMail", new SendCommand());
        commands.put("sendKakao", new KakaoCommand());
        commands.put("sendFax", new FaxCommand());

        Queue<Message> queue = new ArrayDeque<>();
        queue.offer(new Message("sendMail", "홍길동"));
        queue.offer(new Message("sendFax", "건호"));
        queue.offer(new Message("sendKakao", "동현"));

        while(!queue.isEmpty()) {
            Message message = queue.poll();

            /*
            * 새로운 command 가 추가되더라도
            * 다중 if 문을 사용하지 않기때문에
            * 실행 파트에 수정이 없다.
            * */
            Command command = commands.get(message.command);
            if(command != null) {
                command.execute(message);
            }
        }
    }
}
