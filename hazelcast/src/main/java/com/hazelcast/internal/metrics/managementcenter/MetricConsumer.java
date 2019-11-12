/*
 * Copyright (c) 2008-2019, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.internal.metrics.managementcenter;

import com.hazelcast.internal.metrics.MetricDescriptor;

/**
 * An interface that allows consuming keys and primitive values
 * stored in {@link Metric} objects.
 *
 * @see Metric#provide(MetricConsumer)
 */
public interface MetricConsumer {

    /**
     * Called when the Metric contains a {@code long} value.
     *
     * @param descriptor  metric descriptor
     * @param value       metric value
     */
    void consumeLong(MetricDescriptor descriptor, long value);

    /**
     * Called when the Metric contains a {@code double} value.
     *
     * @param descriptor  metric descriptor
     * @param value       metric value
     */
    void consumeDouble(MetricDescriptor descriptor, double value);

}