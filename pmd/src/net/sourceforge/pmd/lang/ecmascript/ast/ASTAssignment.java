/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */
package net.sourceforge.pmd.lang.ecmascript.ast;

import org.mozilla.javascript.ast.Assignment;

public class ASTAssignment extends AbstractInfixEcmascriptNode<Assignment> {
    public ASTAssignment(Assignment asssignment) {
	super(asssignment);
    }
}