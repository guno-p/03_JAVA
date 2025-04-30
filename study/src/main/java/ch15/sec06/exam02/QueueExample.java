package ch15.sec06.exam02;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> queue = new ArrayDeque<Message>();

        queue.offer(new Message("sendMail", "홍길동"));
        queue.offer(new Message("sendSMS", "건호"));
        queue.offer(new Message("sendKaKao", "동현"));

        while (!queue.isEmpty()) {
            Message message = queue.poll();
            switch (message.command) {
                case "sendMail":
                    System.out.println(message.to + "에게 메일 보내기");
                    break;
                case "sendSMS":
                    System.out.println(message.to + "에게 SMS");
                    break;
                case "sendKaKao":
                    System.out.println(message.to + "에게 카카오");
                    break;
            }
        }

    }
}
