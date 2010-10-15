/**
 * Copyright (c) 2010, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name of the "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.jooq.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;

class PlainSQLField extends FieldImpl<Object> {

    /**
     * Generated UID
     */
    private static final long serialVersionUID = 6937002867156868761L;
    private final String      sql;
    private final Object[]    bindings;

    PlainSQLField(String sql, Object[] bindings) {
        super("", Object.class);

        this.sql = sql;
        this.bindings = (bindings == null) ? new Object[0] : bindings;

        checkArguments(sql, bindings);
    }

    static void checkArguments(String sql, Object[] bindings) {
        // This comparison is a bit awkward, and probably not very precise...
        if (StringUtils.countMatches(sql, "?") != bindings.length) {
            throw new IllegalArgumentException(
                "The number of bind variables must match the number of bindings. " +
                "SQL = [" + sql + "], bindings.length = " + bindings.length);
        }
    }

    @Override
    public final String toSQLReference(boolean inlineParameters) {
        String result = sql;

        if (inlineParameters) {
            for (Object binding : bindings) {
                result = result.replaceFirst("\\?", FieldTypeHelper.toSQL(binding, inlineParameters));
            }
        }

        return result;
    }

    @Override
    public final int bind(PreparedStatement stmt, int initialIndex) throws SQLException {
        for (Object binding : bindings) {
            Class<?> type = (binding == null) ? Object.class : binding.getClass();
            bind(stmt, initialIndex++, type, binding);
        }

        return initialIndex;
    }
}