/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.java;

import net.sourceforge.pmd.lang.Parser;
import net.sourceforge.pmd.lang.ParserOptions;

public class Java16Handler extends AbstractJavaHandler {

    public Parser getParser(ParserOptions parserOptions) {
        return new Java16Parser(parserOptions);
    }
}
