package org.adnroid.share.utils.contacts;

/**
 * 联系人的模型类.
 * @author Jack Tony
 * @date 2015/5/11
 */
public class ContactModel {

    private String contactName;

    private String phoneNumber;

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
