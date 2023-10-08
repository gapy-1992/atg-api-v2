import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page docs customize-your-feed preferences'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/docs/customize-your-feed/preferences')

'step 2: Add visual checkpoint at Page docs customize-your-feed preferences'

WebUI.takeFullPageScreenshotAsCheckpoint('TC13-Verify Customize Your Feed Preferences Page Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
