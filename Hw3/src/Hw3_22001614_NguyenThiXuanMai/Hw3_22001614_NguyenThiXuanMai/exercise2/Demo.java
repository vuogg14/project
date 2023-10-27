package Hw3_22001614_NguyenThiXuanMai.exercise2;

public class Demo {
    public static void main(String[] args) {
        // đối tượng để test là Book
        ListInterface<Book> bookManager = new SimpleArrayList<>();

        // thêm vào mảng 7 quyển sách
        // test add
        bookManager.add(new Book("Demian", "Hermann Hesse"));
        bookManager.add(new Book("13.67", "Chan Ho Kei"));
        bookManager.add(new Book("Norwegian Forest", "Haruki Murakami"));
        bookManager.add(new Book("Kite Runner", "Khaled Hosseini"));
        bookManager.add(new Book("Me Before You", "Jojo Moyes"));
        bookManager.add(new Book("1Q84", "Haruki Murakami"));
        bookManager.add(new Book("The Little Prince", "Antoine de Saint-Exupéry"));

        System.out.println("Mảng ban đầu: " + bookManager);

        // test get
        // lấy phần tử thứ 2 trong mảng
        System.out.println("Phần tử thứ 2 trong mảng: " + bookManager.get(2) + "\n");

        // test set
        // thay đổi phần tử thứ 2
        bookManager.set(2, new Book("The Devil in the White City", "Erik Larson"));
        System.out.println("Sau khi thay đổi: " + bookManager);

        // test remove
        // bỏ đi phần tử thứ 2
        bookManager.remove(bookManager.get(2));
        System.out.println("Sau khi remove: " + bookManager);

        // test isContain
        System.out.println("Kiểm tra xem có quyển Jump Jump Jump của Haruki Murakami không? " + bookManager.isContain(new Book("Jump Jump Jump", "Haruki Murakami")) + "\n");

        // isEmpty
        System.out.println("Mảng có rỗng không? " + bookManager.isEmpty());
    }
}
