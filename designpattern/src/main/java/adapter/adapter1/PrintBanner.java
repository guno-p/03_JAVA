package adapter.adapter1;

public class PrintBanner extends Banner implements Print{
//  자동으로 추가된 자식의 디폴트 생성자에는 부모의 디폴트 생성자도 자동 생성
//  부모인 Banner는 현재 디폴트 생성자가 없어서 오류
    public PrintBanner(String string) {
        super(string);
    }

//  일종의 wrapping
    @Override
    public void printWeak() {
        showWithParen();
    }
    @Override
    public void printStrong() {
        showWithAster();
    }

}
