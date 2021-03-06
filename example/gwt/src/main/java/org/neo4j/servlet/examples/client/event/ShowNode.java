/**
 * Copyright (c) 2002-2011 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.servlet.examples.client.event;

import com.google.gwt.event.shared.GwtEvent;
import org.neo4j.servlet.examples.client.ClientNode;

/**
 * @author tbaum
 * @since 14.05.11 17:00
 */
public class ShowNode extends GwtEvent<ShowNodeHandler> {
// ------------------------------ FIELDS ------------------------------

    public static Type<ShowNodeHandler> TYPE = new Type<ShowNodeHandler>();
    private final ClientNode node;

// --------------------------- CONSTRUCTORS ---------------------------

    public ShowNode(final ClientNode node) {
        this.node = node;
    }

// --------------------- GETTER / SETTER METHODS ---------------------

    public ClientNode getNode() {
        return node;
    }

// -------------------------- OTHER METHODS --------------------------

    protected void dispatch(ShowNodeHandler handler) {
        handler.onShowNode(this);
    }

    public Type<ShowNodeHandler> getAssociatedType() {
        return TYPE;
    }
}
