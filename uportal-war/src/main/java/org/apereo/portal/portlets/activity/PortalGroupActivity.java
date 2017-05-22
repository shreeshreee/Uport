/**
 * Licensed to Apereo under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright ownership. Apereo
 * licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the License at the
 * following location:
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apereo.portal.portlets.activity;

public class PortalGroupActivity implements Comparable<PortalGroupActivity> {
    private final String groupName;
    private int total;

    public PortalGroupActivity(String groupName, int total) {
        this.groupName = groupName;
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public String getGroupName() {
        return groupName;
    }

    public void incrementTotal(int count) {
        total += count;
    }

    @Override
    public int compareTo(PortalGroupActivity tuple) {
        // Natural order for these is count
        return Integer.valueOf(total).compareTo(tuple.getTotal());
    }
}
