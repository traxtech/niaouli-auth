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
public class Group implements Serializable {

    private final String sysName;
    private final String description;

    protected Group(final GroupBuilder pBuilder) {
        sysName = pBuilder.getSysName();
        description = pBuilder.getDescription();
    }

    public final String getSysName() {
        return sysName;
    }

    public final String getDescription() {
        return description;
    }

    @Override
    public final String toString() {
        return "Group{" + "sysName=" + sysName + ", description=" + description + '}';
    }
}
