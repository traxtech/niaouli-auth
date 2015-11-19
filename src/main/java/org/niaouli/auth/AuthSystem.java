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

import java.util.Collection;
import java.util.Map;
import org.niaouli.exception.AppException;

/**
 * Interface to an authentication system.
 *
 * @author Arnaud Rolly <github@niaouli.org>
 */
public interface AuthSystem {

    /**
     * Configure the access to the authentication system.
     *
     * @param props key values map, dependant on the implementation.
     * @throws AppException On interal error.
     */
    void configure(Map<String, String> props) throws AppException;

    /**
     * Checks that the access to the authentication system is healthy.
     *
     * @return Health check result.
     */
    boolean checkHealth();

    /**
     * Verifies the credentials of a user.
     *
     * @param sysName System name (login) of the user.
     * @param password Corresponding password.
     * @return Credentials validity.
     * @throws AppException On internal error.
     */
    boolean checkCredentials(String sysName, char[] password) throws AppException;

    /**
     * Load a person given its system name.
     *
     * @param sysName System name of the person to load.
     * @return The person corresponding to the system name.
     * @throws AppException On internal error, of if the person is not found
     * (error with key 'authSystem.user.notFound').
     */
    Person loadPerson(String sysName) throws AppException;

    /**
     * Find all the persons.
     *
     * @return All the persons.
     * @throws AppException On internal error.
     */
    Collection<Person> findPersons() throws AppException;

    /**
     * Checks if the authentication system can create or update a person.
     *
     * @return Check result.
     */
    boolean canCreateOrUpdatePerson();

    /**
     * Checks if the authentication system can update a person password.
     *
     * @return Check result.
     */
    boolean canUpdatePassword();

    /**
     * Creates a new person.
     *
     * @param person Person to create.
     * @throws AppException On internal error
     */
    void createPerson(Person person) throws AppException;

    void updatePerson(Person person) throws AppException;

    void updatePersonPassword(String sysName, char[] password) throws AppException;

    Group loadGroup(String sysName) throws AppException;

    Collection<Group> findGroups() throws AppException;

    boolean canCreateOrUpdateGroup();

    void createGroup(Group group) throws AppException;

    void updateGroup(Group group) throws AppException;

    OrgUnit loadOrgUnit(String name) throws AppException;

    Collection<OrgUnit> findOrgUnits() throws AppException;

    boolean canCreateOrUpdateOrgUnit();

    void createOrgUnit(OrgUnit orgUnit) throws AppException;

    void updateOrgUnit(OrgUnit orgUnit) throws AppException;
}
