package linggash.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {

    /*yang dimaskud singleton disini adalah saat membuat beberapa variabel dari suatu class yang sama
    sistem tidak perlu membuat object baru di memori jadi dia cukup memanggil object yang sudah ada.*/

    @Test
    void testSingleton() {

        var database1 = Database.getInstance();
        var database2 = Database.getInstance();

        Assertions.assertSame(database1, database2);
    }
}
