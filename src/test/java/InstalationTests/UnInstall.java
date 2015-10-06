package InstalationTests;

import org.junit.Before;
import org.junit.Test;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class UnInstall {
    Screen screen = new Screen();
    Pattern startButton = new Pattern("E:\\FF_Project_Automation\\FF_noVus_Win\\src\\imageSrc\\startButton.png");

    @Before
    public void closeAllActiveWindows() {
        screen.type("m", KeyModifier.WIN);

    }
    @Test
    public void userCanUnInstallStartMenu() throws Exception {



//        screen.type(Key.ESC+KeyModifier.WIN);

        screen.click(startButton);
//
//
//
//
//
//        Region screen = new Screen();
//
//
//        screen.click(installButton);DD


    }

}
