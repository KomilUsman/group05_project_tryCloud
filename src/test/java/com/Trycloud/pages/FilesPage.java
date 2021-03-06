package com.Trycloud.pages;

import com.Trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FilesPage {


    @FindBy(xpath = "//ul[@id='appmenu']/li[2]")
    public WebElement filesModule;

    @FindBy(xpath = "//a[@class='name']")
    public List<WebElement> twoFiles;

    @FindBy(xpath = "//th[@id='headerSelection' and @class='column-selection']")
    public WebElement topLeftCheckBox;

    @FindBy(xpath = "//label[@for='select-files-1111']")
    public WebElement firstCheckBox;

    @FindBy(xpath = "//label[@for='select-files-8993']")
    public WebElement secondCheckBox;

    @FindBy(xpath = "//li/a[.='Deleted files']")
    public WebElement deletedFiles;

    @FindBy(xpath = "(//tbody[@id='fileList'])[12]//tr//span[@class='nametext extra-data']/span[@class='innernametext']")
    public List<WebElement> deletedFileNames;

    @FindBy(xpath = "//*[@id=\"app-settings-header\"]/button")
    public WebElement settingsBtn;

    @FindBy(css = "#files-setting-richworkspace")
    public WebElement showRichByCss;

    @FindBy(css = "#quota")
    public WebElement storageBeforeUpload;

    @FindBy(css = ".button.new")
    public WebElement plusIconBtn;

     @FindBy (xpath = "//*[@id=\"controls\"]/div[2]/div[2]/ul/li[2]/a/span[2]")
    public WebElement newFolder;

    @FindBy (id= "view13-input-folder")
    public WebElement newFolderName;

    @FindBy (xpath = "//*[@id=\"controls\"]/div[2]/div[2]/ul/li[2]/a/form/input[2]")
    public WebElement submitFolder;

    @FindBy (id="fileList")
    public WebElement folderTable;

    @FindBy(css = "#file_upload_start")
    public WebElement uploadFile1;

    public FilesPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }


}
