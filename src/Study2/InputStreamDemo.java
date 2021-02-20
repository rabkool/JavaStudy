package Study2;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author RabKool
 */
public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        File f = new File("src/Study2/data.txt");
        // ファイルシステムで File オブジェクト file によって指定する実際のファイルへの接続を開くことにより、FileInputStream を作成します。
        InputStream data = new FileInputStream(f);

        // うつわ
        byte[] b = new byte[100];
        // この入力ストリームからデータのバイトを読み込みます
        data.read(b);
        // ファイル入力ストリームを閉じ、このストリームに関連するシステムリソースを解放します
        data.close();
        // byte → String
        String txtData = new String(b);

        // 出力
        System.out.println(txtData);
    }
}
