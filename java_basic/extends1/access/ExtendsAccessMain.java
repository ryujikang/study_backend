package extends1.access;

import extends1.access.child.Child;

public class ExtendsAccessMain {

    public static void main(String[] args) {
        Child child = new Child();
        child.call(); // Child.call() -> Parent.printParent() 순서로 호출
    }
}
