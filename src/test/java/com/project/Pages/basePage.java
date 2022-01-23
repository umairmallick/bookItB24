package com.project.Pages;

import com.project.utility.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class basePage {

    public basePage() {
        PageFactory.initElements(Driver.getDriver(),this);

    }

}
