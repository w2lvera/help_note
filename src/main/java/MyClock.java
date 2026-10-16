//import java.util.Timer;

import javax.swing.*;
import java.awt.event.ActionListener;

public class MyClock {
    //talking clock
    Timer tt;
    ActionListener listener;
    public MyClock() {
        listener =  new TaskPerformer();
        tt = new Timer(1000, listener);

    }
    void start(){
        tt.start();
    }


}
