package ke.co.pyxis.vaadin.plugin;

import javax.swing.*;

/**
 * Created by achachiez on 06/03/15.
 */
public class PackagesForm {
    private JTextField views;
    private JTextField repos;
    private JTextField forms;
    private JTextField services;
    private JTextField servicesImpl;
    private JPanel mainPanel;
    private void createUIComponents() {
    }
    public JComponent getContents(){
        return mainPanel;
    }
}
