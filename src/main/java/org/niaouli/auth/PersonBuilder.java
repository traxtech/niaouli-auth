/**
 * This file is part of Niaouli Auth.
 *
 * Niaouli Auth is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * Niaouli Auth is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * Niaouli Auth. If not, see <http://www.gnu.org/licenses/>.
 */
package org.niaouli.auth;

import java.io.Serializable;
import org.niaouli.exception.AppException;
import org.niaouli.validation.Validation;

/**
 *
 * @author Arnaud Rolly <github@niaouli.org>
 */
public class PersonBuilder implements Serializable {

    private String sysName;
    private String description;
    private String fullName;
    // First name
    private String givenName;
    // Last name
    private String surname;
    private String email;
    private String telephone;
    private String mobile;
    private String orgUnitName;

    public PersonBuilder() {

    }

    public PersonBuilder(final Person pPerson) {
        sysName = pPerson.getSysName();
        description = pPerson.getDescription();
        fullName = pPerson.getFullName();
        givenName = pPerson.getGivenName();
        surname = pPerson.getSurname();
        email = pPerson.getEmail();
        telephone = pPerson.getTelephone();
        mobile = pPerson.getMobile();
        orgUnitName = pPerson.getOrgUnitName();
    }

    public Person build() throws AppException {
        Validation validation = new Validation();
        validation.verifyThat(sysName).inField("sysName").isNotBlank();
        validation.finish();
        return new Person(this);
    }

    public String getSysName() {
        return sysName;
    }

    public void setSysName(final String pSysName) {
        sysName = pSysName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String pDescription) {
        description = pDescription;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(final String pFullName) {
        fullName = pFullName;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(final String pGivenName) {
        givenName = pGivenName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String pSurname) {
        surname = pSurname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String pEmail) {
        email = pEmail;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(final String pTelephone) {
        telephone = pTelephone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(final String pMobile) {
        mobile = pMobile;
    }

    public String getOrgUnitName() {
        return orgUnitName;
    }

    public void setOrgUnitName(final String pOrgUnitName) {
        orgUnitName = pOrgUnitName;
    }

}
