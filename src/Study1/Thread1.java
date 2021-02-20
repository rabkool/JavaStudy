package Study1;

/**
 * Threadクラスを継承する
 */
class Thread1 extends Thread {
    /**
     * クラスでしかアクセスできない定数
     */
    private final String data;

    /**
     * サブクラス
     */
    public Thread1(String data) {
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
        Thread thread = new Thread1("Kool");
        // startメソッドを呼び出
        thread.start();
    }
}