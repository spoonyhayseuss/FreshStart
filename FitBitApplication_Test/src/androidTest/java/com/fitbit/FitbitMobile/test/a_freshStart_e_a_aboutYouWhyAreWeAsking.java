package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class a_freshStart_e_a_aboutYouWhyAreWeAsking extends ActivityInstrumentationTestCase2 {
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
    public a_freshStart_e_a_aboutYouWhyAreWeAsking() throws ClassNotFoundException {
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
        solo.waitForActivity("LandingActivity_", 500);
        //Sleep
        solo.sleep(500);
        //Click on Join Fitbit
        solo.clickOnView(solo.getView("btn_join_fitbit"));
        //Wait for activity: 'com.fitbit.onboarding.setup.CheckDeviceActivity_'
        assertTrue("CheckDeviceActivity_ is not found!", solo.waitForActivity("CheckDeviceActivity_"));
        //Wait for activity: 'com.fitbit.device.ui.setup.choose.ChooseTrackerActivity_'
        assertTrue("ChooseTrackerActivity_ is not found!", solo.waitForActivity("ChooseTrackerActivity_"));
        //Sleep
        solo.sleep(500);

        //Click on Charge HR Wireless Heart Rate + sleep wristband with display
        solo.clickInList(2, 0);
        //Wait for activity: 'com.fitbit.device.ui.setup.choose.ConfirmDeviceActivity_'
        assertTrue("ConfirmDeviceActivity_ is not found!", solo.waitForActivity("ConfirmDeviceActivity_"));
        //Sleep
        solo.sleep(500);
        //Click on Set up your phone
        solo.clickOnView(solo.getView("btn_setup"));
        //Wait for activity: 'com.fitbit.onboarding.login.LoginActivity'
        assertTrue("LoginActivity is not found!", solo.waitForActivity("LoginActivity"));
        //Sleep
        solo.sleep(500);
        //Enter the text: 'noraa09@fbqa.com'
        solo.clearEditText((android.widget.EditText) solo.getView("login_email"));
        solo.enterText((android.widget.EditText) solo.getView("login_email"), "noraa33@fbqa.com");
        //Sleep
        solo.sleep(500);
        //Click on Empty Text View
        solo.clickOnView(solo.getView("login_password"));
        //Sleep
        solo.sleep(500);
        //Enter the text: 'noraa'
        solo.clearEditText((android.widget.EditText) solo.getView("login_password"));
        solo.enterText((android.widget.EditText) solo.getView("login_password"), "noraa123");
        //Sleep
        solo.sleep(500);
        //Click on Empty Text View
        solo.clickOnView(solo.getView("termsCheckBox"));
        //Sleep
        solo.sleep(500);
        //Click on Create an account
        solo.clickOnView(solo.getView("login_button"));
        //Wait for activity: 'com.fitbit.onboarding.profile.AboutYouActivity_'
        assertTrue("AboutYouActivity is not found!", solo.waitForActivity("AboutYouActivity"));
        //Sleep
        solo.sleep(500);
        solo.clickOnText(java.util.regex.Pattern.quote("Why are we"));
        solo.sleep(1000);
        //Click on OK
        solo.clickOnView(solo.getView(android.R.id.button1));
    }
}
