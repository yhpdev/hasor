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
package net.hasor.rsf.center.server.push.processor;
import net.hasor.core.Singleton;
import net.hasor.rsf.address.InterAddress;
import net.hasor.rsf.center.server.push.PushEvent;
import net.hasor.rsf.center.server.push.PushProcessor;
/**
 * 推送默认参数级路由规则。参数级路由是指：服务的路由策略可以细分到服务方法的参数上，例如根据userID散列不用的服务调用地址
 * 说明：推送服务的路由规则给RSF客户端，该路由策略会影响到RSF客户端上所有订阅的服务。
 * @see net.hasor.rsf.center.server.push.RsfCenterPushEventEnum#UpdateDefaultArgsRouteEvent
 * @version : 2016年3月24日
 * @author 赵永春(zyc@hasor.net)
 */
@Singleton
public class UpdateDefaultArgsProcessor extends PushProcessor {
    @Override
    public void doProcessor(InterAddress rsfAddress, PushEvent event) throws Throwable {
        // TODO Auto-generated method stub
    }
}