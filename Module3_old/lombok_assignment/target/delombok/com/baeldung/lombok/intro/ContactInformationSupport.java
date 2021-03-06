// Generated by delombok at Tue Jun 29 20:53:44 EDT 2021
package com.baeldung.lombok.intro;

public class ContactInformationSupport implements HasContactInformation {
    private String firstName;
    private String lastName;
    private String phoneNr;

    @Override
    public String getFullName() {
        return getFirstName() + " " + getLastName();
    }

    @SuppressWarnings("all")
    public ContactInformationSupport() {
    }

    @SuppressWarnings("all")
    public String getFirstName() {
        return this.firstName;
    }

    @SuppressWarnings("all")
    public String getLastName() {
        return this.lastName;
    }

    @SuppressWarnings("all")
    public String getPhoneNr() {
        return this.phoneNr;
    }

    @SuppressWarnings("all")
    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    @SuppressWarnings("all")
    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    @SuppressWarnings("all")
    public void setPhoneNr(final String phoneNr) {
        this.phoneNr = phoneNr;
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ContactInformationSupport)) return false;
        final ContactInformationSupport other = (ContactInformationSupport) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$firstName = this.getFirstName();
        final Object other$firstName = other.getFirstName();
        if (this$firstName == null ? other$firstName != null : !this$firstName.equals(other$firstName)) return false;
        final Object this$lastName = this.getLastName();
        final Object other$lastName = other.getLastName();
        if (this$lastName == null ? other$lastName != null : !this$lastName.equals(other$lastName)) return false;
        final Object this$phoneNr = this.getPhoneNr();
        final Object other$phoneNr = other.getPhoneNr();
        if (this$phoneNr == null ? other$phoneNr != null : !this$phoneNr.equals(other$phoneNr)) return false;
        return true;
    }

    @SuppressWarnings("all")
    protected boolean canEqual(final Object other) {
        return other instanceof ContactInformationSupport;
    }

    @Override
    @SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $firstName = this.getFirstName();
        result = result * PRIME + ($firstName == null ? 43 : $firstName.hashCode());
        final Object $lastName = this.getLastName();
        result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
        final Object $phoneNr = this.getPhoneNr();
        result = result * PRIME + ($phoneNr == null ? 43 : $phoneNr.hashCode());
        return result;
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
        return "ContactInformationSupport(firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", phoneNr=" + this.getPhoneNr() + ")";
    }
}
