/**
 * Copyright 2015 StreamSets Inc.
 *
 * Licensed under the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.streamsets.pipeline.stage.origin.redis;

import com.streamsets.pipeline.api.ErrorCode;
import com.streamsets.pipeline.api.GenerateResourceBundle;

@GenerateResourceBundle
public enum Errors implements ErrorCode {

  REDIS_01("Failed to create Redis client: {}. {}"),
  REDIS_02("Failed to subscribe channel: {}. {}"),
  REDIS_03("Cannot parse record from message '{}': {}"),
  REDIS_04("Missing Channels or Pattern"),;
  private final String msg;

  Errors(String msg) {
    this.msg = msg;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getCode() {
    return name();
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public String getMessage() {
    return msg;
  }
}
