package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class a_freshStart_c_g_aria extends ActivityInstrumentationTestCase2 {
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
    public a_freshStart_c_g_aria() throws ClassNotFoundException {
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
        solo.takeScreenshot("c_g_aria_a_launch");
        //Click on Join Fitbit
		solo.clickOnView(solo.getView("btn_join_fitbit"));
        //Wait for activity: 'com.fitbit.onboarding.setup.CheckDeviceActivity_'
		assertTrue("CheckDeviceActivity_ is not found!", solo.waitForActivity("CheckDeviceActivity_"));
        //Wait for activity: 'com.fitbit.device.ui.setup.choose.ChooseTrackerActivity_'
		assertTrue("ChooseTrackerActivity_ is not found!", solo.waitForActivity("ChooseTrackerActivity_"));
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("c_g_aria_b_deviceList");
        //Scroll to Aria Wireless smart scale
		android.widget.ListView listView0 = (android.widget.ListView) solo.getView(android.widget.ListView.class, 0);
		solo.scrollListToLine(listView0, 4);
        solo.sleep(500);
        solo.takeScreenshot("c_g_aria_c_scrollToAria");
        //Click on Aria Wireless smart scale
		solo.clickOnText(java.util.regex.Pattern.quote("Aria"));
        //Wait for activity: 'com.fitbit.device.ui.setup.choose.ConfirmDeviceActivity_'
		assertTrue("ConfirmDeviceActivity_ is not found!", solo.waitForActivity("ConfirmDeviceActivity_"));
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("c_g_aria_d_aria");
        //Click on See what Fitbit trackers can do
		solo.clickOnView(solo.getView("btn_learn_more"));
        //Wait for activity: 'com.fitbit.device.ui.setup.choose.ExplainTrackersActivity_'
		assertTrue("ExplainTrackersActivity_ is not found!", solo.waitForActivity("ExplainTrackersActivity_"));
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("c_g_aria_e_seeWhatFitbitCanDo");
        //Press menu back key
		solo.goBack();
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("c_g_aria_f_backToAria");
        //Click on Set up your Aria
		solo.clickOnView(solo.getView("btn_setup"));
        solo.takeScreenshot("c_g_aria_g_tapOnSetUpAria");
        //Sleep for x milliseconds
        solo.sleep(3000);
        //screenshot
        solo.takeScreenshot("c_g_aria_f_ariaWeb");
	}
}
