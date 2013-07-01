/*
 * Copyright 2008-2009 the original author or authors.
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
package org.demo.webapps.listener;
import org.moreframework.event.EventListener;
import org.moreframework.event.Listener;
import org.moreframework.security.support.SecurityEventDefine;
/**
 * 
 * @version : 2013-5-9
 * @author ������ (zyc@byshell.org)
 */
@EventListener({ SecurityEventDefine.Login })
public class SafetyListener implements Listener {
    @Override
    public void onEvent(String event, Object[] params) {
        System.out.println(event);
    }
}