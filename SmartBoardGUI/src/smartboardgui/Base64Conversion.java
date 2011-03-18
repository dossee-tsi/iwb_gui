package smartboardgui;
import images.Base64Coder;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Base64Conversion {

    //convert base64 to image
    public static BufferedImage base64ToImage(String base64) throws IOException {

        byte[] bytes = Base64Coder.decodeLines(base64);
        //System.out.println(bytes);
        try {
            final BufferedImage bufferedImage = ImageIO.read(new ByteArrayInputStream(bytes));
            return bufferedImage;
        } catch (IOException e) {
            System.out.println("Error while converting image");
        }
        return null;
    }
}
