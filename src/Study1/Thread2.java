package Study1;

/**
 * Runnableインターフェースを実装
 */
public class Thread2 implements Runnable {
    /**
     * 変数
     */
    private String data;

    /**
     * メソッド
     */
    public void setData(String data) {
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
        Thread2 myThread = new Thread2();
        // メソッドを使用
        myThread.setData("kool");

        // インスタンスを作成
        Thread thread = new Thread(myThread);
        // startメソッドを呼び出
        thread.start();
    }
}