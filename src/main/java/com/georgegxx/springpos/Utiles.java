/*

  ________                                   ________
 /  _____/  ____  ___________  ____   ____  /  _____/___  ______  ___
/   \  ____/ __ \/  _ \_  __ \/ ___\_/ __ \/   \  ___\  \/  /\  \/  /
\    \_\  \  ___(  <_> )  | \/ /_/  >  ___/\    \_\  \>    <  >    <
 \______  /\___  >____/|__|  \___  / \___  >\______  /__/\_ \/__/\_ \
        \/     \/           /_____/      \/        \/      \/      \/

 */
package com.georgegxx.springpos;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utiles {
    // https://
    public static String obtenerFechaYHoraActual() {
        String formato = "yyyy-MM-dd HH:mm:ss";
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern(formato);
        LocalDateTime ahora = LocalDateTime.now();
        return formateador.format(ahora);
    }
}
