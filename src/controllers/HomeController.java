package controllers;
import core.Controller;
import views.Blank1View;
import views.Blank2View;
import views.HomeView;

//Main controller. It will be responsible from program's main screen behavior
public class HomeController extends Controller {

    //Inicializar todos los controladores
    private final Blank1Controller blank1Controller = new Blank1Controller();
    private final Blank2Controller blank2Controller = new Blank2Controller();

    @Override
    public void run(){
        //Initializes other controller
        //newEventController.run();
        blank1Controller.run();
        blank2Controller.run();

        HomeView homeView = new HomeView(this, mainFrame);
        addView("HomeView", homeView);
        mainFrame.setVisible(true);
    }

    public Blank1View getBlank1View(){return blank1Controller.getView();}
    public Blank2View getBlank2View(){return blank2Controller.getView();}
}

