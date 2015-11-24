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

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Arnaud Rolly <github@niaouli.org>
 */
public class Permission {

    private final Set<String> allowedPersons;
    private final Set<String> allowedGroups;
    private final Set<String> allowedOrgUnits;

    protected Permission(final PermissionBuilder pBuilder) {
        allowedPersons = new HashSet<String>(pBuilder.getAllowedPersons());
        allowedGroups = new HashSet<String>(pBuilder.getAllowedGroups());
        allowedOrgUnits = new HashSet<String>(pBuilder.getAllowedOrgUnits());
    }

    public Set<String> getAllowedPersons() {
        return Collections.unmodifiableSet(allowedPersons);
    }

    public Set<String> getAllowedGroups() {
        return Collections.unmodifiableSet(allowedGroups);
    }

    public Set<String> getAllowedOrgUnits() {
        return Collections.unmodifiableSet(allowedOrgUnits);
    }

}
