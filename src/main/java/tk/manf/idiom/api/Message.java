/**
 * U NO COPPY
 * I NO HURT U
 */

package tk.manf.idiom.api;

import tk.manf.idiom.api.models.Messageable;

/**
 * Message which can be translated with
 * given Arguments
 * <p/>
 * @author Björn 'manf' Heinrichs
 * @version 1.0
 * @since 1.0
 */
public interface Message {
    /**
     * Translates the Message and
     * sends it to the Messageable.
     * <p/>
     * @param player Messageable
     * @param args   Arguments
     * <p/>
     * @see Message#translate(java.lang.Object[])
     */
    public void sendPlayer(Messageable player, Object... args);

    /**
     * Translates the Message
     * <p/>
     * The arguments will be replaced with
     * Placeholders in the String.
     * <p/>
     * @param args Arguments
     * <p/>
     * @return translated Message
     */
    public String translate(Object... args);

    /**
     * Converts the given String to a Raw Type String.
     * However this function depends on the
     * Localisation implementation
     * <p/>
     * @return raw String
     */
    public String toRawString();

}
