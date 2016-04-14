/*
Copyright (c) 2016 Red Hat, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.ovirt.engine.sdk;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SimpleTest extends ServerTest {
    @Before
    public void setUp() {
        startServer();
    }

    @After
    public void tearDown() {
        stopServer();
    }

    /**
     * Checks that creating and closing a connection works correctly.
     */
    @Test
    public void testCreateConnection() throws Exception {
        Connection connection = testConnection();
        connection.close();
    }
}
