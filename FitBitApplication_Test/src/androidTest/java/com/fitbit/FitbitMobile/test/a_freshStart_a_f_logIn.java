package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class a_freshStart_a_f_logIn extends ActivityInstrumentationTestCase2 {
  	private Solo solo;
  	
  	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.fitbit.onboarding.landing.LandingActivity_";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
        }
    }
  	
  	@SuppressWarnings("unchecked")
    public a_freshStart_a_f_logIn() throws ClassNotFoundException {
        super(launcherActivityClass);
    }

  	public void setUp() throws Exception {
        super.setUp();
		solo = new Solo(getInstrumentation());
		getActivity();
  	}
  
   	@Override
   	public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
  	}
  
	public void testRun() {
        //Wait for activity: 'com.fitbit.onboarding.landing.LandingActivity_'
		solo.waitForActivity("LandingActivity_", 2000);
        //Sleep for x milliseconds
        solo.sleep(3000);
        //screenshot
        solo.takeScreenshot("a_f_login_a_launch");
        //Click on Log in
		solo.clickOnView(solo.getView("btn_log_in"));
        //Wait for activity: 'com.fitbit.onboarding.login.LoginActivity'
		assertTrue("LoginActivity is not found!", solo.waitForActivity("LoginActivity"));
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("a_f_login_b_logInScreen");
        //Enter the text: 'awitherspoon@fitbit.com'
		solo.clearEditText((android.widget.EditText) solo.getView("login_email"));
		solo.enterText((android.widget.EditText) solo.getView("login_email"), "exercise@android.com");
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("a_f_login_c_enterEmail");
        //Enter the text: 'aaron123'
		solo.clearEditText((android.widget.EditText) solo.getView("login_password"));
		solo.enterText((android.widget.EditText) solo.getView("login_password"), "exercise");
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("a_f_login_d_enterPass");
        //Click on Log in
		solo.clickOnView(solo.getView("login_button"));
        //Wait for activity: 'com.fitbit.home.ui.HomeActivity_'
		assertTrue("HomeActivity_ is not found!", solo.waitForActivity("HomeActivity_"));
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("a_f_login_e_dashboard");
	}
}
