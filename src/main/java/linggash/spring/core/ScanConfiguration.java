package linggash.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// Sebelumnya kita menggunakan annotation import langsung pada config yang ingin kita pakai
// tapi jika importnya sudah semakin banyak akan menyulitkan, maka kita bisa menggunakan
// annotation @ComponentScan dan di dalam parameter basePackages kita bisa menuliskan package
// mana yang ingin kita import configuration yang ada di dalamnya

@Configuration
@ComponentScan(basePackages = {
        "linggash.spring.core.configuration"
})
public class ScanConfiguration {
}
