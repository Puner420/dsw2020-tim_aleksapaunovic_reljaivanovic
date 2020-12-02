package dsw.rudok.gui.swing.controller;

import java.awt.event.ActionEvent;

public class CopyAction extends AbstractRudokAction{

    public CopyAction(){
        //putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F3, ActionEvent.ALT_MASK));
        putValue(SMALL_ICON, loadIcon("res/icons/16x16/Copy.png"));
        putValue(NAME, "Copy");
        putValue(SHORT_DESCRIPTION, "Copy");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
