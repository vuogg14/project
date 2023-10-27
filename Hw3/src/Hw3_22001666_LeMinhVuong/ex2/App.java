package Hw3_22001666_LeMinhVuong.ex2;

public class App {
    public static void main(String[] args) {
        SimpleArrayList simpleArrayList = new SimpleArrayList();
        simpleArrayList.add("acs");
        simpleArrayList.add(2);
        simpleArrayList.add(3);
        simpleArrayList.add(2);
        simpleArrayList.remove(2);
        System.out.println(simpleArrayList.isContain("acs"));
        System.out.println(simpleArrayList);
        System.out.println(simpleArrayList.isContain(2));
    }
}
