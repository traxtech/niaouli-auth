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
import java.util.HashSet;
import java.util.Set;
import org.niaouli.exception.AppException;

/**
 * Permission builder.
 *
 * @author Arnaud Rolly <github@niaouli.org>
 */
public class PermissionBuilder implements Serializable {

  /**
   * Allowed persons.
   */
  private Set<String> allowedPersons = new HashSet<String>();
  /**
   * Allowed groups.
   */
  private Set<String> allowedGroups = new HashSet<String>();
  /**
   * Allowed organizational units.
   */
  private Set<String> allowedOrgUnits = new HashSet<String>();

  /**
   * Build the permission.
   *
   * @return New permission.
   * @throws AppException On invalid data.
   */
  public final Permission build() throws AppException {
    return new Permission(this);
  }

  public final Set<String> getAllowedPersons() {
    return allowedPersons;
  }

  public final void setAllowedPersons(final Set<String> pAllowedPersons) {
    if (pAllowedPersons == null) {
      allowedPersons = null;
    } else {
      allowedPersons = new HashSet<String>(pAllowedPersons);
    }
  }

  public final Set<String> getAllowedGroups() {
    return allowedGroups;
  }

  public final void setAllowedGroups(final Set<String> pAllowedGroups) {
    if (pAllowedGroups == null) {
      allowedGroups = null;
    } else {
      allowedGroups = new HashSet<String>(pAllowedGroups);
    }
  }

  public final Set<String> getAllowedOrgUnits() {
    return allowedOrgUnits;
  }

  public final void setAllowedOrgUnits(final Set<String> pAllowedOrgUnits) {
    if (pAllowedOrgUnits == null) {
      allowedOrgUnits = null;
    } else {
      allowedOrgUnits = new HashSet<String>(pAllowedOrgUnits);
    }
  }

}
