package showboard;

import java.io.IOException;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Anne-Emilie DIET
 * @version 1.0
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args the arguments
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws InterruptedException the interrupted exception
     */
    public static void main(final String[] args) throws IOException, InterruptedException {
        final Showboarddemo demo = new Showboarddemo();
        demo.move();
    }
}
