package com.mlwallet.daily.regression;

import com.business.mlwallet.ShopItemsClass;
import com.mlshop.MLShop_TestCases;
import com.driverInstance.AppiumServer;
import com.mlshop.MLShop_TestCases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MLShopItems {
    public static String deviceName;
    public static String portno;
    public static MLShop_TestCases shopItems;



    //@BeforeSuite(groups = { "All" })
    @Parameters({"deviceName","portno"})
    @BeforeMethod
    public void before(String deviceName,String portno) throws Exception {
        AppiumServer.startServer();
        MLShopItems.deviceName=deviceName;
        MLShopItems.portno= portno;
        shopItems = new MLShop_TestCases("MLWallet",deviceName,portno);
    }

//    @Test(priority = 1)
//    public void MLShop_Homepage_TC_01() throws Exception
//    {
//        shopItems.MLShop_Homepage_TC_01();
//    }
//    @Test(priority = 2)
//    public void MLShop_Aboutpage_TC_02() throws Exception
//    {
//        shopItems.MLShop_Aboutpage_TC_02();
//    }
//    @Test(priority = 3)
//    public void MLShop_Contactpage_TC_03() throws Exception
//    {
//        shopItems.MLShop_Contactpage_TC_03();
//    }
//    @Test(priority = 4)
//
//    public void MLShop_ShopCart_TC_04() throws Exception
//    {
//        shopItems.MLShop_ShopCart_TC_04();
//    }
//    @Test(priority = 5)
//    public void MLShop_Profile_TC_05() throws Exception
//    {
//        shopItems.MLShop_Profile_TC_05();
//    }
//    @Test(priority = 6)
//
//    public void MLShop_PurchaseHistory_TC_06() throws Exception
//    {
//        shopItems.MLShop_PurchaseHistory_TC_06();
//    }
    @Test(priority = 7)
    public void MLShop_Logout_TC_07() throws Exception
    {
        shopItems.MLShop_Logout_TC_07();
    }

    @Test(priority = 8)
    public void MLShop_ExitIcon_TC_13() throws Exception
    {
        shopItems.MLShop_ExitIcon_TC_13();
    }


//    @Test(priority = 0)
//   public void shopItemsJewelryAvailabilityProductTypesUIValidation_MLS_TC_18() throws Exception
//    {
//        shopItems.shopItemsJewelryAvailabilityProductTypesUIValidation_MLS_TC_18();
//    }
//    @Test(priority = 1)
//    public void shopItemsSelectedItemScreenRingsDetailsUIValidation_MLS_TC_20() throws Exception
//    {
//        shopItems.shopItemsSelectedItemScreenRingsDetailsUIValidation_MLS_TC_20();
//    }
//
//    @Test(priority = 2)
//    public void shopItemsSelectedItemScreenBraceletAndBangleDetailsUIValidation_MLS_TC_21() throws Exception
//    {
//        shopItems.shopItemsSelectedItemScreenBraceletAndBangleDetailsUIValidation_MLS_TC_21();
//    }

//    @Test(priority = 1)
//    public void MLShop_PurchaseItemViaMlWallet_TC_178() throws Exception
//    {
//        shopItems.MLShop_PurchaseItemViaMlWallet_TC_178();
//    }
//
//
//    @Test(priority = 2)
//    public void MLShop_PaymongoPortalCreditDebit_TC_205() throws Exception
//    {
//        shopItems.MLShop_PaymongoPortalCreditDebit_TC_205();
//    }
//
//    @Test(priority = 3)
//    public void MLShop_PaymongoPortalGrabPay_TC_206() throws Exception
//    {
//        shopItems.MLShop_PaymongoPortalGrabPay_TC_206();
//    }
//
//    @Test(priority = 4)
//    public void MLShop_PaymongoPortalGcash_TC_207() throws Exception
//    {
//        shopItems.MLShop_PaymongoPortalGcash_TC_207();
//    }
//    @Test(priority = 5)
//    public void MLShop_PaymongoPortalMaya_TC_208() throws Exception
//    {
//        shopItems.MLShop_PaymongoPortalMaya_TC_208();
//    }
//    @Test(priority = 6)
//    public void MLShop_PaymongoPortalDirectOnlineBank_TC_209() throws Exception
//    {
//        shopItems.MLShop_PaymongoPortalDirectOnlineBank_TC_209();
//    }

//
//    @Test(priority = 2)
//    public void MLShop_Select14kMaterialDisplayProductionValidation_SI_TC_42() throws Exception
//    {
//        shopItems.MLShop_Select14kMaterialDisplayProductionValidation_SI_TC_42();
//    }
//
//    @Test(priority = 3)
//    public void MLShop_Select18kMaterialDisplayProductionValidation_SI_TC_43() throws Exception
//    {
//        shopItems.MLShop_Select18kMaterialDisplayProductionValidation_SI_TC_43();
//    }
//
//    @Test(priority = 4)
//    public void MLShop_Select20kMaterialDisplayProductionValidation_SI_TC_44() throws Exception
//    {
//        shopItems.MLShop_Select20kMaterialDisplayProductionValidation_SI_TC_44();
//    }
//
//    @Test(priority = 5)
//    public void MLShop_Select21kMaterialDisplayProductionValidation_SI_TC_45() throws Exception
//    {
//        shopItems.MLShop_Select21kMaterialDisplayProductionValidation_SI_TC_45();
//    }
//
//    @Test(priority = 6)
//    public void MLShop_Select22kMaterialDisplayProductionValidation_SI_TC_46() throws Exception
//    {
//        shopItems.MLShop_Select22kMaterialDisplayProductionValidation_SI_TC_46();
//    }
//
//    @Test(priority = 7)
//    public void MLShop_Select12kMaterialDisplayProductionValidation_SI_TC_47() throws Exception
//    {
//        shopItems.MLShop_Select12kMaterialDisplayProductionValidation_SI_TC_47();
//    }

//    @Test(priority = 13)
//    public void MLShop_FilteringLadiesProduct_SI_TC_53() throws Exception
//    {
//        shopItems.MLShop_FilteringLadiesProduct_SI_TC_53();
//    }
//    @Test(priority = 14)
//    public void MLShop_FilteringMensProduct_SI_TC_54() throws Exception
//    {
//        shopItems.MLShop_FilteringMensProduct_SI_TC_54();
//    }
//    @Test(priority = 15)
//    public void MLShop_FilteringUnisexProduct_SI_TC_55() throws Exception {
//        shopItems.MLShop_FilteringUnisexProduct_SI_TC_55();
//
//    }
//    @Test(priority = 1)
//    public void MLShop_NecklaceCheckboxProductTypeUiValidation_TC_35() throws Exception
//    {
//        shopItems.MLShop_NecklaceCheckboxProductTypeUiValidation_TC_35();
//    }
//    @Test(priority = 2)
//    public void MLShop_objBraceletAndBangleCheckboxProductTypeUiValidation_TC_36() throws Exception
//    {
//        shopItems.MLShop_objBraceletAndBangleCheckboxProductTypeUiValidation_TC_36();
//    }
//    @Test(priority = 3)
//    public void MLShop_EarringsCheckboxProductTypeUiValidation_TC_37() throws Exception
//    {
//        shopItems.MLShop_EarringsCheckboxProductTypeUiValidation_TC_37();
//    }
//    @Test(priority = 4)
//    public void MLShop_PendantCheckboxProductTypeUiValidation_TC_38() throws Exception
//    {
//        shopItems.MLShop_PendantCheckboxProductTypeUiValidation_TC_38();
//    }
//    @Test(priority = 5)
//    public void MLShop_SetsCheckboxProductTypeUiValidation_TC_39() throws Exception
//    {
//        shopItems.MLShop_SetsCheckboxProductTypeUiValidation_TC_39();
//    }
//    @Test(priority = 6)
//    public void MLShop_BrouchCheckboxProductTypeUiValidation_TC_40() throws Exception
//    {
//        shopItems.MLShop_BrouchCheckboxProductTypeUiValidation_TC_40();
//    }
    @Test(priority = 13)
    public void MLShop_FilteringLadiesProduct_SI_TC_53() throws Exception
    {
        shopItems.MLShop_FilteringLadiesProduct_SI_TC_53();
    }
    @Test(priority = 14)
    public void MLShop_FilteringMensProduct_SI_TC_54() throws Exception
    {
        shopItems.MLShop_FilteringMensProduct_SI_TC_54();
    }
    @Test(priority = 15)
    public void MLShop_FilteringUnisexProduct_SI_TC_55() throws Exception
    {
        shopItems.MLShop_FilteringUnisexProduct_SI_TC_55();
    }
    @AfterMethod
    public void afterMethod(){
        AppiumServer.stopServer();
    }

}
