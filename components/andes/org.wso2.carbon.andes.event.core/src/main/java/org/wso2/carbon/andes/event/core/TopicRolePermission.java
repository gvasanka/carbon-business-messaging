/*
 * Copyright 2004,2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.carbon.andes.event.core;

public class TopicRolePermission {

    private String roleName;
    private boolean isAllowedToSubscribe;
    private boolean isAllowedToPublish;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public boolean isAllowedToSubscribe() {
        return isAllowedToSubscribe;
    }

    public void setAllowedToSubscribe(boolean allowedToSubscribe) {
        isAllowedToSubscribe = allowedToSubscribe;
    }

    public boolean isAllowedToPublish() {
        return isAllowedToPublish;
    }

    public void setAllowedToPublish(boolean allowedToPublish) {
        isAllowedToPublish = allowedToPublish;
    }
}
