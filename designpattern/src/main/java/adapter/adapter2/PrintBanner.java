package adapter.adapter2;

public class PrintBanner extends Print {
//  위임 객체
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }
    public PrintBanner(Banner banner) {
        this.banner = banner;
    }

    @Override
    public void printStrong() {
        banner.showWithParen();
    }

    @Override
    public void printWeak() {
        banner.showWithAster();
    }
}
