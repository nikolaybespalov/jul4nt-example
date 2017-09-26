//
// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
//

package com.github.nikolaybespalov;

import java.io.IOException;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * An example of using the <tt>Windows Event Log Handler</tt>.
 *
 * @author <a href="mailto:nikolaybespalov@gmail.com">Nikolay Bespalov</a>
 */

public class WindowsEventLogHandlerExample {
    private static final Logger log = Logger.getGlobal();

    public static void main(String[] args) {
        try {
            LogManager.getLogManager().readConfiguration(WindowsEventLogHandler.class.getResourceAsStream("logging.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        log.info("Hello, World!");
    }
}
