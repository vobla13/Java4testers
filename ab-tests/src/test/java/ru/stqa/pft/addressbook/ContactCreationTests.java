package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
    gotoContactPage();
    fillContactForm(new ContactData("testName", "testName", "testAddress", "87771234567", "test@test.com"));
    submitContactCreation();
    returnToHomePage();
  }

}
