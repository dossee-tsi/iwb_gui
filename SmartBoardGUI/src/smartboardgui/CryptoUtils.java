package smartboardgui;

public class CryptoUtils {

    public static String hash(String s) {

        String hash = "";

        try {
            byte[] ba = computeHash(s);
            hash = CryptoUtils.byteArrayToHexString(ba);
        } catch (Exception e) {
        }
        return hash;
    }

    private static byte[] computeHash(String x)
            throws Exception {
        java.security.MessageDigest d = null;
        d = java.security.MessageDigest.getInstance("SHA-1");
        d.reset();
        d.update(x.getBytes());
        return d.digest();
    }

    private static String byteArrayToHexString(byte[] b) {
        StringBuilder sb = new StringBuilder(b.length * 2);
        for (int i = 0; i < b.length; i++) {
            int v = b[i] & 0xff;
            if (v < 16) {
                sb.append('0');
            }
            sb.append(Integer.toHexString(v));
        }
        return sb.toString().toUpperCase();
    }
}
