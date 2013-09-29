/**
 * U NO COPPY
 * I NO HURT U
 */

package tk.manf.idiom.api.models;

/**
 * Modell for any Messageable which can recieve Messages
 * <p/>
 * @author Björn 'manf' Heinrichs
 * @version 1.0
 * @since 1.0
 */
public interface Messageable {
    /**
     * Sends a Message to a Messageable
     * <p/>
     * @param message Message
     */
    public void sendMessage(String message);

}
