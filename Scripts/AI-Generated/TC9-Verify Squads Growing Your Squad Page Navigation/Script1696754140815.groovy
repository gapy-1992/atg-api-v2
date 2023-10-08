import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page docs squads growing-your-squad'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/docs/squads/growing-your-squad')

'step 2: Add visual checkpoint at Page docs squads growing-your-squad'

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Verify Squads Growing Your Squad Page Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
