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
//
//    @Test(priority = 21)
//    public void tierUpgradeFullyVerifiedTierTabUIValidation_TU_TC_21() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeFullyVerifiedTierTabUIValidation_TU_TC_21();
//    }
//
//    @Test(priority = 22)
//    public void tierUpgradeAccountDetailsPageUIValidation_TU_TC_23() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeAccountDetailsPageUIValidation_TU_TC_23();
//    }
//
//    @Test(priority = 23)
//    public void tierUpgradePageUIValidation_TU_TC_24() throws Exception {
//        MLWalletBusinessLogic.tierUpgradePageUIValidation_TU_TC_24();
//    }
//
//    @Test(priority = 24)
//    public void tierUpgradeBackArrowBtnValidation_TU_TC_25() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeBackArrowBtnValidation_TU_TC_25();
//    }
//
//    @Test(priority = 25)
//    public void tierUpgradeUploadIDPhotosUIValidationAfterSelectingPHILHEALTH_TU_TC_26() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeUploadIDPhotosUIValidationAfterSelectingPHILHEALTH_TU_TC_26();
//    }
//
//    @Test(priority = 26)
//    public void tierUpgradeUploadIDPhotosBackArrowBtnValidation_TU_TC_27() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeUploadIDPhotosBackArrowBtnValidation_TU_TC_27();
//    }
//
//    @Test(priority = 27)
//    public void tierUpgradeScanFrontOfIDPageUIValidation_TU_TC_28() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeScanFrontOfIDPageUIValidation_TU_TC_28();
//    }
//
//    @Test(priority = 28)
//    public void tierUpgradeScanFrontOfIDPageBackArrowBtnValidation_TU_TC_29() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeScanFrontOfIDPageBackArrowBtnValidation_TU_TC_29();
//    }
//
//    @Test(priority = 29)
//    public void tierUpgradeScanBackOfIDPageUIValidation_TU_TC_30() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeScanBackOfIDPageUIValidation_TU_TC_30();
//    }
//
//    @Test(priority = 30)
//    public void tierUpgradeScanBackOfIDPageBackArrowBtnValidation_TU_TC_31() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeScanBackOfIDPageBackArrowBtnValidation_TU_TC_31();
//    }
//
//    @Test(priority = 31)
//    public void tierUpgradeTakeAFaceIdentityPhotoPageUIValidation_TU_TC_32() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeTakeAFaceIdentityPhotoPageUIValidation_TU_TC_32();
//    }
//
//    @Test(priority = 32)
//    public void tierUpgradeTakeAFaceIdentityPhotoPageBackArrowBtnValidation_TU_TC_33() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeTakeAFaceIdentityPhotoPageBackArrowBtnValidation_TU_TC_33();
//    }

