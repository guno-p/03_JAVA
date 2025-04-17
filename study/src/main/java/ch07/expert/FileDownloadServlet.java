package ch07.expert;

public class FileDownloadServlet extends HttpServlet {
    @Override
    public void service() {
        System.out.println("파일을 다운로드합니다.");
    }
}
