/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2016, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 *
 */

package org.mobicents.servlet.restcomm.identity.exceptions;

/**
 * Thrown when a keycloak Client registration fails for an unknown reason.
 *
 * @author Orestis Tsakiridis
 */
public class IdentityClientRegistrationError extends Exception {
    public enum Reason {CLIENT_ALREADY_THERE}
    Reason reason;

    public IdentityClientRegistrationError() {
    }

    public IdentityClientRegistrationError(String s) {
        super(s);
    }

    public IdentityClientRegistrationError(String s, Throwable throwable) {
        super(s, throwable);
    }

    public IdentityClientRegistrationError(String s, Reason reason) {
        super(s);
        this.reason = reason;
    }

    public Reason getReason() {
        return reason;
    }
}
