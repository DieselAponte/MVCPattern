package views;
import core.View;
import core.Model;
import controllers.HomeController;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class HomeView extends JPanel implements View {
    private final HomeController homeController;
    private final JFrame mainFrame;
    private final static int MAIN_FRAME_WIDTH = 800;
    private final static int MAIN_FRAME_HEIGHT = 600;
    private final static int MAIN_FRAME_X= 100;
    private final static int MAIN_FRAME_Y = 100;

    public HomeView(HomeController homeController, JFrame mainFrame) {
        this.homeController = homeController;
        this.mainFrame = mainFrame;
        make_mainFrame();
        make_tabs();

    }

    @Override
    public void update(Model model, Object data){}

    private void make_mainFrame() {
        mainFrame.setOpacity(1);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setBounds(MAIN_FRAME_X, MAIN_FRAME_Y, MAIN_FRAME_WIDTH, MAIN_FRAME_HEIGHT);
        mainFrame.setMinimumSize(new Dimension(MAIN_FRAME_WIDTH,MAIN_FRAME_HEIGHT));
        setBorder(new EmptyBorder(5, 5, 5, 5));
        setLayout(new BorderLayout());
    }

    private void make_tabs() {

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.addTab("Blank 1", homeController.getBlank1View());
        tabbedPane.addTab("Blank 2", homeController.getBlank2View());
//        tabbedPane.addTab("New event", homeController.getNewEventView());
//        tabbedPane.addTab("Events", homeController.getEventListView());
//        tabbedPane.addTab("Registrar Invitado", homeController.getRegistrarInvitadoView());
        add(tabbedPane, BorderLayout.CENTER);
        setBorder(new EmptyBorder(5, 5, 5, 5));

    }
}

