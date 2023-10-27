package ex2;

public class Main {
    public static void main(String[] args) {
        try {
            SimpleArraylist<String> simpleArraylist = new SimpleArraylist<>();
            System.out.println("test add: ");
            simpleArraylist.add("lemon");
            simpleArraylist.add("orange");
            simpleArraylist.add("grape");
            simpleArraylist.add("kiwi");
            System.out.println(simpleArraylist);
            System.out.println("test size: " + simpleArraylist.size());
            System.out.println("test empty: " + simpleArraylist.isEmpty());
            System.out.println("test set: ");
            simpleArraylist.set(1, "apple");
            System.out.println(simpleArraylist);
            System.out.println("test contain: " + simpleArraylist.isContain("grape"));
            System.out.println("test get: " + simpleArraylist.get(1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
