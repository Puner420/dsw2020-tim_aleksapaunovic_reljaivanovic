package dsw.rudok.gui.swing.controller;

import java.awt.event.ActionEvent;


public class ExitAction extends AbstractRudokAction {

    public ExitAction(){
        //putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK));
        putValue(SMALL_ICON, loadIcon("res/icons/16x16/Exit.png"));
        putValue(NAME, "Exit");
        putValue(SHORT_DESCRIPTION, "Exit");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