//    @Test(priority = 33)
//    public void tierUpgradeToBranchVerifiedFromBuyerTier_TU_TC_244() throws Exception {
//        MLWalletBusinessLogic.tierUpgradeToBranchVerifiedFromBuyerTier_TU_TC_244();
//    }
//    @Test(priority = 1)
//    public void TierUpgradeSourceOfIncomeFieldValidation_TU_TC_85() throws Exception {
//    MLWalletBusinessLogic.TierUpgradeSourceOfIncomeFieldValidation_TU_TC_85();
//    }
//    @Test(priority = 2)
//    public void TierUpgradeCompanyFieldValidation_TU_TC_86() throws Exception {
//        MLWalletBusinessLogic.TierUpgradeCompanyFieldValidation_TU_TC_86();
//    }
//    @Test(priority = 3)
//    public void TierUpgradeOrganizationNameFieldValidation_TU_TC_87() throws Exception {
//        MLWalletBusinessLogic.TierUpgradeOrganizationNameFieldValidation_TU_TC_87();
//    }@Test(priority = 4)
//    public void TierUpgradeProductServicesFieldValidation_TU_TC_88() throws Exception {
//        MLWalletBusinessLogic.TierUpgradeProductServicesFieldValidation_TU_TC_88();
//    }@Test(priority = 5)
//    public void TierUpgradeEmptyAddressFieldValidation_TU_TC_89() throws Exception {
//        MLWalletBusinessLogic.TierUpgradeEmptyAddressFieldValidation_TU_TC_89();
//    }@Test(priority = 6)
//    public void TierUpgradeSpecialAddressFieldValidation_TU_TC_90() throws Exception {
//        MLWalletBusinessLogic.TierUpgradeSpecialAddressFieldValidation_TU_TC_90();
//    }@Test(priority = 7)
//    public void TierUpgradePositionFieldValidation_TU_TC_91() throws Exception {
//        MLWalletBusinessLogic.TierUpgradePositionFieldValidation_TU_TC_91();
//    }@Test(priority = 8)
//    public void TierUpgradeNatureOfWorkFieldValidation_TU_TC_92() throws Exception {
//        MLWalletBusinessLogic.TierUpgradeNatureOfWorkFieldValidation_TU_TC_92();
//    }@Test(priority = 9)
//    public void TierUpgradePensionFieldValidation_TU_TC_93() throws Exception {
//        MLWalletBusinessLogic.TierUpgradePensionFieldValidation_TU_TC_93();
//    }@Test(priority = 10)
//    public void TierUpgradeYearRetiredFieldValidation_TU_TC_94() throws Exception {
//        MLWalletBusinessLogic.TierUpgradeYearRetiredFieldValidation_TU_TC_94();
//    }@Test(priority = 11)
//    public void TierUpgradePositionRetirementFieldValidation_TU_TC_95() throws Exception {
//        MLWalletBusinessLogic.TierUpgradePositionRetirementFieldValidation_TU_TC_95();
//    }@Test(priority = 12)
//    public void TierUpgradeRemarksFieldValidation_TU_TC_96() throws Exception {
//        MLWalletBusinessLogic.TierUpgradeRemarksFieldValidation_TU_TC_96();
//    }@Test(priority = 13)
//    public void TierUpgradeErrorMessageUniversityIsRequiredEmptyFieldValidation_TU_TC_97() throws Exception {
//        MLWalletBusinessLogic.TierUpgradeErrorMessageUniversityIsRequiredEmptyFieldValidation_TU_TC_97();
//    }
//    @Test(priority = 14)
//    public void TierUpgradeErrorMessageUniversityNameSpecialCharactersValidation_TU_TC_98() throws Exception {
//        MLWalletBusinessLogic.TierUpgradeErrorMessageUniversityNameSpecialCharactersValidation_TU_TC_98();
//    }
//    @Test(priority = 15)
//    public void TierUpgradeErrorMessageSchoolAddressIsRequiredEmptyValidation_TU_TC_99() throws Exception {
//        MLWalletBusinessLogic.TierUpgradeErrorMessageSchoolAddressIsRequiredEmptyValidation_TU_TC_99();
//    }
//    @Test(priority = 16)
//    public void TierUpgradeErrorMessageSchoolAddressSpecialCharactersValidation_TU_TC_100() throws Exception {
//        MLWalletBusinessLogic.TierUpgradeErrorMessageSchoolAddressSpecialCharactersValidation_TU_TC_100();
//    }
//    @Test(priority = 17)
//    public void TierUpgradeErrorMessageProgramTypeIsRequiredEmptyFieldValidation_TU_TC_101() throws Exception {
//        MLWalletBusinessLogic.TierUpgradeErrorMessageProgramTypeIsRequiredEmptyFieldValidation_TU_TC_101();
//    }
//    @Test(priority = 18)
//    public void TierUpgradeErrorMessageProgramTypeSpecialCharactersValidation_TU_TC_102() throws Exception {
//        MLWalletBusinessLogic.TierUpgradeErrorMessageProgramTypeSpecialCharactersValidation_TU_TC_102();
//    }
//    @Test(priority = 19)
//    public void TierUpgradeErrorMessageOccupationNameIsRequiredEmptyFieldValidation_TU_TC_103() throws Exception {
//        MLWalletBusinessLogic.TierUpgradeErrorMessageOccupationNameIsRequiredEmptyFieldValidation_TU_TC_103();
//    }
//    @Test(priority = 20)
//    public void TierUpgradeErrorMessageOccupationNameSpecialCharactersValidation_TU_TC_104() throws Exception {
//        MLWalletBusinessLogic.TierUpgradeErrorMessageOccupationNameSpecialCharactersValidation_TU_TC_104();
//    }
//    @Test(priority = 21)
//    public void TierUpgradeErrorMessageSourceOfFundsIsRequiredEmptyFieldValidation_TU_TC_105() throws Exception {
//        MLWalletBusinessLogic.TierUpgradeErrorMessageSourceOfFundsIsRequiredEmptyFieldValidation_TU_TC_105();
//    }
//    @Test(priority = 22)
//    public void TierUpgradeErrorMessageEmployerNameSpecialCharactersValidation_TU_TC_106() throws Exception {
//        MLWalletBusinessLogic.TierUpgradeErrorMessageEmployerNameSpecialCharactersValidation_TU_TC_106();
//    }
//    @Test(priority = 23)
//    public void TierUpgradeErrorMessageWorkAddressSpecialCharactersValidation_TU_TC_107() throws Exception {
//        MLWalletBusinessLogic.TierUpgradeErrorMessageWorkAddressSpecialCharactersValidation_TU_TC_107();
//    }
    @Test(priority = 24)
    public void TierUpgradeErrorMessageRetiredFieldSpecialCharactersValidation_TU_TC_108() throws Exception {
        MLWalletBusinessLogic.TierUpgradeErrorMessageRetiredFieldSpecialCharactersValidation_TU_TC_108();
    }
//    @Test(priority = 25)
//    public void TierUpgradeBranchTierVerificationTierNavigation_TU_TC_109() throws Exception {
//        MLWalletBusinessLogic.TierUpgradeBranchTierVerificationTierNavigation_TU_TC_109();
//    }
//    @Test(priority = 26)
//    public void TierUpgradeSchoolUniveristyFieldValidation_TU_TC_110() throws Exception {
//        MLWalletBusinessLogic.TierUpgradeSchoolUniveristyFieldValidation_TU_TC_110();
//    }
//
//    @Test(priority = 27)
//    public void TierUpgradeSchoolAddressFieldValidation_TU_TC_111() throws Exception {
//        MLWalletBusinessLogic.TierUpgradeSchoolAddressFieldValidation_TU_TC_111();
//    }
//    @Test(priority = 28)
//    public void TierUpgradeGrantProgramFIeldValidation_TU_TC_112() throws Exception {
//        MLWalletBusinessLogic.TierUpgradeGrantProgramFIeldValidation_TU_TC_112();
//    }
//
//    @Test(priority = 29)
//    public void TierUpgradeOccupationFieldValidation_TU_TC_113() throws Exception {
//        MLWalletBusinessLogic.TierUpgradeOccupationFieldValidation_TU_TC_113();
//    }
//
//    @Test(priority = 30)
//    public void TierUpgradeOccupationFieldValidation_TU_TC_114() throws Exception {
//        MLWalletBusinessLogic.TierUpgradeOccupationFieldValidation_TU_TC_114();
//    }

    @AfterMethod
    public void afterMethod(){
        AppiumServer.stopServer();
    }

}
