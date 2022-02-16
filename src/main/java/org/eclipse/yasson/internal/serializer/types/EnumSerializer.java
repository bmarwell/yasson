/*
 * Copyright (c) 2021, 2022 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

package org.eclipse.yasson.internal.serializer.types;

import jakarta.json.stream.JsonGenerator;

import org.eclipse.yasson.internal.SerializationContextImpl;

/**
 * Serializer of the {@link Enum} types.
 */
class EnumSerializer extends TypeSerializer<Enum<?>> {

    EnumSerializer(TypeSerializerBuilder serializerBuilder) {
        super(serializerBuilder);
    }

    @Override
    void serializeValue(Enum<?> value, JsonGenerator generator, SerializationContextImpl context) {
        generator.write(value.name());
    }

    @Override
    void serializeKey(Enum<?> key, JsonGenerator generator, SerializationContextImpl context) {
        generator.writeKey(key.name());
    }
}
