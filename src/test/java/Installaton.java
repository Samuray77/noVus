import org.junit.Test;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;

import java.awt.*;

public class Installaton {

    @Test
    public void userCanClickInstallBotton() throws Exception {

        Pattern installButton = new Pattern("C:\\Users\\NumberOk\\Desktop\\InstallButton.png");



        Screen screen = new Screen();

//        Region installWindows = new Screen();


        screen.click(installButton);


    }
}
