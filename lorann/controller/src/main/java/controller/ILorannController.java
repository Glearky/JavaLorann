package controller;

import java.io.IOException;

public interface ILorannController {
	
	 /**
     * Play.
     *
     * @throws InterruptedException
     *             the interrupted exception
	 * @throws IOException 
     */
    void moove() throws InterruptedException, IOException;

    /**
     * Gets the order peformer.
     *
     * @return the order peformer
     */
    IOrderPerformer getOrderPeformer();

}
