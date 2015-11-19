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

import org.niaouli.exception.AppException;
import org.niaouli.validation.Validation;

/**
 *
 * @author Arnaud Rolly <github@niaouli.org>
 */
public class GroupBuilder {

    private String sysName;
    private String description;

    public GroupBuilder() {

    }

    public GroupBuilder(final Group pGroup) {
        sysName = pGroup.getSysName();
        description = pGroup.getDescription();
    }

    public final Group build() throws AppException {
        Validation validation = new Validation();
        validation.verifyThat(sysName).inField("sysName").isNotBlank();
        validation.finish();
        return new Group(this);
    }

    public final String getSysName() {
        return sysName;
    }

    public final void setSysName(final String pSysName) {
        sysName = pSysName;
    }

    public final String getDescription() {
        return description;
    }

    public final void setDescription(final String pDescription) {
        description = pDescription;
    }

}
