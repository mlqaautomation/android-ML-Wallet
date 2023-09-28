package com.mlwallet.pages;

import org.openqa.selenium.By;

public class MLGcashServicesPage {
    public static By objGcash = By.xpath("//*[@text='GCash']");
    public static By objGcashOptionsPage = By.xpath("//*[@text='GCash Options']");
    public static By objSendMoney = By.xpath("//*[@text='Send Money']");
    public static By objRecieverModal = By.xpath("//*[@text='Receiver']/ancestor::android.view.ViewGroup[1]");
    public static By objMobileNumberInput = By.xpath("//*[@text='+63']/following-sibling::android.widget.EditText");
    public static By objSelectFromContacts = By.xpath("//*[@text='Receiver']/following-sibling::android.view.ViewGroup[5]");
    public static By objSearchContact = By.xpath("//*[@resource-id='OO7ML4']/child::android.widget.EditText");
    public static By objContactsPage = By.xpath("//*[@text='Contacts']");
    public static By objContacts = By.xpath("//*[@text='Contacts']");
    public static By objFavorites = By.xpath("//*[@text='Favorites']");
    public static By objNextbtn = By.xpath("//*[@text='Next']");
    public static By objGcashMobileNumber = By.xpath("//*[@text='GCash Mobile Number']/following-sibling::android.widget.TextView");
    public static By objAmountToSend = By.xpath("//*[@text='PHP']/following-sibling::android.widget.EditText");
    public static By objSendMoneyToGcashPage = By.xpath("//*[@text='Send Money to GCash']");
    public static By objTransactionDetailsModal = By.xpath("//*[@resource-id='WTDFY6']");
    public static By objConfirmbtn = By.xpath("//*[@text='Confirm']");

}
