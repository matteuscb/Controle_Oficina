/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DocumentFilter;

/**
 *
 * @author user
 */
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class NameDocumentFilter extends DocumentFilter {

    public NameDocumentFilter() {
    }

    public void insertString(FilterBypass fb, int offs,
            String str, AttributeSet a)
            throws BadLocationException {

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) == false) {
                return;
            }
        }
        fb.insertString(offs, str, a);

    }

    public void replace(FilterBypass fb, int offs,
            int length,
            String str, AttributeSet a)
            throws BadLocationException {

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) == false) {
                return;
            }
        }
        fb.replace(offs, length, str, a);
    }
}
