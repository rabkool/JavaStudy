package Study1;

/**
 * Threadクラスを継承する
 *
 * @author RabKool
 */
class ThreadDemo1 extends Thread {
    /**
     * クラスでしかアクセスできない定数
     */
    private final String data;

    /**
     * サブクラス
     */
    public ThreadDemo1(String data) {
        this.data = data;
    }

    /**
     * runメソッド
     */
    @Override
    public void run() {
        System.out.println("Rab" + data);
    }

    public static void main(String[] args) {
        // インスタンスを作成
        Thread thread = new ThreadDemo1("Kool");
        // startメソッドを呼び出
        thread.start();
    }
}