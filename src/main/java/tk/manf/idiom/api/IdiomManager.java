/**
 * The MIT License (MIT)
 * 
 * Copyright (c) 2013 Björn 'manf' Heinrichs
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
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
     * Messageable.sendMessage(IdiomManager.getLocalisable(IdiomManager.getLocaleOf(player), id).translate(args));
     * <p/>
     * @param player Messageable which should recieve the Message
     * @param id     ID of Message
     * @param args   Arguments
     */
    public void sendMessage(Messageable player, String id, Object... args);

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
