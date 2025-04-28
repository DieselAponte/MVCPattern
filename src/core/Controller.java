package core;

import java.awt.CardLayout;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

public abstract class Controller {
    // Attributes
    protected static final JFrame mainFrame = new JFrame("My Application");
    private static final JPanel viewsViewer = new JPanel(new CardLayout());
    private static final Map<String, Component> mainFrameComponents = new HashMap<>();

    // Initialization block
    static {
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setBounds(100, 100, 800, 600);
        mainFrame.setMinimumSize(new java.awt.Dimension(800, 600));
        mainFrame.add(viewsViewer);
    }

    // Methods
    public abstract void run();

    public static void addView(String viewName, Component view) {
        viewsViewer.add(view, viewName);
    }

    public static void loadView(String viewName) {
        CardLayout cl = (CardLayout) viewsViewer.getLayout();
        cl.show(viewsViewer, viewName);
    }

    public static void addComponent(String name, Component component) {
        mainFrameComponents.put(name, component);
    }

    public static void removeComponent(String name) {
        mainFrameComponents.remove(name);
    }

    public static Component getComponent(String name) {
        return mainFrameComponents.get(name);
    }

    public static JFrame getMainFrame() {
        return mainFrame;
    }
}
