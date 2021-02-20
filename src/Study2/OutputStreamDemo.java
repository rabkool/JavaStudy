package Study2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author RabKool
 */
public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        File f = new File("src/Study2/data.txt");

        // 指定されたFileオブジェクトによって表されるファイルに書き込むためのファイル出力ストリームを作成します。
        // true: バイトはファイルの先頭ではなく最後に書き込まれる
        OutputStream osData = new FileOutputStream(f, true);
        // 書き込むdata
        String s = "wwwwwwwww";
        // 指定されたバイトをこのファイル出力ストリームに書き込みます
        osData.write(s.getBytes());
        // ファイル入力ストリームを閉
        osData.close();
    }
}
