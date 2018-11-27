/*
 * Decompiled with CFR 0_132.
 */
package meocomando;

import java.lang.reflect.Method;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class BareBonesBrowserLaunch {
    static final String[] browsers = new String[]{"firefox", "opera", "konqueror", "epiphany", "seamonkey", "galeon", "kazehakase", "mozilla", "netscape"};

    public static void openURL(String url) {
        String osName = System.getProperty("os.name");
        try {
            if (osName.startsWith("Mac OS")) {
                Class<?> fileMgr = Class.forName("com.apple.eio.FileManager");
                Method openURL = fileMgr.getDeclaredMethod("openURL", String.class);
                openURL.invoke(null, url);
            } else if (osName.startsWith("Windows")) {
                Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
            } else {
                boolean found = false;
                for (String browser : browsers) {
                    if (found) continue;
                    boolean bl = found = Runtime.getRuntime().exec(new String[]{"which", browser}).waitFor() == 0;
                    if (!found) continue;
                    Runtime.getRuntime().exec(new String[]{browser, url});
                }
                if (!found) {
                    throw new Exception(Arrays.toString(browsers));
                }
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error attempting to launch web browser\n" + e.toString());
        }
    }
}

