package ch09.nested_class.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ButtonExample extends JFrame {
    // 필드 - UI컴포넌트 선언
    private JTextField messageField; // input 태그와 유사
    private JButton sendButton; // button 태그와 유사

    /* 중첩 인터페이스 선언 */
    public interface MessageHandler {
        /*
        * 메시지 처리 메서드
        * @param message
        * */
        void printMessage(String message);
    }

    // 기본 생성자
    public ButtonExample() {
        // 기본 JFrame 설정
        setTitle("중첩 클래스, 익명 객체 예제");
        setSize(400, 100);
        setLocationRelativeTo(null); // 화면 중앙 배치
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X 버튼
        setLayout(new FlowLayout()); // 좌우로 흘러가는 레이아웃

        // UI 컴포넌트 초기화
        messageField = new JTextField(20);
        sendButton = new JButton("콘솔에 출력");

        add(new JLabel("메시지: "));
        add(messageField);
        add(sendButton);

        /* 중첩 인터페이스를 익명 내부 클래스를 이용하여 구현 */
        
        // 하나의 내부 인터페이스를 2가지 방법으로 구현
        MessageHandler handlerA = new MessageHandler() {
            @Override
            public void printMessage(String message) {
                System.out.println("message = " + message);
            }
        };

        MessageHandler handlerB = new MessageHandler() {
            @Override
            public void printMessage(String message) {
                // 현재 시간 + message
                String currentTime =
                        LocalDateTime.now().format(
                                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
                        );
                System.out.printf("[%s] %s", currentTime, message);
            }
        };

        /* sendButton 클릭 시 동작을 익명 내부 클래스로 구현 */
        sendButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = messageField.getText();
                if (message.isEmpty()) { // 미작성 시
                    JOptionPane.showMessageDialog(
                            ButtonExample.this,
                            "전송할 메시지를 입력해주세요",
                            "오류",
                            JOptionPane.ERROR_MESSAGE);
                }
                else {
                    /*
                    * 메시지가 입력 되었을 때
                    * 중첩 인터페이스를 구현한 방법을 이용해서 message 출력
                    */
                    handlerA.printMessage(message);
                    handlerB.printMessage(message);

                    /* 입력 필드 초기화 */
                    messageField.setText("");
                }
            }
        });

    }
}
