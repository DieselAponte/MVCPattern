package core;

import java.awt.CardLayout;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;

/**
 * Components in Java
 * is an object having a graphical representation that can be displayedon the screen
 * an that can interact with the user. Like buttons, checkboxes, scrollbars of a
 * typical gui.
 *
 * CardLayout
 * This class manages two or more components(usually JPanel instances) that share the
 * same display space.
 *
 * HashMap in Java
 * HashMap is a data structure that store items in "key/value" pairs, and u can access
 * them by an index of another type. One object is used as a key (index) to another object
 * (value). It can store different types or the same.
 *
 * Map in Java
 * Map is a data structure implemented as an interface. And because of that, the subclases
 * has to implement all the methods of the interface, his function is store items in pairs with
 * "key/value" type. This class has different clases that implements his methods, some of them
 * are called: HashMap, TreeMap, LinkedHashMap
 *         no order - minor to major - natural order
 */

public abstract class Controller {
    //Attributes
    protected static final JFrame mainFrame = new JFrame(); //Main window of the program
    private static final JPanel viewsViewer = new JPanel(new CardLayout()); //Contains all views that can be loaded in the main window
    private static final Map<String,Component> mainFrameComponents = new HashMap<>(); //Explication

    //Initialization blocks
    {
        mainFrame.add(viewsViewer); //Puts views viewer in the main window.
    }

    public abstract void run(); //Function that all the subclases has to implement to executes the controller and the associated view with it
    public static void addView(String viewName, Component view){ //Adds a view to the mainFrame.
        viewsViewer.add((Component)view, viewName);
    }
    public static void loadView(String viewName){ //Loads a view in main frame
        CardLayout cl = (CardLayout)viewsViewer.getLayout();
        cl.show(viewsViewer, viewName);
    }
    public static void addComponent(String name,Component component){ //Adds a new component in the list of main frame's components
        mainFrameComponents.put(name, component);
    }
    public static void removeComponent(String name){mainFrameComponents.remove(name);} //Removes a component from the list of main frame's components.
    public static Component getComponent(String name){return mainFrame;} //Returns an added component in the list of main frame's components

}
