package views;

import javax.swing.*;
import controllers.Blank2Controller;
import core.View;
import core.Model;

public class Blank2View extends JPanel implements View {
    private final Blank2Controller blank2Controller;

    private JTextField tf_ejemplo;
    private JCheckBox cb_ejemplo;
    private JRadioButton rb_ejemplo;
    private JFormattedTextField tf_ejemplo2;

    public Blank2View(Blank2Controller blank2Controller) {
        this.blank2Controller = blank2Controller;
        make_frame();
        make_field_components();
    }

    @Override
    public void update(Model model, Object data){
        if(data != null){
            String notice = (String) data;
            JOptionPane.showMessageDialog(null, notice);
        }
    }

    private void make_frame(){
        setLayout(null);
    }

    private void cleanFields() {
        tf_ejemplo.setText("");
        tf_ejemplo2.setText("");
        cb_ejemplo.setSelected(false);
        rb_ejemplo.setSelected(true);
    }

    private void make_field_components(){
        tf_ejemplo = new JTextField("Enter password");
        tf_ejemplo.setBounds(50, 30, 200, 30);
        add(tf_ejemplo);

        cb_ejemplo = new JCheckBox("Check me");
        cb_ejemplo.setBounds(50, 80, 200, 30);
        add(cb_ejemplo);

        rb_ejemplo = new JRadioButton("Option 1");
        rb_ejemplo.setBounds(50, 130, 200, 30);
        add(rb_ejemplo);

        tf_ejemplo2 = new JFormattedTextField("Enter something");
        tf_ejemplo2.setBounds(50, 180, 200, 30);
        add(tf_ejemplo2);
    }
}
