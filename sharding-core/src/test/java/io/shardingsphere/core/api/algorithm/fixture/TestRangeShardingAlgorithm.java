/*
 * Copyright 2016-2018 shardingsphere.io.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.shardingsphere.core.api.algorithm.fixture;

import io.shardingsphere.core.api.algorithm.sharding.RangeShardingValue;
import io.shardingsphere.core.api.algorithm.sharding.standard.RangeShardingAlgorithm;
import io.shardingsphere.core.parsing.parser.sql.SQLStatement;

import java.util.ArrayList;
import java.util.Collection;

public final class TestRangeShardingAlgorithm implements RangeShardingAlgorithm<String> {
    
    @Override
    public Collection<String> doSharding(final Collection<String> availableTargetNames, final RangeShardingValue<String> shardingValue) {
        Collection<String> result = new ArrayList<>();
        for (Integer i = Integer.parseInt(shardingValue.getValueRange().lowerEndpoint()); i <= Integer.parseInt(shardingValue.getValueRange().upperEndpoint()); i++) {
            result.add(i.toString());
        }
        return result;
    }

    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames, RangeShardingValue<String> shardingValue, SQLStatement sqlStatement) {
        Collection<String> result = new ArrayList<>();
        for (Integer i = Integer.parseInt(shardingValue.getValueRange().lowerEndpoint()); i <= Integer.parseInt(shardingValue.getValueRange().upperEndpoint()); i++) {
            result.add(i.toString());
        }
        return result;
    }
}
