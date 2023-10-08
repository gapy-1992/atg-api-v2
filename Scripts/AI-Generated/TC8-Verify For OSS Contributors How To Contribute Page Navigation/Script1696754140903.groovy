import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Navigate to Page docs for-oss-contributors how-to%20contribute'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/docs/for-oss-contributors/how-to%20contribute-to-daily-dev')

'step 2: Add visual checkpoint at Page docs for-oss-contributors how-to%20contribute'

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Verify For OSS Contributors How To Contribute Page Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
