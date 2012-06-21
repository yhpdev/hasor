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
package org.more.services.remote.objects;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.more.hypha.ApplicationContext;
import org.more.services.remote.RmiBeanCreater;
import org.more.services.remote.RmiBeanDirectory;
import org.more.services.remote.assembler.creater.HyphaRmiBeanCreater;
/**
 * 
 * @version : 2011-8-16
 * @author ������ (zyc@byshell.org)
 */
public class HyphaRmiBeanDirectory implements RmiBeanDirectory {
    public ApplicationContext applicationContext = null;
    public Map<String, RmiBeanCreater> getCreaterMap() throws Throwable {
        List<String> ids = applicationContext.getBeanDefinitionIDs();
        Map<String, RmiBeanCreater> map = new HashMap<String, RmiBeanCreater>();
        for (String id : ids)
            map.put(id, new HyphaRmiBeanCreater(id, applicationContext));
        return map;
    }
}