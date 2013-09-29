/**
 * U NO COPPY
 * I NO HURT U
 */

package tk.manf.idiom.api;

import tk.manf.idiom.api.exceptions.NoSuchMessageFound;

/**
 * Manages all Localisables for a
 * specific Locale
 * <p/>
 * @author Björn 'manf' Heinrichs
 * @version 1.0
 * @since 1.0
 * @see Message
 */
public interface LocaleManager {
    /**
     * Initialises with given DataProvider
     * <p/>
     * @param data DataProvider
     */
    public void init(DataProvider data);

    /**
     * Returns the given Message
     * for the given ID
     * <p/>
     * @param id ID
     * <p/>
     * @return Message Message found
     * <p/>
     * @throws NoSuchMessageFound when no Message is found
     */
    public Message getLocalisable(String id);

}
