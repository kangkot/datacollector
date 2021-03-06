/**
 * Copyright 2016 StreamSets Inc.
 *
 * Licensed under the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.streamsets.datacollector.main;

import com.streamsets.datacollector.restapi.bean.UserJson;
import org.eclipse.jetty.security.LoginService;

import java.security.Principal;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface UserGroupManager {
  public static final String ALL_GROUP = "all";

  void setLoginService(LoginService hashLoginService);

  void setRoleMapping(Map<String, Set<String>> roleMapping);

  List<UserJson> getUsers();

  List<String> getGroups();

  UserJson getUser(Principal principal);
}
