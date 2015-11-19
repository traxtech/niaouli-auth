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

/**
 *
 * @author Arnaud Rolly <github@niaouli.org>
 */
public class Person implements Serializable {

    private final String sysName;
    private final String description;
    private final String fullName;
    // First name
    private final String givenName;
    // Last name
    private final String surname;
    private final String email;
    private final String telephone;
    private final String mobile;
    private final String orgUnitName;

    protected Person(final PersonBuilder pBuilder) {
        sysName = pBuilder.getSysName();
        description = pBuilder.getDescription();
        fullName = pBuilder.getFullName();
        givenName = pBuilder.getGivenName();
        surname = pBuilder.getSurname();
        email = pBuilder.getEmail();
        telephone = pBuilder.getTelephone();
        mobile = pBuilder.getMobile();
        orgUnitName = pBuilder.getOrgUnitName();
    }

    public final String getDescription() {
        return description;
    }

    public final String getFullName() {
        return fullName;
    }

    public final String getGivenName() {
        return givenName;
    }

    public final String getSurname() {
        return surname;
    }

    public final String getEmail() {
        return email;
    }

    public final String getTelephone() {
        return telephone;
    }

    public final String getMobile() {
        return mobile;
    }

    public final String getSysName() {
        return sysName;
    }

    public final String getOrgUnitName() {
        return orgUnitName;
    }

    @Override
    public final String toString() {
        return "Person{" + "sysName=" + sysName + ", description=" + description + ", fullName=" + fullName + ", givenName=" + givenName + ", surname=" + surname + ", email=" + email + ", telephone=" + telephone + ", mobile=" + mobile + ", orgUnitName=" + orgUnitName + '}';
    }

}
