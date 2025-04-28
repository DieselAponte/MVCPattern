package controllers;
import core.Controller;
import views.HomeView;

//Main controller. It will be responsible from program's main screen behavior
public class HomeController extends Controller {

    @Override
    public void run(){
        HomeView homeView = new HomeView(this, mainFrame);
        addView("HomeView", homeView);
        mainFrame.setVisible(true);
    }


}
