public class Main {

    public static void main(String[] args) throws Exception {

        System.out.println("Создаю потоки...");

        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();

    }
}
