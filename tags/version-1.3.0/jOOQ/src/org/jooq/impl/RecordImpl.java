/**
 * Copyright (c) 2009, Lukas Eder, lukas.eder@gmail.com
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

import java.util.LinkedHashMap;
import java.util.Map;

import org.jooq.Field;
import org.jooq.FieldList;
import org.jooq.Record;
import org.jooq.Result;

/**
 * @author Lukas Eder
 */
public class RecordImpl implements Record {

	private final Result result;
	private final Map<Field<?>, Object> values;

	public RecordImpl(Result result) {
		this.result = result;
		this.values = new LinkedHashMap<Field<?>, Object>();
	}

	@Override
	public FieldList getFields() {
		return result.getFields();
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getValue(Field<T> field) throws IllegalArgumentException {
		if (!values.containsKey(field)) {
			throw new IllegalArgumentException("Field " + field + " is not contained in Record");
		}

		return (T) values.get(field);
	}

	@Override
	public final <T> T getValue(Field<T> field, T defaultValue) throws IllegalArgumentException {
		T value = getValue(field);

		if (value == null) {
			value = defaultValue;
		}

		return value;
	}

	@Override
	public <T> void setValue(Field<T> field, T value) {
		values.put(field, value);
	}

	@Override
	public String toString() {
		return "RecordImpl [values=" + values + "]";
	}
}