/**
 * U NO COPPY
 * I NO HURT U
 */

package tk.manf.idiom.api;

import java.util.Map;

/**
 * Serves data for LocaleManager
 * <p/>
 * @author Björn 'manf' Heinrichs
 * @version 1.0
 * @since 1.0
 * @see LocaleManager#init(tk.manf.idiom.api.DataProvider)
 */
public interface DataProvider {
    /**
     * Mapping keys to individual Localisation
     * <p/>
     * @return Localisation for ID
     */
    public Map<String, String> getKeys();

}
