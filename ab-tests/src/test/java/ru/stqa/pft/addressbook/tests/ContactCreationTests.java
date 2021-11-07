package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    app.getNavigationHelper().gotoContactPage();
    app.fillContactForm(new ContactData("testName", "testName", "testAddress", "87771234567", "test@test.com"));
    app.submitContactCreation();
    app.returnToHomePage();
  }

}
