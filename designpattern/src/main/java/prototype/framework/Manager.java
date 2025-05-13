package prototype.framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
    // Map : K, V
    private Map<String, Product> showcase = new HashMap<>();

    // 원본 등록 메서드 : prototype = 원본
    public void register(String name, Product prototype) {
        showcase.put(name, prototype);
    }

    // 새로운 인스턴스 만드는 메서드 : prototypeName 을 인자로 준다
    public Product create(String prototypeName) {
        // Map에서 원본을 추출한다
        Product p = showcase.get(prototypeName);
        // 원본에서 Copy 만드는 메서드는 호출한다
        return p.createCopy();
    }
}
