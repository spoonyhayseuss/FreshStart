package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class a_freshStart_a_e_forgotPassword extends ActivityInstrumentationTestCase2 {
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
    public a_freshStart_a_e_forgotPassword() throws ClassNotFoundException {
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
        solo.takeScreenshot("a_e_forgotPassword_a_launch");
        //Click on Log in
		solo.clickOnView(solo.getView("btn_log_in"));
        //Wait for activity: 'com.fitbit.onboarding.login.LoginActivity'
		assertTrue("LoginActivity is not found!", solo.waitForActivity("LoginActivity"));
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("a_e_forgotPassword_b_loginScreen");
        //Click on Forgot password?
		solo.clickOnView(solo.getView("login_footer"));
        //Wait for activity: 'com.fitbit.onboarding.password.PasswordRecoveryActivity_'
		assertTrue("PasswordRecoveryActivity_ is not found!", solo.waitForActivity("PasswordRecoveryActivity_"));
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("a_e_forgotPassword_c_forgotPass");
        //Enter the text: 'awitherspoon@fitbit.com'
		solo.clearEditText((android.widget.EditText) solo.getView("password_recovery_email"));
		solo.enterText((android.widget.EditText) solo.getView("password_recovery_email"), "exercise@android.com");
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("a_e_forgotPassword_d_enterEmailForgotPassword");
        //Click on Send Reset Email
		solo.clickOnView(solo.getView("send_email_button"));
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("a_e_forgotPassword_e_emailSent");
        //Click on OK
		solo.goBack();
        //Sleep for x milliseconds
        solo.sleep(500);
        //screenshot
        solo.takeScreenshot("a_e_forgotPassword_f_forgotOkdismiss");

	}
}
