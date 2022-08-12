package stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {

    @Before("@userRegistration")
    public void beforeHook()
    {
        System.out.println("-----**** >>> This is before Hook >>>");
    }

    @After("@userRegistration")
    public void afterHook()
    {
        System.out.println("-----**** >>> This is after Hook >>>");
    }


    @Before("@blank")
    public void beforeBlankHook()
    {
        System.out.println("-----**** >>> This is before Blank Hook >>>");
    }

    @After("@blank")
    public void afterBlankHook()
    {
        System.out.println("-----**** >>> This is after Blank Hook >>>");
    }
}
