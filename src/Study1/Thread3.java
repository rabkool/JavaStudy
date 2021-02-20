package Study1;

/**
 * Data class
 */
class Data {
    public int value = 0;
}

/**
 * Method class
 */
class Method {
    /**
     * Plus method
     */
    public void plus(Data data, int[] numbers) {
        for (int n : numbers) {
            data.value += n;
        }
    }
}

/**
 * Threadクラスを継承する
 */
public class Thread3 extends Thread {
    /**
     * クラスでしかアクセスできない定数
     */
    private final Method method;

    /**
     * サブクラス
     */
    public Thread3(Method method) {
        this.method = method;
    }

    /**
     * runメソッド
     */
    @Override
    public void run() {
        // インスタンスを作成
        Data data = new Data();
        // data
        int[] index = new int[]{100, 200, 300};

        //コールバック関数を使用する
        method.plus(data, index);
        System.out.println(index[0] + "+" + index[1] + "+" + index[2] + "=" + data.value);
    }

    public static void main(String[] args) {
        // インスタンスを作成
        Thread thread = new Thread3(new Method());
        // startメソッドを呼び出
        thread.start();
    }
}