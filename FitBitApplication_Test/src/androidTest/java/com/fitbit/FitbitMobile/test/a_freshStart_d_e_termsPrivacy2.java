package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class a_freshStart_d_e_termsPrivacy2 extends ActivityInstrumentationTestCase2 {
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
    public a_freshStart_d_e_termsPrivacy2() throws ClassNotFoundException {
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
        solo.takeScreenshot("d_e_termsPrivacy_a_launch");
        //Click on Join Fitbit
		solo.clickOnView(solo.getView("btn_join_fitbit"));
        //Wait for activity: 'com.fitbit.onboarding.setup.CheckDeviceActivity_'
		assertTrue("CheckDeviceActivity_ is not found!", solo.waitForActivity("CheckDeviceActivity_"));
        //Wait for activity: 'com.fitbit.device.ui.setup.choose.ChooseTrackerActivity_'
		assertTrue("ChooseTrackerActivity_ is not found!", solo.waitForActivity("ChooseTrackerActivity_"));
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("d_e_termsPrivacy_b_deviceList");
        //Click on Charge HR Wireless Heart Rate + sleep wristband with display
		solo.clickInList(2, 0);
        //Wait for activity: 'com.fitbit.device.ui.setup.choose.ConfirmDeviceActivity_'
		assertTrue("ConfirmDeviceActivity_ is not found!", solo.waitForActivity("ConfirmDeviceActivity_"));
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("d_e_termsPrivacy_c_chargeHR");
        //Click on Set up your Charge HR
		solo.clickOnView(solo.getView("btn_setup"));
        //Wait for activity: 'com.fitbit.onboarding.login.LoginActivity'
		assertTrue("LoginActivity is not found!", solo.waitForActivity("LoginActivity"));
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("d_e_termsPrivacy_d_joinScreen");
        //Click on Empty Text View
		solo.clickOnView(solo.getView("termsCheckBox"));
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("d_e_termsPrivacy_e_checkTerms");
        //Click on I agree to the Fitbit Terms of Service and Privacy Policy
		solo.clickOnView(solo.getView("termsTextView"));
        //Wait for activity: 'com.fitbit.ui.WebViewActivity'
		assertTrue("WebViewActivity is not found!", solo.waitForActivity("WebViewActivity"));
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("d_e_termsPrivacy_a_f_terms");
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Wait for activity: 'com.fitbit.ui.WebViewActivity'
		assertTrue("WebViewActivity is not found!", solo.waitForActivity("WebViewActivity"));
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("d_e_termsPrivacy_a_h_back");
        //Click on I agree to the Fitbit Terms of Service and Privacy Policy
		solo.clickOnView(solo.getView("termsTextView"));
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("d_e_termsPrivacy_a_i_privacy");
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("d_e_termsPrivacy_a_j_back");
        //Sleep for x milliseconds

	}
}
