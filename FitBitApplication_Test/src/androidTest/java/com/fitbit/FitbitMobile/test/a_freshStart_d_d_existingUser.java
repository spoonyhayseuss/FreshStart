package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class a_freshStart_d_d_existingUser extends ActivityInstrumentationTestCase2 {
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
    public a_freshStart_d_d_existingUser() throws ClassNotFoundException {
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
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("d_d_existingUser_a_launch");
        //Click on Join Fitbit
		solo.clickOnView(solo.getView("btn_join_fitbit"));
        //Wait for activity: 'com.fitbit.onboarding.setup.CheckDeviceActivity_'
		assertTrue("CheckDeviceActivity_ is not found!", solo.waitForActivity("CheckDeviceActivity_"));
        //Wait for activity: 'com.fitbit.device.ui.setup.choose.ChooseTrackerActivity_'
		assertTrue("ChooseTrackerActivity_ is not found!", solo.waitForActivity("ChooseTrackerActivity_"));
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("d_d_existingUser_b_deviceList");
        //Click on Surge Fitness super watch
        solo.clickInList(1, 0);
        //Wait for activity: 'com.fitbit.device.ui.setup.choose.ConfirmDeviceActivity_'
        assertTrue("ConfirmDeviceActivity_ is not found!", solo.waitForActivity("ConfirmDeviceActivity_"));
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("d_d_existingUser_c_surge");
        //Click on Set up your Surge
        solo.clickOnView(solo.getView("btn_setup"));

        //Wait for activity: 'com.fitbit.onboarding.login.LoginActivity_'
        assertTrue("LoginActivity_ is not found!", solo.waitForActivity("LoginActivity"));
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("d_d_existingUser_d_joinScreen");
        //Enter the text: 'awitherspoon@fitbit.com'
		solo.clearEditText((android.widget.EditText) solo.getView("login_email"));
		solo.enterText((android.widget.EditText) solo.getView("login_email"), "exercise@android.com");
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("d_d_existingUser_e_enterEmail");
        //Enter the text: 'aaron'
		solo.clearEditText((android.widget.EditText) solo.getView("login_password"));
		solo.enterText((android.widget.EditText) solo.getView("login_password"), "exercise");
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("d_d_existingUser_f_enterPassword");
        //Click on Empty Text View
		solo.clickOnView(solo.getView("termsCheckBox"));
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("d_d_existingUser_g_checkTerms");
        //Click on Create an account
		solo.clickOnView(solo.getView("login_button"));

        //Wait for dialog
		solo.waitForDialogToOpen(5000);
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("d_d_existingUser_h_existingError");

        //Click on OK
		solo.clickOnView(solo.getView(android.R.id.button1));
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("d_d_existingUser_i_okDismiss");
	}
}
