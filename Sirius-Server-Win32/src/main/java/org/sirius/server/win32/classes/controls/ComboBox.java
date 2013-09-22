/**
 * 
 */
package org.sirius.server.win32.classes.controls;

import javax.jws.WebService;

import org.sirius.server.win32.classes.Common;
import org.sirius.server.win32.constants.IComboBoxConsts;

import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.WinDef.HWND;
import com.sun.jna.platform.win32.WinDef.LPARAM;
import com.sun.jna.platform.win32.WinDef.WPARAM;

/**
 * @author Myk Kolisnyk
 * .
 */
@WebService
public class ComboBox extends Common implements IComboBoxConsts {

    /**
     * .
     */
    public ComboBox() {
        // TODO Auto-generated constructor stub
    }

    /**
     * .
     * @param hwndCtl .
     * @param indexStart .
     * @param data .
     * @return .
     */
    public final int findItemData(final long hwndCtl, final int indexStart,
            final LPARAM data) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(indexStart);
        return getUser32().SendMessage(hWnd, CB_FINDSTRING, wParam, data);
    }

    /**
     * .
     * @param hwndCtl .
     * @param indexStart .
     * @param lpszFind .
     * @return .
     */
    public final int findString(final long hwndCtl, final int indexStart,
            final String lpszFind) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(indexStart);
        Pointer pt = new Pointer(0);
        pt.setString(0, lpszFind);
        LPARAM lParam = new LPARAM(Pointer.nativeValue(pt));
        return getUser32().SendMessage(hWnd, CB_FINDSTRING, wParam, lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @param indexStart .
     * @param lpszFind .
     * @return .
     */
    public final int findStringExact(final long hwndCtl, final int indexStart,
            final String lpszFind) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(indexStart);
        Pointer pt = new Pointer(0);
        pt.setString(0, lpszFind);
        LPARAM lParam = new LPARAM(Pointer.nativeValue(pt));
        return getUser32().SendMessage(
                hWnd,
                CB_FINDSTRINGEXACT,
                wParam,
                lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @return .
     */
    public final int getCount(final long hwndCtl) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(0);
        LPARAM lParam = new LPARAM(0);
        return getUser32().SendMessage(hWnd, CB_GETCOUNT, wParam, lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @return .
     */
    public final int getCurSel(final long hwndCtl) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(0);
        LPARAM lParam = new LPARAM(0);
        return getUser32().SendMessage(hWnd, CB_GETCURSEL, wParam, lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @return .
     */
    public final int getDroppedState(final long hwndCtl) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(0);
        LPARAM lParam = new LPARAM(0);
        return getUser32().SendMessage(
                hWnd,
                CB_GETDROPPEDSTATE,
                wParam,
                lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @return .
     */
    public final int getEditSel(final long hwndCtl) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(0);
        LPARAM lParam = new LPARAM(0);
        return getUser32().SendMessage(hWnd, CB_GETEDITSEL, wParam, lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @return .
     */
    public final int getExtendedUI(final long hwndCtl) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(0);
        LPARAM lParam = new LPARAM(0);
        return getUser32().SendMessage(hWnd, CB_GETEXTENDEDUI, wParam, lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @param index .
     * @return .
     */
    public final int getItemData(final long hwndCtl, final int index) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(index);
        LPARAM lParam = new LPARAM(0);
        getUser32().SendMessage(hWnd, CB_GETITEMDATA, wParam, lParam);
        return 0;
    }

    /**
     * .
     * @param hwndCtl .
     * @return .
     */
    public final int getItemHeight(final long hwndCtl) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(0);
        LPARAM lParam = new LPARAM(0);
        return getUser32().SendMessage(hWnd, CB_GETITEMHEIGHT, wParam, lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @param index .
     * @param lpszBuffer .
     * @return .
     */
    public final int getLBText(final long hwndCtl, final int index,
            final String lpszBuffer) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(index);
        Pointer pt = new Pointer(0);
        pt.setString(0, lpszBuffer);
        LPARAM lParam = new LPARAM(Pointer.nativeValue(pt));
        return getUser32().SendMessage(hWnd, CB_GETLBTEXT, wParam, lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @param index .
     * @return .
     */
    public final int getLBTextLen(final long hwndCtl, final int index) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(index);
        LPARAM lParam = new LPARAM(0);
        return getUser32().SendMessage(hWnd, CB_GETLBTEXTLEN, wParam, lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @return .
     */
    public final String getText(final long hwndCtl) {
        HWND hWnd = longToHwnd(hwndCtl);
        int length = getTextLength(hwndCtl);
        char[] buf = new char[length];
        getUser32().GetWindowText(hWnd, buf, length);
        return String.valueOf(buf);
    }

    /**
     * .
     * @param hwndCtl .
     * @return .
     */
    public final int getTextLength(final long hwndCtl) {
        HWND hWnd = longToHwnd(hwndCtl);
        return getUser32().GetWindowTextLength(hWnd);
    }

    /**
     * .
     * @param hwndCtl .
     * @return .
     */
    public final int resetContent(final long hwndCtl) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(0);
        LPARAM lParam = new LPARAM(0);
        return getUser32().SendMessage(hWnd, CB_RESETCONTENT, wParam, lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @param indexStart .
     * @param lpszSelect .
     * @return .
     */
    public final int selectString(final long hwndCtl, final int indexStart,
            final String lpszSelect) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(indexStart);
        Pointer pt = new Pointer(0);
        pt.setString(0, lpszSelect);
        LPARAM lParam = new LPARAM(Pointer.nativeValue(pt));

        return getUser32().SendMessage(hWnd, CB_SELECTSTRING, wParam, lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @param index .
     * @return .
     */
    public final int setCurSel(final long hwndCtl, final int index) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(index);
        LPARAM lParam = new LPARAM(0);
        return getUser32().SendMessage(hWnd, CB_SETCURSEL, wParam, lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @param ichStart .
     * @param ichEnd .
     * @return .
     */
    public final int setEditSel(final long hwndCtl, final int ichStart,
            final int ichEnd) {
        HWND hWnd = longToHwnd(hwndCtl);
        return getUser32().SendMessage(hWnd, CB_SETEDITSEL, new WPARAM(0L),
                makeLParam(ichStart, ichEnd));
    }

    /**
     * .
     * @param hwndCtl .
     * @param index .
     * @param cyItem .
     * @return .
     */
    public final int setItemHeight(final long hwndCtl, final int index,
            final int cyItem) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(index);
        LPARAM lParam = new LPARAM(cyItem);
        return getUser32().SendMessage(hWnd, CB_SETITEMHEIGHT, wParam, lParam);
    }

    /**
     * .
     * @param hwndCtl .
     * @param lpsz .
     */
    public final void setText(final long hwndCtl, final String lpsz) {
        HWND hWnd = longToHwnd(hwndCtl);
        getUser32().SetWindowText(hWnd, lpsz.toCharArray());
    }

    /**
     * .
     * @param hwndCtl .
     * @param fShow .
     * @return .
     */
    public final int showDropdown(final long hwndCtl, final boolean fShow) {
        HWND hWnd = longToHwnd(hwndCtl);
        WPARAM wParam = new WPARAM(fShow ? 1 : 0);
        LPARAM lParam = new LPARAM(0);
        return getUser32().SendMessage(hWnd, CB_SHOWDROPDOWN, wParam, lParam);
    }
}
