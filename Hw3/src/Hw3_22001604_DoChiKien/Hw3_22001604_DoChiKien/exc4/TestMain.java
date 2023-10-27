package Hw3_22001604_DoChiKien.exc4;

public class TestMain {
    public static void main(String[] args) throws Exception {
        ReadFile read = new ReadFile();
        System.out.println("Word Count: ");
        read.readFile("C:\\Users\\Admin\\IdeaProjects\\CTDL_GT\\src\\Hw3_22001604_DoChiKien\\exc4\\data.txt").print();
    }
}
