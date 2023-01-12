/*
 *
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.dinky.gateway.config;

/**
 * SavePointStrategy
 *
 * @author wenmo
 * @since 2021/11/23 10:28
 */
public enum SavePointStrategy {
    NONE(0),
    LATEST(1),
    EARLIEST(2),
    CUSTOM(3);

    private Integer value;

    SavePointStrategy(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static SavePointStrategy get(Integer value) {
        for (SavePointStrategy type : SavePointStrategy.values()) {
            if (type.getValue() == value) {
                return type;
            }
        }
        return SavePointStrategy.NONE;
    }
}
