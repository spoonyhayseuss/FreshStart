package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class a_freshStart_c_j_mobileTrack extends ActivityInstrumentationTestCase2 {
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
    public a_freshStart_c_j_mobileTrack() throws ClassNotFoundException {
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
        solo.takeScreenshot("c_j_mobileTrack_a_launch");
        //Click on Join Fitbit
		solo.clickOnView(solo.getView("btn_join_fitbit"));
        //Wait for activity: 'com.fitbit.onboarding.setup.CheckDeviceActivity_'
		assertTrue("CheckDeviceActivity_ is not found!", solo.waitForActivity("CheckDeviceActivity_"));
        //Wait for activity: 'com.fitbit.device.ui.setup.choose.ChooseTrackerActivity_'
		assertTrue("ChooseTrackerActivity_ is not found!", solo.waitForActivity("ChooseTrackerActivity_"));
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("c_j_mobileTrack_b_deviceList");
        //Click on No tracker yet? Your phone tracks the basics
		solo.clickOnView(solo.getView("footer"));
        solo.takeScreenshot("c_tapOnMobileTrack");

        //Wait for activity: 'com.fitbit.device.ui.setup.choose.ConfirmDeviceActivity_'
		assertTrue("ConfirmDeviceActivity_ is not found!", solo.waitForActivity("ConfirmDeviceActivity_"));

        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("c_j_mobileTrack_d_mobileTrack");
        //Click on See what Fitbit trackers can do
		solo.clickOnView(solo.getView("btn_learn_more"));
        //Wait for activity: 'com.fitbit.device.ui.setup.choose.ExplainTrackersActivity_'
		assertTrue("ExplainTrackersActivity_ is not found!", solo.waitForActivity("ExplainTrackersActivity_"));
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("c_j_mobileTrack_e_seeWhatFitbitCanDo");
        //Press menu back key
		solo.goBack();
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("c_j_mobileTrack_f_backToMobileTrack");
        //Click on Set up your phone
		solo.clickOnView(solo.getView("btn_setup"));
        solo.takeScreenshot("c_j_mobileTrack_g_tapOnSetUpMobileTrack");
        //Wait for activity: 'com.fitbit.onboarding.login.LoginActivity'
		assertTrue("LoginActivity is not found!", solo.waitForActivity("LoginActivity"));
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("c_j_mobileTrack_h_joinScreen");
	}
}
