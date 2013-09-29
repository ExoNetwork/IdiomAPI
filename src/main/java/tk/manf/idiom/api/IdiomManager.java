/**
 * U NO COPPY
 * I NO HURT U
 */

package tk.manf.idiom.api;

import tk.manf.idiom.api.models.IdiomConfig;
import tk.manf.idiom.api.models.Messageable;

/**
 * Manages LocaleManagers and DataProviders
 * <p/>
 * @author Björn 'manf' Heinrichs
 * @version 1.0
 * @since 1.0
 */
public interface IdiomManager {
    /**
     * Initialise this Instance
     * <p/>
     * @param plugin related Plugin
     */
    public void init(IdiomConfig plugin);

    /**
     * Sends Message to a Messageable
     * instead of using the following:
     * Messageable.sendMessage(Messageable.getLocalisable(IdiomManager.getLocaleOf(Messageable), id));
     * <p/>
     * @param player Messageable which should recieve the Message
     * @param id     ID of Message
     */
    public void sendMessage(Messageable player, String id);

    /**
     * Returns the current locale of the given Messageable
     * <p/>
     * @param player Messageable
     * <p/>
     * @return Language Code of Messageable
     */
    public String getLocaleOf(Messageable player);

    /**
     * Gets the Message for this ID
     * <p/>
     * @param locale the Locale or null for default Localisable
     * @param id     ID of Message
     * <p/>
     * @return Message
     */
    public Message getLocalisable(String locale, String id);

}
