package com.mlwallet.regression;

import com.business.mlwallet.BaseClass;
import com.business.mlwallet.DerivedBaseClass;
import com.propertyfilereader.PropertyFileReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

public abstract class BaseTest extends BaseClass {
    protected MLWalletBranchLocator mlWalletBranchLocator;
    protected MLWalletBuyEload mlWalletBuyEload;
    protected MLWalletCashInViaBranch mlWalletCashInViaBranch;
    protected MLWalletCashInViaBankScripts mlWalletCashInViaBankScripts;
    protected MLWalletCashOutViaBranch mlWalletCashOutViaBranch;

    @Parameters({"deviceName", "portno"})
    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(String deviceName, String portno) throws Exception {
        BaseClass baseClass = new DerivedBaseClass("mlwallet", deviceName, portno);
        propertyFileReader();
        softAssert = new SoftAssert();
        mlWalletBranchLocator = new MLWalletBranchLocator();
    }
    @AfterMethod
    public void afterTest() {
        tearDown();
    }
}
