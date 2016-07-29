/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.emc.logservice.contracts;

import java.io.InputStream;

/**
 * Contents for a ReadResultEntry.
 */
public class ReadResultEntryContents {
    private final int length;
    private final InputStream data;

    /**
     * Creates a new instance of the ReadResultEntryContents class.
     *
     * @param data                The data to retrieve.
     * @param length              The length of the retrieved data.
     */
    public ReadResultEntryContents(InputStream data, int length) {
        this.data = data;
        this.length = length;
    }

    /**
     * Gets a value indicating the length of the Data Stream.
     */
    public int getLength() {
        return this.length;
    }

    /**
     * Gets an InputStream representing the Data that was retrieved.
     *
     * @return
     */
    public InputStream getData() {
        return this.data;
    }

    @Override
    public String toString() {
        return String.format("Length = %d", getLength());
    }
}
