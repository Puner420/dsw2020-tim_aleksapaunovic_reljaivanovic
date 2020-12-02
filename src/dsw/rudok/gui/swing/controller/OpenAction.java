package dsw.rudok.gui.swing.controller;

import java.awt.event.ActionEvent;

public class OpenAction extends AbstractRudokAction{

    public OpenAction(){
        //putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK));
        putValue(SMALL_ICON, loadIcon("res/icons/16x16/Open.png"));
        putValue(NAME, "Open");
        putValue(SHORT_DESCRIPTION, "Open");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
