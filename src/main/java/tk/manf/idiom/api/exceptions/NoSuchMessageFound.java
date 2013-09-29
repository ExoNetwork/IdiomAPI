/**
 * U NO COPPY
 * I NO HURT U
 */

package tk.manf.idiom.api.exceptions;

import tk.manf.idiom.api.LocaleManager;

/**
 * Exception thrown whenever a Message
 * was not found indicating a Developer
 * has not specified such a Message
 * <p/>
 * @author Björn 'manf' Heinrichs
 * @version 1.0
 * @since 1.0
 * @see LocaleManager#getLocalisable(java.lang.String)
 */
public final class NoSuchMessageFound extends RuntimeException {
    public NoSuchMessageFound(final String ID) {
        super("Message could not be found for given ID: " + ID);
    }

}
