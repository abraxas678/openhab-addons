/*
 * Copyright (c) 2010-2025 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.insteon.internal.transport.message;

import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * The {@link Priority} represents a message priority
 *
 * @author Jeremy Setton - Initial contribution
 */
@NonNullByDefault
public enum Priority {
    RETRANSMIT,
    COMMAND,
    TRIGGER_POLL,
    STANDARD_POLL,
    DATABASE,
    NULL
}
