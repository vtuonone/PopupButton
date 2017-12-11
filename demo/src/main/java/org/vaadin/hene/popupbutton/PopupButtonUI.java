package org.vaadin.hene.popupbutton;

import com.vaadin.annotations.Title;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;

@Title("PopupButton Application")
public class PopupButtonUI extends UI {

    private static final long serialVersionUID = 1L;

    @Override
    protected void init(VaadinRequest request) {

        Navigator navigator = new Navigator(this, this);
        navigator.addView("", DefaultView.class);
        navigator.addView("svgtest", SvgTestView.class);
        navigator.addView("shortcutactiontest", ShortcutActionTestView.class);
        navigator.addView("modalwindowtest", ModalWindowTestView.class);
        navigator.addView("popuppositiontest", PopupPositionTest.class);
        navigator.addView("gridinpopuptest", GridInPopupTest.class);
    }
}
