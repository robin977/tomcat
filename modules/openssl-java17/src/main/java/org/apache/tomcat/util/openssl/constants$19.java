/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// Generated by jextract

package org.apache.tomcat.util.openssl;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.CLinker.*;
class constants$19 {

    static final FunctionDescriptor SSL_CTX_get_client_CA_list$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle SSL_CTX_get_client_CA_list$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_CTX_get_client_CA_list",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$19.SSL_CTX_get_client_CA_list$FUNC, false
    );
    static final FunctionDescriptor SSL_CTX_add_client_CA$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER,
        C_POINTER
    );
    static final MethodHandle SSL_CTX_add_client_CA$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_CTX_add_client_CA",
        "(Ljdk/incubator/foreign/MemoryAddress;Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$19.SSL_CTX_add_client_CA$FUNC, false
    );
    static final FunctionDescriptor SSL_set_connect_state$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle SSL_set_connect_state$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_set_connect_state",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$19.SSL_set_connect_state$FUNC, false
    );
    static final FunctionDescriptor SSL_set_accept_state$FUNC = FunctionDescriptor.ofVoid(
        C_POINTER
    );
    static final MethodHandle SSL_set_accept_state$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_set_accept_state",
        "(Ljdk/incubator/foreign/MemoryAddress;)V",
        constants$19.SSL_set_accept_state$FUNC, false
    );
    static final FunctionDescriptor SSL_get_privatekey$FUNC = FunctionDescriptor.of(C_POINTER,
        C_POINTER
    );
    static final MethodHandle SSL_get_privatekey$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_get_privatekey",
        "(Ljdk/incubator/foreign/MemoryAddress;)Ljdk/incubator/foreign/MemoryAddress;",
        constants$19.SSL_get_privatekey$FUNC, false
    );
    static final FunctionDescriptor SSL_get_shutdown$FUNC = FunctionDescriptor.of(C_INT,
        C_POINTER
    );
    static final MethodHandle SSL_get_shutdown$MH = RuntimeHelper.downcallHandle(
        openssl_h.LIBRARIES, "SSL_get_shutdown",
        "(Ljdk/incubator/foreign/MemoryAddress;)I",
        constants$19.SSL_get_shutdown$FUNC, false
    );
}

