/*
 * Copyright (c) 2008, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package org.glassfish.grizzly.http.server;

/**
 * The listener, which could be registered on a {@link Request} using
 * {@link Request#addAfterServiceListener(org.glassfish.grizzly.http.server.AfterServiceListener)} and be notified once
 * the {@link Request} processing will be completed.
 *
 * @author Alexey Stashok
 *
 * @see Request
 */
public interface AfterServiceListener {
    /**
     * The method will be called once the {@link Request} processing will be completed.
     * 
     * @param request the {@link Request}.
     */
    void onAfterService(Request request);
}
