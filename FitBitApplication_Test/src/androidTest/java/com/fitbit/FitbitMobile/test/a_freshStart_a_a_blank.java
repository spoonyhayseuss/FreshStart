package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class a_freshStart_a_a_blank extends ActivityInstrumentationTestCase2 {
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
    public a_freshStart_a_a_blank() throws ClassNotFoundException {
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
		solo.waitForActivity("LandingActivity_", 1000);
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("a_a_blank_a_launch");
        //Click on Log in
		solo.clickOnView(solo.getView("btn_log_in"));

        //Wait for activity: 'com.fitbit.onboarding.login.LoginActivity'
		assertTrue("LoginActivity is not found!", solo.waitForActivity("LoginActivity"));
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("a_a_blank_b_loginScreen");
        //Click on Log in
		solo.clickOnView(solo.getView("login_button"));
        //screenshot
        solo.takeScreenshot("a_a_blank_c_tapLogInBlank");
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("a_a_blank_e_blankLogIn");
        //Click on OK
		solo.clickOnView(solo.getView(android.R.id.button1));
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("a_a_blank_f_okDismiss");
	}
}
