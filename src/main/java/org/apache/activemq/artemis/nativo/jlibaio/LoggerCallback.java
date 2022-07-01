/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.activemq.artemis.nativo.jlibaio;


/** I am keeping Artemis Native Log Free, so it will be simpler to compile it, especially on the include bits.
 *  If you want the NativeLogger redirected to any framework you can use the method NativeLogger.setCallback(LoggerCallback) on your
 *  usage implementation*/
public interface LoggerCallback {

   void info(String message);

   void warn(String message);

   void warn(String message, Throwable e);

   void debug(String message);

   void debug(String message, Throwable e);
}
