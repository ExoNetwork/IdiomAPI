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
