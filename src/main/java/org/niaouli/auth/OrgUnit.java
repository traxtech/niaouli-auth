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
public class OrgUnit implements Serializable {

    private final String name;
    private final String description;
    private final String parentName;

    protected OrgUnit(final OrgUnitBuilder pBuilder) {
        name = pBuilder.getName();
        description = pBuilder.getDescription();
        parentName = pBuilder.getParentName();
    }

    public final String getName() {
        return name;
    }

    public final String getDescription() {
        return description;
    }

    public final String getParentName() {
        return parentName;
    }

    @Override
    public final String toString() {
        return "OrgUnit{" + "name=" + name + ", description=" + description + ", parentName=" + parentName + '}';
    }

}
