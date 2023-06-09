package com.pages.HomePages;

import com.pages.BasePage;
import com.pages.ProductCategoryPathPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public class MiddleMenuNaviPage extends BasePage {

    public MiddleMenuNaviPage() throws IOException {
        super();
    }

    @FindBy(css = ".prdocutname")
    public List<WebElement> productNameList;
    @FindBy(xpath = "//*[@id=\"categorymenu\"]/nav/ul/li/a")
    public List<WebElement> catMenuList;
    @FindBy(xpath = "//*[@id=\"categorymenu\"]/nav/ul/li/div/ul/li/a")
    public List<WebElement> catAndSubMenuList;

    @FindBy(css = ".active.menu_home")
    public List<WebElement> homeDropdrownBtn;

    @FindBy(xpath = "//*[@id=\"categorymenu\"]/nav/ul/li[2]/a")
    public List<WebElement> apparelAccessoriesDropdownBtn;

    @FindBy(xpath = "//*[@id=\"categorymenu\"]/nav/ul/li[3]/a")
    public List<WebElement> makeupDropdownBtn;

    @FindBy(xpath = "//*[@id=\"categorymenu\"]/nav/ul/li[4]/a")
    public List<WebElement> skincareDropdownBtn;

    @FindBy(xpath = "//*[@id=\"categorymenu\"]/nav/ul/li[5]/a")
    public List<WebElement> fragranceDropdownBtn;

    @FindBy(xpath = "//*[@id=\"categorymenu\"]/nav/ul/li[6]/a")
    public List<WebElement> menDropdownBtn;

    @FindBy(xpath = "//*[@id=\"categorymenu\"]/nav/ul/li[7]/a")
    public List<WebElement> hairCareDropdownBtn;

    @FindBy(xpath = "//*[@id=\"categorymenu\"]/nav/ul/li[8]/a")
    public List<WebElement> booksDropdownBtn;


    @FindBy(css = ".block_frame_featured .maintext")
    private WebElement featured;

    @FindBy(css = ".product-product")
    private WebElement latestProducts;

    @FindBy(xpath = "//span[normalize-space()='Bestsellers']")
    private WebElement bestsellers;

    public List<WebElement> getProductNameList() {
        return productNameList;
    }
    public List<WebElement> getCatMenuList() {
        return catMenuList;
    }

    public List<WebElement> getCatAndSubMenuList() {
        return catAndSubMenuList;

    }

    public WebElement getFeatured() {
        return featured;
    }

    public WebElement getLatestProducts() {
        return latestProducts;
    }

    public WebElement getBestsellers() {
        return bestsellers;
    }

    public void clickOnHomeSubMenuListName(String homeDropdrownName) {
        List<WebElement> subMenuListNames = homeDropdrownBtn;
        Iterator<WebElement> itr = subMenuListNames.iterator();
        while (itr.hasNext()) {
            WebElement c = itr.next();
            String text = c.getText().trim().toString();
            if (text.equals(homeDropdrownName)) {
                log.info("selecting date as: " + homeDropdrownName);
                c.click();
                break;
            }
        }
    }

    public void clickOnMakeupSubMenuListName(String apparelAccessoriesDropdrownName) {
        List<WebElement> subMenuListNames = apparelAccessoriesDropdownBtn;
        Iterator<WebElement> itr = subMenuListNames.iterator();
        while (itr.hasNext()) {
            WebElement c = itr.next();
            String text = c.getText().trim().toString();
            if (text.equals(apparelAccessoriesDropdrownName)) {
                log.info("selecting....: " + apparelAccessoriesDropdrownName);
                c.click();
                break;
            }
        }
    }
    public void clickOnApparelAccessoriesSubMenuListName(String makeupDropdrownName) {
        List<WebElement> subMenuListNames = makeupDropdownBtn;
        Iterator<WebElement> itr = subMenuListNames.iterator();
        while (itr.hasNext()) {
            WebElement c = itr.next();
            String text = c.getText().trim().toString();
            if (text.equals(makeupDropdrownName)) {
                log.info("selecting...: " + makeupDropdrownName);
                c.click();
                break;
            }
        }
    }

    public void clickOnSkinCareSubMenuListName(String skincareDropdrownName) {
        List<WebElement> subMenuListNames = skincareDropdownBtn;
        Iterator<WebElement> itr = subMenuListNames.iterator();
        while (itr.hasNext()) {
            WebElement c = itr.next();
            String text = c.getText().trim().toString();
            if (text.equals(skincareDropdrownName)) {
                log.info("selecting...: " + skincareDropdrownName);
                c.click();
                break;
            }
        }
    }

    public void clickOnFragranceSubMenuListName(String fragranceDropdrownName) {
        List<WebElement> subMenuListNames = fragranceDropdownBtn;
        Iterator<WebElement> itr = subMenuListNames.iterator();
        while (itr.hasNext()) {
            WebElement c = itr.next();
            String text = c.getText().trim().toString();
            if (text.equals(fragranceDropdrownName)) {
                log.info("selecting...: " + fragranceDropdrownName);
                c.click();
                break;
            }
        }
    }

    public void clickOnMenSubMenuListName(String menDropdrownName) {
        List<WebElement> subMenuListNames = menDropdownBtn;
        Iterator<WebElement> itr = subMenuListNames.iterator();
        while (itr.hasNext()) {
            WebElement c = itr.next();
            String text = c.getText().trim().toString();
            if (text.equals(menDropdrownName)) {
                log.info("selecting...: " + menDropdrownName);
                c.click();
                break;
            }
        }
    }

    public void clickOnHairCareSubMenuListName(String hairCareDropdrownName) {
        List<WebElement> subMenuListNames = menDropdownBtn;
        Iterator<WebElement> itr = subMenuListNames.iterator();
        while (itr.hasNext()) {
            WebElement c = itr.next();
            String text = c.getText().trim().toString();
            if (text.equals(hairCareDropdrownName)) {
                log.info("selecting...: " + hairCareDropdrownName);
                c.click();
                break;
            }
        }
    }

    public void clickOnBooksSubMenuListName(String booksDropdrownName) {
        List<WebElement> subMenuListNames = booksDropdownBtn;
        Iterator<WebElement> itr = subMenuListNames.iterator();
        while (itr.hasNext()) {
            WebElement c = itr.next();
            String text = c.getText().trim().toString();
            if (text.equals(booksDropdrownName)) {
                log.info("selecting...: " + booksDropdrownName);
                c.click();
                break;
            }
        }
    }

    public ProductCategoryPathPage clickOnMenu(WebElement element) throws IOException {
        log.info("clicking on : "+element.getText());
        waitForWebElementAndClick(element);
        return new ProductCategoryPathPage();
    }
    public ProductCategoryPathPage clickOnItem(String data) throws IOException {
        log.info("clicking on :"+data);
        WebElement item = getDriver().findElement(By.xpath("//*[contains(text(),'"+data+"')]"));
        waitForWebElementAndClick(item);
        return new ProductCategoryPathPage();
    }
}

