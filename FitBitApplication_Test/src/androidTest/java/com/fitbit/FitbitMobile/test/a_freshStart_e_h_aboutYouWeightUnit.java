package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class a_freshStart_e_h_aboutYouWeightUnit extends ActivityInstrumentationTestCase2 {
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
    public a_freshStart_e_h_aboutYouWeightUnit() throws ClassNotFoundException {
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

        //Enter the text: 'noraa09@fbqa.com'
        solo.clearEditText((android.widget.EditText) solo.getView("login_email"));
        solo.enterText((android.widget.EditText) solo.getView("login_email"), "noraa33@fbqa.com");

        //Click on Empty Text View
        solo.clickOnView(solo.getView("login_password"));

        //Enter the text: 'noraa'
        solo.clearEditText((android.widget.EditText) solo.getView("login_password"));
        solo.enterText((android.widget.EditText) solo.getView("login_password"), "noraa123");

        //Click on Empty Text View
        solo.clickOnView(solo.getView("termsCheckBox"));

        //Click on Create an account
        solo.clickOnView(solo.getView("login_button"));
        //Wait for activity: 'com.fitbit.onboarding.profile.AboutYouActivity_'
        assertTrue("AboutYouActivity is not found!", solo.waitForActivity("AboutYouActivity"));
        //Sleep
        solo.sleep(500);

        solo.clearEditText(0);
        solo.enterText(0, "Tester Testington");




        solo.clearEditText(4);
        solo.enterText(4, "200");


        solo.sleep(500);

        solo.clickOnText(java.util.regex.Pattern.quote("lbs"));
        solo.clickOnText(java.util.regex.Pattern.quote("stone"));
        solo.clickOnText(java.util.regex.Pattern.quote("14"));
        solo.clickOnText(java.util.regex.Pattern.quote("4 lbs"));

        solo.clickOnText(java.util.regex.Pattern.quote("stone"));
        solo.clickOnText(java.util.regex.Pattern.quote("kg"));
        solo.clickOnText(java.util.regex.Pattern.quote("90.7"));



        //Click on Save
        //solo.clickOnView(solo.getView("save_button"));
        //Sleep
        //solo.sleep(500);
        //Click on OK
        //solo.clickOnView(solo.getView(android.R.id.button1));




    }
}
