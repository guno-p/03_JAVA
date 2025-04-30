package ch15.sec03.exam02;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Member {
    public String name;
    public int age;

    @Override
    public int hashCode() {
        return name.hashCode() + this.age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member target) {
            return target.name.equals(name) && (target.age == age);
        }
        else {
            return false;
        }
    }
}
