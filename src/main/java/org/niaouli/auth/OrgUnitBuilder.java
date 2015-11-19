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
public class OrgUnitBuilder {

    private String name;
    private String description;
    private String parentName;

    public final OrgUnit build() throws AppException {
        Validation validation = new Validation();
        validation.verifyThat(name).inField("name").isNotBlank();
        validation.finish();
        return new OrgUnit(this);
    }

    public final String getName() {
        return name;
    }

    public final void setName(final String pName) {
        name = pName;
    }

    public final String getDescription() {
        return description;
    }

    public final void setDescription(final String pDescription) {
        description = pDescription;
    }

    public final String getParentName() {
        return parentName;
    }

    public final void setParentName(final String pParentName) {
        parentName = pParentName;
    }

}
