import java.util.ArrayList;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        ArrayList <Animal> group = cat.createGroup(20);
        Set<Animal> uniq = cat.showUniqHash(group);
        System.out.println(cat.showUniqCat(uniq));
    }
}