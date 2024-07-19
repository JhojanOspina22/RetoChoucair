package co.com.orange.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashBoardPage {

    public static final Target LBL_PIM = Target.the("Menu PIM").located(By.xpath("//a[@href='/web/index.php/pim/viewPimModule']"));


}
