package dsw.rudok.gui.swing.controller;

import java.awt.event.ActionEvent;

public class CloseAction extends AbstractRudokAction{

    public CloseAction(){
        //putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK));
        putValue(NAME, "Close");
        putValue(SHORT_DESCRIPTION, "Close");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
