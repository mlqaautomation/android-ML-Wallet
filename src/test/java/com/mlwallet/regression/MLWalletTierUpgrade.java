package com.mlwallet.regression;

import com.business.mlwallet.MLWalletBusinessLogic;
import com.driverInstance.AppiumServer;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MLWalletTierUpgrade {

    public static String deviceName;
    public static String portno;
    public  static com.business.mlwallet.MLWalletBusinessLogic MLWalletBusinessLogic;


    @Parameters({"deviceName","portno"})
    @BeforeMethod
    public void before(String deviceName,String portno) throws Exception {
        AppiumServer.startServer();
        MLWalletTierUpgrade.deviceName=deviceName;
        MLWalletTierUpgrade.portno= portno;
        MLWalletBusinessLogic = new MLWalletBusinessLogic("MLWallet",deviceName,portno);
    }

//    @Test(priority = 1)
//    public void tierUpgradeHomePageIIconValidationAsBuyerTierUser_TU_TC_01() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeHomePageIIconValidationAsBuyerTierUser_TU_TC_01();
//    }
//
//    @Test(priority = 2)
//    public void tierUpgradeHomePageIIconValidationAsSemiVerifiedTierUser_TU_TC_02() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeHomePageIIconValidationAsSemiVerifiedTierUser_TU_TC_02();
//    }
//
//    @Test(priority = 3)
//    public void tierUpgradeHomePageIIconValidationAsFullyVerifiedTierUser_TU_TC_03() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeHomePageIIconValidationAsFullyVerifiedTierUser_TU_TC_03();
//    }
//
//    @Test(priority = 4)
//    public void tierUpgradeVerificationTierPerksPageNavigationAsBuyerTierUser_TU_TC_04() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeVerificationTierPerksPageNavigationAsBuyerTierUser_TU_TC_04();
//    }
//
//    @Test(priority = 5)
//    public void tierUpgradeVerificationTierPerksPageNavigationAsSemiVerifiedTierUser_TU_TC_05() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeVerificationTierPerksPageNavigationAsSemiVerifiedTierUser_TU_TC_05();
//    }
//
//    @Test(priority = 6)
//    public void tierUpgradeVerificationTierPerksBackBtnValidation_TU_TC_06() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeVerificationTierPerksBackBtnValidation_TU_TC_06();
//    }
//
//    @Test(priority = 7)
//    public void tierUpgradeUpgradeTierLevelBtnValidationForSemiVerifiedTabAsBuyTierUser_TU_TC_07() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeUpgradeTierLevelBtnValidationForSemiVerifiedTabAsBuyTierUser_TU_TC_07();
//    }
//
//    @Test(priority = 8)
//    public void tierUpgradeUpgradeTierLevelBtnValidationForFullyVerifiedTabAsBuyTierUser_TU_TC_08() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeUpgradeTierLevelBtnValidationForFullyVerifiedTabAsBuyTierUser_TU_TC_08();
//    }
//
//    @Test(priority = 9)
//    public void tierUpgradeUpgradeTierLevelBtnValidationForBranchVerifiedTabAsBuyTierUser_TU_TC_09() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeUpgradeTierLevelBtnValidationForBranchVerifiedTabAsBuyerTierUser_TU_TC_09();
//    }
//
//    @Test(priority = 10)
//    public void tierUpgradeUpgradeTierLevelBtnValidationForFullyVerifiedTabAsSemiVerifiedTierUser_TU_TC_10() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeUpgradeTierLevelBtnValidationForFullyVerifiedTabAsSemiVerifiedTierUser_TU_TC_10();
//    }
//
//    @Test(priority = 11)
//    public void tierUpgradeUpgradeTierLevelBtnValidationForBranchVerifiedTabAsSemiVerifiedTierUser_TU_TC_11() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeUpgradeTierLevelBtnValidationForBranchVerifiedTabAsSemiVerifiedTierUser_TU_TC_11();
//    }
//
//    @Test(priority = 12)
//    public void tierUpgradeAccountDetailsPageNavigationAsBuyerTierUserToUpgradeToSemiVerifiedTier_TU_TC_12() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeAccountDetailsPageNavigationAsBuyerTierUserToUpgradeToSemiVerifiedTier_TU_TC_12();
//    }
//
//    @Test(priority = 13)
//    public void tierUpgradeAccountDetailsPageNavigationAsBuyerTierUserToUpgradeToFullyVerifiedTier_TU_TC_13() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeAccountDetailsPageNavigationAsBuyerTierUserToUpgradeToFullyVerifiedTier_TU_TC_13();
//    }
//
//    @Test(priority = 14)
//    public void tierUpgradeAccountDetailsPageNavigationAsSemiVerifiedTierUserToUpgradeToFullyVerifiedTier_TU_TC_14() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeAccountDetailsPageNavigationAsSemiVerifiedTierUserToUpgradeToFullyVerifiedTier_TU_TC_14();
//    }
//
//    @Test(priority = 15)
//    public void tierUpgradeAccountDetailsPageBackBtnValidation_TU_TC_15() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeAccountDetailsPageBackBtnValidation_TU_TC_15();
//    }
//
//    @Test(priority = 16)
//    public void tierUpgradeAutoSuggestionsValidationForProductServicesOffered_TU_TC_16() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeAutoSuggestionsValidationForProductServicesOffered_TU_TC_16();
//    }
//
//    @Test(priority = 17)
//    public void tierUpgradeAutoSuggestionsValidationForPositionAtWork_TU_TC_17() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeAutoSuggestionsValidationForPositionAtWork_TU_TC_17();
//    }
//
//    @Test(priority = 18)
//    public void tierUpgradeAutoSuggestionsValidationForNatureOfWork_TU_TC_18() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeAutoSuggestionsValidationForNatureOfWork_TU_TC_18();
//    }
//
//    @Test(priority = 19)
//    public void tierUpgradeConfirmDetailsBtnValidationInAccountDetailsPage_TU_TC_19() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeConfirmDetailsBtnValidationInAccountDetailsPage_TU_TC_19();
//    }
//
//    @Test(priority = 20)
//    public void tierUpgradePageNavigation_TU_TC_20() throws Exception {
//        MLWalletBusinessLogic.tierUpgradePageNavigation_TU_TC_20();
//    }

    @Test(priority = 21)
    public void tierUpgradeFullyVerifiedTierTabUIValidation_TU_TC_21() throws Exception {
        MLWalletBusinessLogic.tierUpgradeFullyVerifiedTierTabUIValidation_TU_TC_21();
    }


    @AfterMethod
    public void afterMethod(){
        AppiumServer.stopServer();
    }





}
